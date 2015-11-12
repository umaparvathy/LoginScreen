package com.uv.loginscreen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WelcomeActivity extends AppCompatActivity {

    TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        welcomeText = (TextView) findViewById(R.id.welcome);
        String value = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String userName = extras.getString("userName");
            value = "Welcome to the app " + userName;
        }
        welcomeText.setText(value);
    }

}
