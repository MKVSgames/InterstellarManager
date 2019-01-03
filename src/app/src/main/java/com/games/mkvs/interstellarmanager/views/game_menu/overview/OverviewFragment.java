package com.games.mkvs.interstellarmanager.views.game_menu.overview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.games.mkvs.interstellarmanager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OverviewFragment extends Fragment {


    private View root;

    public OverviewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_overview, container, false);
        return root;
    }

}
