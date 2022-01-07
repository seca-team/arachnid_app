package com.example.arachnid;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Page extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        // this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.login_page);
        Button btn = (Button)findViewById(R.id.continue_button);

        btn.setOnClickListener(new View.OnClickListener() { // Switch from Sign Up Page to Login Page
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_Page.this, Signup_Page.class));
            }
        });

    }
}
