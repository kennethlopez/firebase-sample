package com.chipcerio.symphmonitor.welcomescreen;

public class WelcomeContract {

    interface Presenter {
        void onProceedClick();
    }

    public interface View {
        String getName();

        void setNameError(int resId);

        void startNextActivity(String name);
    }
}
