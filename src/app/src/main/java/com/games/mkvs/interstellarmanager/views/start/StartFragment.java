package com.games.mkvs.interstellarmanager.views.start;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.games.mkvs.interstellarmanager.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;


public class StartFragment extends Fragment implements StartContracts.View{

    @BindView(R.id.prb_loading_view)
    ProgressBar mProgressBarView;

    @BindView(R.id.btn_start_game)
    Button mStartGameButton;

    @BindView(R.id.btn_load_game)
    Button mLoadGameButton;

    @BindView(R.id.btn_options)
    Button mOptionsButton;

    private StartContracts.Presenter mPresenter;
    private StartContracts.Navigator mNavigator;


    @Inject
    public StartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_start, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.subscribe(this);
    }

    @Override
    public void onDestroy() {
        mPresenter = null;
        super.onDestroy();
    }

    public void setNavigator(StartContracts.Navigator navigator) {
        mNavigator = navigator;
    }

    @Override
    public void setPresenter(StartContracts.Presenter presenter) {
        mPresenter=presenter;
    }

    @Override
    public void showProgressBar() {
        mProgressBarView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        mProgressBarView.setVisibility(View.GONE);
    }

    @Override
    public void showError(Throwable error) {

    }

    @Override
    public void startGameWithCompany() {

    }

    @Override
    public void showMessage(String message) {

    }
}
