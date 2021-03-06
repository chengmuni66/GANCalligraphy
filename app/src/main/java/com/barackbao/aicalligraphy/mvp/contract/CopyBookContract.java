package com.barackbao.aicalligraphy.mvp.contract;

import com.barackbao.aicalligraphy.model.CopyBook;
import com.barackbao.aicalligraphy.mvp.base.BasePresenter;
import com.barackbao.aicalligraphy.mvp.base.BaseView;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : baoqianyue
 *     time   : 2018/09/24
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public interface CopyBookContract {

    interface IView extends BaseView<IPresenter> {
        void showCopyBookList(List<CopyBook> list);

        void showMoreBookList(List<CopyBook> list);

        void showError();
    }

    interface IPresenter extends BasePresenter {
        void requestData();

        void loadMoreData();
    }

}
