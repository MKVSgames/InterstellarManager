package com.games.mkvs.interstellarmanager.views.startview;

public interface StartContracts {
    interface View {

        void setPresenter(Presenter presenter);

        void showProgressBar();

        void hideProgressBar();

        void showError(Throwable error);

        void startGameWithCompany(Company company);

        void showMessage(String message);
    }

    interface Presenter {

        void subscribe(View view);

        void unsubscribe();

    }

    interface Navigator {
        void navigateToHomeWithCompany(Company company);
    }
}
