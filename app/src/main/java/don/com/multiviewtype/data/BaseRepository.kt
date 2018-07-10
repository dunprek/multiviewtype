package don.com.multiviewtype.data


import don.com.multiviewtype.helper.Constant
import don.com.multiviewtype.repository.ApiClient

/**
 * Created by gideon on 09/04/18.
 */


open class BaseRepository{
    var mApiClient: ApiClient = ApiClient(Constant.BASE_URL)
}