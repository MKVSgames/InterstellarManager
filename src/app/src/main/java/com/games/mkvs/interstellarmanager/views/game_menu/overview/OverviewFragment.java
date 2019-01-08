package com.games.mkvs.interstellarmanager.views.game_menu.overview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.games.mkvs.interstellarmanager.R;
import com.games.mkvs.interstellarmanager.base.contracts.BaseContracts;

/**
 * A simple {@link Fragment} subclass.
 */
public class OverviewFragment extends Fragment implements OverviewContracts.IOverviewView {
    private View root;
    private OverviewContracts.IOverviewPresenter mPresenter;

    public OverviewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_overview, container, false);
        return root;
    }

    @Override
    public void setPresenter(BaseContracts.Presenter presenter) {
        this.mPresenter = (OverviewContracts.IOverviewPresenter) presenter;
    }
}
