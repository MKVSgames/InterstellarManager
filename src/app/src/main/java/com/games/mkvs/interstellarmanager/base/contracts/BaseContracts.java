package com.games.mkvs.interstellarmanager.base.contracts;


public abstract class BaseContracts {
    public interface View<T extends Presenter>{
        void setPresenter(T presenter);
    }

    public interface Presenter<T extends View>{
        void subscribe(T view);
        void unsubscribe();
    }

    public interface Navigator {
        void navigate(Class clazz);
    }
}
