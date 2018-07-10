package don.com.multiviewtype.view

import com.ag.printerqoe.model.printerList.DataItem
import don.com.multiviewtype.base.BaseView
import don.com.multiviewtype.model.BaseMdl

/**
 * Created by don on 7/11/2018.
 */
interface MainView :BaseView {
    fun onLoadedDataSuccess(t: BaseMdl<List<DataItem>>)
    fun onLoadedMoreDataSuccess(t: BaseMdl<List<DataItem>>)

}