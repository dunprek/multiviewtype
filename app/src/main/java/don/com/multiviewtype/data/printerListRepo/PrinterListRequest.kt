package don.com.multiviewtype.data.printerListRepo


import com.ag.printerqoe.model.printerList.DataItem
import don.com.multiviewtype.model.BaseMdl
import io.reactivex.Observable

/**
 * Created by GideonST on 4/11/2018.
 */
interface PrinterListRequest {

    fun loadListPrinter(apiKey: String,perpage:String,pageNumber:Int,include:String,sorting:String,color_option:String,category_ids:String,city_id:String): Observable<BaseMdl<List<DataItem>>>

    fun loadMoreListPrinter(apiKey: String,perpage:String,pageNumber:Int,include:String,sorting:String,color_option:String,category_ids:String,city_id:String): Observable<BaseMdl<List<DataItem>>>

}