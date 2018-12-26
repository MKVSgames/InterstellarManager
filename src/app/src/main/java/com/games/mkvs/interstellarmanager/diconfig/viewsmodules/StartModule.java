package com.games.mkvs.interstellarmanager.diconfig.viewsmodules;

import com.games.mkvs.interstellarmanager.diconfig.ActivityScoped;
import com.games.mkvs.interstellarmanager.diconfig.FragmentScoped;
import com.games.mkvs.interstellarmanager.views.startview.StartContracts;
import com.games.mkvs.interstellarmanager.views.startview.StartFragment;
import com.games.mkvs.interstellarmanager.views.startview.StartPresenter;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class StartModule {
    @FragmentScoped
    @ContributesAndroidInjector
    abstract StartFragment startFragment();

    @ActivityScoped
    @Binds
    abstract StartContracts.Presenter startPresenter(StartPresenter startPresenter);

}
