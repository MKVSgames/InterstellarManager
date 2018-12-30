package com.games.mkvs.interstellarmanager.views.start;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.games.mkvs.interstellarmanager.R;
import com.games.mkvs.interstellarmanager.base.contracts.BaseContracts;
import com.games.mkvs.interstellarmanager.engine.models.game_objects.contracts.Object3D;
import com.games.mkvs.interstellarmanager.engine.models.menu_background.StarsBackground;
import com.games.mkvs.interstellarmanager.engine.models.menu_background.StarsBackgroundPanel;
import com.games.mkvs.interstellarmanager.engine.services.DrawingService;
import com.games.mkvs.interstellarmanager.engine.services.SortingService;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class StartFragment extends Fragment implements StartContracts.IStartView {
    private View root;
    private StartContracts.IStartPresenter mPresenter;
    private RelativeLayout mMainContainer;
    private LinearLayout mContentContainer;


    public StartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_start, container, false);
        mMainContainer = root.findViewById(R.id.container);
        mContentContainer = root.findViewById(R.id.content_container);
        addBackground();
        mContentContainer.bringToFront();
        return root;
    }

    @Override
    public void setPresenter(BaseContracts.Presenter presenter) {
        mPresenter = (StartContracts.IStartPresenter)presenter;
    }

    @Override
    public void addBackground() {
        ArrayList<Object3D> objects = new ArrayList<>();
        objects.add(StarsBackground.getBackground());
        StarsBackgroundPanel panel = new StarsBackgroundPanel(getActivity(),
                DrawingService.getInstance(SortingService.getInstance()),
                objects);
        mMainContainer.addView(panel);
    }
}
