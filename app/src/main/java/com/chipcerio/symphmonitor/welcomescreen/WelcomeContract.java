package com.chipcerio.symphmonitor.welcomescreen;

/**
 * Created by Jermaine on 05/11/2016.
 */
public class WelcomeContract {
    /**
     * interface for welcome presenter
     **/
    interface Presenter {
        void onProceedClick();
    }

    /**
     * interface for welcome view
     **/
    public interface View {
        String getName();

        void setNameError(int resId);

        void startNextActivity();
    }
}
