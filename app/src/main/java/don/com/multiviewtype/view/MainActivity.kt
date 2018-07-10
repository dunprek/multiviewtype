package don.com.multiviewtype.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import com.ag.printerqoe.model.printerList.DataItem
import don.com.multiviewtype.R
import don.com.multiviewtype.base.BaseActivity
import don.com.multiviewtype.helper.Constant
import don.com.multiviewtype.interfaces.OnLoadMoreListener
import don.com.multiviewtype.model.BaseMdl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), MainView {
    //declare list  menu item which is changing with grid item
    private lateinit var list: MenuItem

    //declare grid  menu item which is changing with list item
    private lateinit var grid: MenuItem

    var isSwitched = true


    lateinit var recyclerView: RecyclerView
    lateinit var progressDialog: LinearLayout
    lateinit var presenter: MainPresenter
    lateinit var mAdapter: MainAdapter
    var printerList: MutableList<DataItem> = mutableListOf()


    var totalItem: Int = 0
    var totalPage: Int = 0

    var currentPage = 1
    var sorting: String = ""
    var color_option: String = ""
    var category: String = ""
    var cityId: String = ""


    var TAG = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        presenter = MainPresenter(this)
        progressDialog = findViewById(R.id.progress_dialog)

        recyclerView = findViewById(R.id.rv_main)


        mAdapter = MainAdapter(this@MainActivity, printerList)
        mAdapter.setLoadMoreListener(object : OnLoadMoreListener {
            override fun onLoadMore() {
                recyclerView.post {
                    currentPage ++

                    Log.e(TAG,"PAGE SEKARANG "+currentPage)
                    Log.e(TAG,"TOTAL PAGE "+totalPage)


                    if ( currentPage > totalPage) {
                        mAdapter.setMoreDataAvailable(false)
                    } else {
                        // int index = products.size();
                        presenter.loadMoreListPrinter(Constant.API_KEY,
                                Constant.PER_PAGE,
                                currentPage,
                                Constant.INCLUDE_MERCHANT,
                                sorting,
                                color_option,
                                category, cityId)
                    }
                }
            }

        })

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = mAdapter



        presenter.loadListPrinter(Constant.API_KEY,
                Constant.PER_PAGE,
                currentPage,
                Constant.INCLUDE_MERCHANT,
                sorting,
                color_option,
                category, cityId)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        grid = menu.findItem(R.id.action_grid)
        list = menu.findItem(R.id.action_list)
        grid.isVisible = true
        list.isVisible = false
       return super.onPrepareOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        return when (item?.itemId) {
            R.id.action_grid -> {
                list.isVisible = true
                grid.isVisible = false
                isSwitched = mAdapter.toggleItemViewType()
                rv_main.setLayoutManager(if (isSwitched) LinearLayoutManager(this@MainActivity) else GridLayoutManager(this@MainActivity, 2))

                return true
            }

            R.id.action_list -> {
                list.isVisible = false
                grid.isVisible = true

                isSwitched = mAdapter.toggleItemViewType()
                rv_main.setLayoutManager(if (isSwitched) LinearLayoutManager(this@MainActivity) else GridLayoutManager(this@MainActivity, 2))


                return true
            }
            else -> super.onOptionsItemSelected(item)

        }
    }



    override fun showLoading() {
        progressDialog.visibility = View.VISIBLE

    }

    override fun errorLoading(errorMessage: String?) {
        progressDialog.visibility = View.GONE
    }

    override fun stopLoading() {
        if (progressDialog.visibility == View.VISIBLE) {
            progressDialog.visibility = View.GONE
        }
    }

    override fun onLoadedDataSuccess(t: BaseMdl<List<DataItem>>) {
        if (t.data.size > 0) {
            printerList.addAll(t.data)
            mAdapter.notifyDataChanged()
            totalPage = t.meta.pagination!!.totalPages!!
            totalItem = t.meta.pagination!!.total!!
        } else if (t.data.size < 1) {
            mAdapter.setMoreDataAvailable(false)
        } else {
            mAdapter.setMoreDataAvailable(false)
        }
    }

    override fun onLoadedMoreDataSuccess(t: BaseMdl<List<DataItem>>) {
        printerList.add(DataItem("data"))
        mAdapter.notifyItemInserted(printerList.size - 1)

        if(t.data.size>1){
            printerList.removeAt(printerList.size - 1)

            printerList.addAll(t.data)
        }else{
            mAdapter.setMoreDataAvailable(false)
        }
        mAdapter.notifyDataChanged()
    }


}
