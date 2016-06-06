package com.blanke.xzhihuday.repository.impl.network;

import com.blanke.xzhihuday.api.ZhiHuApi;
import com.blanke.xzhihuday.bean.ArticleBean;
import com.blanke.xzhihuday.repository.base.ArticleRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;

/**
 * Created by blanke on 16-6-6.
 */
public class NetworkArticleRepository implements ArticleRepository {
    private ZhiHuApi zhiHuApi;

    @Inject
    @Singleton
    public NetworkArticleRepository(ZhiHuApi zhiHuApi) {
        this.zhiHuApi = zhiHuApi;
    }

    @Override
    public Observable<ArticleBean> getArticle(int id) {
        return zhiHuApi.getArticle(id);
    }
}
