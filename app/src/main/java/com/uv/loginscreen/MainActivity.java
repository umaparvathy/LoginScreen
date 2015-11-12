package com.uv.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeView();

        setListeners();
    }

    private void setListeners() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean emailHasError = false, passwordHasError = false;
                if(email.getText().length()==0)
                {
                    emailHasError = true;
                    email.setError("Field cannot be left blank.");
                } else {
                    emailHasError = false;
                    email.setError(null);
                }

                if(password.getText().length()==0)
                {
                    passwordHasError = true;
                    password.setError("Field cannot be left blank.");
                } else {
                    passwordHasError = false;
                    password.setError(null);
                }
                if(!emailHasError && !passwordHasError) {
                    Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);
                    intent.putExtra("userName", email.getText().toString());
                    startActivity(intent);
                }

            }
        });
    }

    private void initializeView() {
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
    }
}
