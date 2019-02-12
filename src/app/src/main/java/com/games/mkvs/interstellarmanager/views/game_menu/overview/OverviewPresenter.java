package com.games.mkvs.interstellarmanager.views.game_menu.overview;

import com.games.mkvs.interstellarmanager.base.contracts.BaseContracts;
import com.games.mkvs.interstellarmanager.web.repositories.base.CompanyRepository;

/**
 * Created by Martin on 3.1.2019 г..
 */

public class OverviewPresenter implements OverviewContracts.IOverviewPresenter {
    private final CompanyRepository companyRepository;
    private OverviewContracts.IOverviewView mView;
    public OverviewPresenter(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    @Override
    public void subscribe(BaseContracts.View view) {
        this.mView = (OverviewContracts.IOverviewView) view;
    }

    @Override
    public void unsubscribe() {
        this.mView = null;
    }
}
