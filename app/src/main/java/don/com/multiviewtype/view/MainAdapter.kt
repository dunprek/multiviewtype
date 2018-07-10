package don.com.multiviewtype.view

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.ag.printerqoe.model.printerList.DataItem
import com.squareup.picasso.Picasso
import don.com.multiviewtype.R
import don.com.multiviewtype.interfaces.OnLoadMoreListener

/**
 * Created by don on 7/10/2018.
 */

class MainAdapter(private val context: Context, private val data: List<DataItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val TYPE_PROGRESS = 0
    private val TYPE_LINEAR = 1
    private val TYPE_GRID = 2
    var isSwitchView = true



    internal var loadMoreListener: OnLoadMoreListener? = null
    internal var isLoading = false
    internal var isMoreDataAvailable = true


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(context)
        return if (viewType == TYPE_LINEAR) {
            LinearHolder(inflater.inflate(R.layout.item_list_printer_default, parent, false))
        } else if (viewType == TYPE_GRID) {
            GridHolder(inflater.inflate(R.layout.item_list_printer_grid, parent, false))
        } else {
            LoadHolder(inflater.inflate(R.layout.item_loadmore, parent, false))
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (position >= itemCount - 1 && isMoreDataAvailable && !isLoading && loadMoreListener != null) {
            isLoading = true
            loadMoreListener!!.onLoadMore()
        }

        if (getItemViewType(position) == TYPE_LINEAR) {
            (holder as LinearHolder).bindData(data[position], context)
        }

        if (getItemViewType(position) == TYPE_GRID) {
            (holder as GridHolder).bindData(data[position], context)
        }


    }

    override fun getItemViewType(position: Int): Int {
        return if (data[position].type.equals("load")) {
            TYPE_PROGRESS
        } else {
            if (isSwitchView) {
                TYPE_LINEAR
            } else {
                TYPE_GRID
            }

        }
    }


    override fun getItemCount(): Int {
        return data.size
    }


    private class LinearHolder(view: View) : RecyclerView.ViewHolder(view) {
        internal var tvName: TextView
        internal var tvCity: TextView
        internal var tvType: TextView
        internal var tvBw: TextView
        internal var tvColor: TextView
        internal var iv: ImageView

        init {
            tvName = itemView.findViewById(R.id.tv_printer_name) as TextView
            tvCity = itemView.findViewById(R.id.tv_printer_city) as TextView
            tvType = itemView.findViewById(R.id.tv_printer_type) as TextView
            tvBw = itemView.findViewById(R.id.tv_printer_bw) as TextView
            tvColor = itemView.findViewById(R.id.tv_printer_color) as TextView
            iv = itemView.findViewById(R.id.iv_printer) as ImageView

        }

        fun bindData(item: DataItem, context: Context) {
            tvName.text = item.merchant!!.location.district?.name + ", " + item.merchant.location.city?.name
            tvCity.text = item.merchant!!.address
//        +" "+item.merchant.address
            tvType.text = item.quantity.toString() + " unit " + item.name
            tvBw.text = "Rp " + item.bwPrice.toString() + "/halaman"
            tvColor.text = "Rp " + item.colorPrice.toString() + "/halaman"
            //image picasso
            Picasso.with(context)
                    .load(item.imageUrl)
                    .placeholder(R.drawable.ic_launcher_background)
                    .resize(200, 200)
                    .into(iv)

        }
    }

    private class GridHolder(view: View) : RecyclerView.ViewHolder(view) {
        internal var tvName: TextView
        internal var tvCity: TextView
        internal var tvType: TextView
        internal var tvBw: TextView
        internal var tvColor: TextView
        internal var iv: ImageView

        init {
            tvName = itemView.findViewById(R.id.tv_printer_name) as TextView
            tvCity = itemView.findViewById(R.id.tv_printer_city) as TextView
            tvType = itemView.findViewById(R.id.tv_printer_type) as TextView
            tvBw = itemView.findViewById(R.id.tv_printer_bw) as TextView
            tvColor = itemView.findViewById(R.id.tv_printer_color) as TextView
            iv = itemView.findViewById(R.id.iv_printer) as ImageView

        }

        fun bindData(item: DataItem, context: Context) {
            tvName.text = item.merchant!!.location.district?.name + ", " + item.merchant.location.city?.name
            tvCity.text = item.merchant!!.address
//        +" "+item.merchant.address
            tvType.text = item.quantity.toString() + " unit " + item.name
            tvBw.text = "Rp " + item.bwPrice.toString() + "/halaman"
            tvColor.text = "Rp " + item.colorPrice.toString() + "/halaman"
            //image picasso
            Picasso.with(context)
                    .load(item.imageUrl)
                    .placeholder(R.drawable.ic_launcher_background)
                    .resize(200, 200)
                    .into(iv)

        }
    }


    private class LoadHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView)

    fun setMoreDataAvailable(moreDataAvailable: Boolean) {
        isMoreDataAvailable = moreDataAvailable
    }

    fun notifyDataChanged() {
        notifyDataSetChanged()
        isLoading = false
    }

    fun setLoadMoreListener(loadMoreListener: OnLoadMoreListener) {
        this.loadMoreListener = loadMoreListener
    }

    fun toggleItemViewType(): Boolean {
        isSwitchView = !isSwitchView
        return isSwitchView
    }

}