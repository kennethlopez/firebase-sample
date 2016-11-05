package com.chipcerio.symphmonitor.welcomescreen;

import com.chipcerio.symphmonitor.R;

public class WelcomePresenter implements WelcomeContract.Presenter{

    private WelcomeContract.View mView;
    private WelcomeService mWelcomeService;

    public WelcomePresenter(WelcomeContract.View view, WelcomeService welcomeService) {
        this.mView = view;
        this.mWelcomeService = welcomeService;
    }

    @Override
    public void onProceedClick() {
        String name = mView.getName();
        if (name == null || name.isEmpty()) {
            mView.setNameError(R.string.name_error);
            return;
        }
        mView.startNextActivity(name);
    }
}
