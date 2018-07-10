package don.com.multiviewtype.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.ArrayList

/**
 * Created by don on 7/11/2018.
 */
class HistoryResult {
    @SerializedName("rows")
    @Expose
    var rows: List<Row> = ArrayList()
    @SerializedName("total_rows")
    @Expose
    var totalRows: Int? = null
    @SerializedName("total_page")
    @Expose
    var total_page: Int? = null

    class Row(@field:SerializedName("type")
              @field:Expose
              var type: String) {

        @SerializedName("itemno")
        @Expose
        var itemno: Int? = 0
        @SerializedName("trx_id")
        @Expose
        var trxId: String = ""
        @SerializedName("reffnum")
        @Expose
        var reffnum: String = ""
        @SerializedName("date")
        @Expose
        var date: String = ""
        @SerializedName("provider")
        @Expose
        var provider: String = ""
        @SerializedName("product_name")
        @Expose
        var productName: String = ""
        @SerializedName("trx_amount")
        @Expose
        lateinit var trxAmount: String
        @SerializedName("commision")
        @Expose
        var commision: String = ""
        @SerializedName("trx_desc")
        @Expose
        var trxDesc: String = ""
        @SerializedName("trx_status")
        @Expose
        var trxStatus: String = ""
    }
}