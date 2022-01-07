package com.example.arachnid;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class Login_Page extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);  //hide the title
        getSupportActionBar().hide();   // hide the title bar
        setContentView(R.layout.login_page);


        Button btn = null;

        
        
        
        btn.setOnClickListener(new View.OnClickListener() { // Switch from Sign Up Page to Login Page
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_Page.this, Signup_Page.class));
            }
        });

    }
}
