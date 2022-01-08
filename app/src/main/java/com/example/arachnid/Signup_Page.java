package com.example.arachnid;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Signup_Page extends AppCompatActivity {

    Button signup_cont_btn, login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.signup_page);

        signup_cont_btn = findViewById(R.id.signup_cont_btn_id);
        login_btn = findViewById(R.id.login_btn_id);

        signup_cont_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

    }

}