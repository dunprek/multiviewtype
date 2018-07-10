package don.com.multiviewtype.data.printerListRepo

import com.ag.printerqoe.model.printerList.DataItem
import don.com.multiviewtype.data.BaseRepository
import don.com.multiviewtype.model.BaseMdl
import io.reactivex.Observable

/**
 * Created by GideonST on 4/11/2018.
 */
class PrinterListRepository : BaseRepository(), PrinterListRequest {
    override fun loadMoreListPrinter(apiKey: String, perpage: String, pageNumber: Int, include: String, sorting: String, color_option: String, category_ids: String, city_id: String): Observable<BaseMdl<List<DataItem>>> {
        return mApiClient.mApiServices.getListPrinter(apiKey, perpage, pageNumber, include, sorting, color_option, category_ids,city_id).flatMap { Observable.just(it) }
    }


    override fun loadListPrinter(apiKey: String, perpage: String, pageNumber: Int, include: String, sorting: String, color_option: String, category_ids: String,city_id:String): Observable<BaseMdl<List<DataItem>>> {
        return mApiClient.mApiServices.getListPrinter(apiKey, perpage, pageNumber, include, sorting, color_option, category_ids,city_id).flatMap { Observable.just(it) }
    }




}