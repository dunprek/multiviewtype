package don.com.multiviewtype.repository


import com.ag.printerqoe.model.printerList.DataItem
import don.com.multiviewtype.model.BaseMdl
import io.reactivex.Observable
import retrofit2.http.*


/**
 * Created by GideonST on 3/2/2018.
 */
interface ApiServices {

    /**
     * GET-------------------------------------------------------------------------------------------------------------------------
     */


    @GET("printers/printers")
    fun getListPrinter(
            @Header("Api-Key") apiKey: String,
            @Query("perpage") perPage: String,
            @Query("page") pageNumber: Int,
            @Query("include") merchant: String,
            @Query("sorting") sorting: String,
            @Query("color_option") color_option: String,
            @Query("category_ids") category_id: String,
            @Query("city_id") city_id: String
    )
            : Observable<BaseMdl<List<DataItem>>>


}
