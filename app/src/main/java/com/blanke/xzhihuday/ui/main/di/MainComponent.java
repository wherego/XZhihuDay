package com.blanke.xzhihuday.ui.main.di;

import com.blanke.xzhihuday.app.di.AppComponent;
import com.blanke.xzhihuday.di.scopes.PerActivity;
import com.blanke.xzhihuday.ui.home.di.ContentComponent;
import com.blanke.xzhihuday.ui.main.MainActivity;

import dagger.Component;

/**
 * Created by blanke on 16-6-6.
 */
@PerActivity
@Component(dependencies = AppComponent.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);

    ContentComponent provideContentComponent();
}
