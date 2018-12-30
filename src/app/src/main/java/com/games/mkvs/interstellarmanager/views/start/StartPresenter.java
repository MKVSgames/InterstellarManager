package com.games.mkvs.interstellarmanager.views.start;

import com.games.mkvs.interstellarmanager.base.contracts.BaseContracts;

public class StartPresenter implements StartContracts.IStartPresenter {
    private StartContracts.IStartView mView;
    @Override
    public void subscribe(BaseContracts.View view) {
        this.mView = (StartContracts.IStartView)view;
    }

    @Override
    public void unsubscribe() {
        this.mView = null;
    }
}
