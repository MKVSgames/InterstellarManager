package com.games.mkvs.interstellarmanager;

import com.games.mkvs.interstellarmanager.diconfig.AppComponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class AndroidApplication extends DaggerApplication{
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {

        return  DaggerAppComponent
                .builder()
                .application(this)
                .build();

    }
}
