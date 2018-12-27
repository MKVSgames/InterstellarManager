package com.games.mkvs.interstellarmanager.diconfig;

import com.games.mkvs.interstellarmanager.diconfig.viewsmodules.StartModule;
import com.games.mkvs.interstellarmanager.views.start.StartActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = StartModule.class)
    abstract StartActivity startActivity();
}
