package com.chipcerio.symphmonitor.welcometest;

import com.chipcerio.symphmonitor.R;
import com.chipcerio.symphmonitor.welcomescreen.WelcomeContract;
import com.chipcerio.symphmonitor.welcomescreen.WelcomePresenter;
import com.chipcerio.symphmonitor.welcomescreen.WelcomeService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class WelcomeUnitTest {

    WelcomePresenter mPresenter;
    @Mock
    WelcomeContract.View mView;
    @Mock
    WelcomeService mService;

    @Before
    public void setUp() throws Exception {
        mPresenter = new WelcomePresenter(mView, mService);
    }

    @Test
    public void shouldShowErrorWhenNameIsEmpty() throws Exception {
        when(mView.getName()).thenReturn("");
        mPresenter.onProceedClick();

        verify(mView).setNameError(R.string.name_error);
    }

    @Test
    public void shouldStartNextActivity() throws Exception {
        when(mView.getName()).thenReturn("Jermaine");
        mPresenter.onProceedClick();

        verify(mView).startNextActivity(mView.getName());
    }
}
