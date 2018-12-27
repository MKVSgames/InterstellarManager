package com.games.mkvs.interstellarmanager.views.startview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.games.mkvs.interstellarmanager.R;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;

public class StartActivity extends DaggerAppCompatActivity implements StartContracts.Navigator{

    @Inject
    StartFragment mStartFragment;
    @Inject
    StartContracts.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        ButterKnife.bind(this);
        mStartFragment.setNavigator(this);
        mStartFragment.setPresenter(mPresenter);


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fr_start, mStartFragment)
                .commit();
    }

    @Override
    public void navigateToHomeWithCompany() {

    }
}
