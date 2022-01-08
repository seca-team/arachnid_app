package com.example.arachnid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;


public class Signup_Page extends AppCompatActivity {

    TextInputLayout username_tf, password_tf, confirm_password_tf;
    Button signup_cont_btn, login_btn;

    String username, password, conf_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.signup_page);


        username_tf = findViewById(R.id.id_username_layout_signup);
        password_tf = findViewById(R.id.id_password_layout_signup);
        confirm_password_tf = findViewById(R.id.id_conf_password_layout_signup);

        signup_cont_btn = findViewById(R.id.signup_cont_btn_id);
        login_btn = findViewById(R.id.login_btn_id);



        signup_cont_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                username = username_tf.getEditText().getText().toString();
                password = password_tf.getEditText().getText().toString();
                conf_password = confirm_password_tf.getEditText().getText().toString();

                // Method UploadData(username, password, conf_password)

                // move to login_frame from here.


            }
        });


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Signup_Page.this, Login_Page.class);
                startActivity(intent);
                //finish();

            }
        });

    }

}