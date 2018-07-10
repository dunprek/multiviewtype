package don.com.multiviewtype.model

import com.ag.printerqoe.model.printerList.Meta

/**
 * Created by gideon on 09/04/18.
 */
data class BaseMdl<T> (
//        var status:Boolean,
//        var message:String?,
        var data:T,
        var meta: Meta
)