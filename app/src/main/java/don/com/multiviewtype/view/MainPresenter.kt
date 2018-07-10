package don.com.multiviewtype.view

import com.ag.printerqoe.model.printerList.DataItem
import don.com.multiviewtype.base.BaseObserver
import don.com.multiviewtype.base.BasePresenter
import don.com.multiviewtype.data.printerListRepo.PrinterListRepository
import don.com.multiviewtype.model.BaseMdl
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by don on 7/11/2018.
 */
class MainPresenter(mainView: MainView) : BasePresenter<MainView>(mainView) {

    var mRequest = PrinterListRepository()

    fun loadListPrinter(apiKey: String, perpage: String, pageNumber: Int, include: String, sorting: String, color_option: String, category: String, city_id: String) {
        mView.showLoading()
        mRequest.loadListPrinter(apiKey, perpage, pageNumber, include, sorting, color_option, category, city_id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : BaseObserver<BaseMdl<List<DataItem>>>() {
                    override fun onResponseError(errorMessage: String) {
                        mView.stopLoading()
                        mView.errorLoading(errorMessage)
                    }

                    override fun onResponseSuccess(result: BaseMdl<List<DataItem>>) {
                        mView.stopLoading()
                        mView.onLoadedDataSuccess(result)
                    }

                })
    }

    fun loadMoreListPrinter(apiKey: String, perpage: String, pageNumber: Int, include: String, sorting: String, color_option: String, category: String, city_id: String) {
        mView.showLoading()
        mRequest.loadListPrinter(apiKey, perpage, pageNumber, include, sorting, color_option, category, city_id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : BaseObserver<BaseMdl<List<DataItem>>>() {
                    override fun onResponseError(errorMessage: String) {
                        mView.stopLoading()
                        mView.errorLoading(errorMessage)
                    }

                    override fun onResponseSuccess(result: BaseMdl<List<DataItem>>) {
                        mView.stopLoading()
                        mView.onLoadedMoreDataSuccess(result)
                    }

                })
    }
}