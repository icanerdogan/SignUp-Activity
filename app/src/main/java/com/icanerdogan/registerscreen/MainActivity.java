package com.icanerdogan.registerscreen;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // DEFINITION COMPONENT
    EditText txtFullName, txtEmail, txtUsername, txtPassword;
    Button btnSignUp, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // HIDE TITLE BAR
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        // INITIALIZE COMPONENT
        txtFullName = findViewById(R.id.txtSignUpFullName);
        txtEmail = findViewById(R.id.txtSignUpEmail);
        txtUsername = findViewById(R.id.txtSignUpUsername);
        txtPassword = findViewById(R.id.txtSignUpPassword);

        // BUTTON
        btnSignUp = findViewById(R.id.btnSignUp);
        btnBack = findViewById(R.id.btnBack);

        btnSignUp.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSignUp:
                SignUp();
                break;
            case R.id.btnBack:
                SignUpToSignIn();
                break;
        }
    }

    private void SignUpToSignIn() {
        // BACK TO MAIN
    }

    private void SignUp() {
        // INTENT TO SIGN IN
    }
}