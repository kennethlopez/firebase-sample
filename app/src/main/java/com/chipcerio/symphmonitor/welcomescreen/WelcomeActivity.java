package com.chipcerio.symphmonitor.welcomescreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.chipcerio.symphmonitor.R;

/**
 * Created by Jermaine on 05/11/2016.
 */
public class WelcomeActivity extends AppCompatActivity implements WelcomeContract.View {

    public static final String EXTRA_NAME = "extra:name";

    private WelcomePresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mPresenter = new WelcomePresenter(this, new WelcomeService());
    }

    public void onProceedClick(View view) {
        mPresenter.onProceedClick();
    }

    @Override
    public String getName() {
        return ((EditText) findViewById(R.id.welcome_editText)).getText().toString().trim();
    }

    @Override
    public void setNameError(int resId) {
        ((EditText) findViewById(R.id.welcome_editText)).setError(getString(resId));
    }

    @Override
    public void startNextActivity() {
        //Intent intent = new Intent(this, NameOfActivity.class);
        //intent.putExtra(EXTRA_NAME, getName());
        //startActivity(intent);
    }
}
