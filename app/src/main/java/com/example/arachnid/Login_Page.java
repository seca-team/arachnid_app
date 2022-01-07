package com.example.arachnid;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;

public class Login_Page extends AppCompatActivity {
    TextInputLayout username_tf, password_tf;
    Button login_btn;

    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);  //hide the title
        getSupportActionBar().hide();   // hide the title bar
        setContentView(R.layout.login_page);

        username_tf = findViewById(R.id.id_username_layout);
        password_tf = findViewById(R.id.id_password_layout);
        login_btn = findViewById(R.id.login_btn_id);


        // username and password, confirm value from sql, after connecting with MySQL, Azure.

        {
            login_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    username = username_tf.getEditText().getText().toString();
                    password = password_tf.getEditText().getText().toString();

                    if(username.equals("seca") && password.equals("123")) {
                        Toast.makeText(getApplicationContext(), "Welcome, " + username, Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(), "Incorrect username/password.", Toast.LENGTH_SHORT).show();
                    }

                }
            });

        }





    }
}
