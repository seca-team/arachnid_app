package com.example.arachnid;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;

public class Login_Page extends AppCompatActivity {
    TextInputLayout username_tf, password_tf;
    Button login_cont_btn, signup_btn;

    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);  //hide the title
        getSupportActionBar().hide();   // hide the title bar
        setContentView(R.layout.login_page);



        // username and password, confirm value from sql, after connecting with MySQL, Azure.

        username_tf = findViewById(R.id.id_username_layout);
        password_tf = findViewById(R.id.id_password_layout);
        login_cont_btn = findViewById(R.id.login_cont_btn_id);
        signup_btn = findViewById(R.id.signup_btn_id);


        login_cont_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                username = username_tf.getEditText().getText().toString();
                password = password_tf.getEditText().getText().toString();

                // if username and password are correct
                if(username.equals("seca") && password.equals("123")) {
                    Toast.makeText(getApplicationContext(), "Welcome, " + username, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Login_Page.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }else{
                    Toast.makeText(getApplicationContext(), "Incorrect username/password.", Toast.LENGTH_SHORT).show();
                }

            }
        });


        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Login_Page.this, Signup_Page.class);
                startActivity(intent);
                ///finish();

            }
        });







    }
}
