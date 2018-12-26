package com.games.mkvs.interstellarmanager.diconfig;

import android.app.Application;

import com.games.mkvs.interstellarmanager.AndroidApplication;
import com.games.mkvs.interstellarmanager.diconfig.viewsmodules.StartModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {
        ActivityBindingModule.class,
        ApplicationModule.class,
        StartModule.class,

})
public interface AppComponent extends AndroidInjector<AndroidApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}
