package com.hyfood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.hyfood.views.LoginActivity;

public class Hal_Register extends AppCompatActivity {
    EditText username, email, password, cpassword;
    Button btn_register, btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_register);

        username =findViewById(R.id.tx_usernameReg);
        password =findViewById(R.id.tx_passwordReg);
        cpassword =findViewById(R.id.tx_cpassword);
        email = findViewById(R.id.tx_email);
        btn_register = findViewById(R.id.btn_register);
        btn_back = findViewById(R.id.back);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();
                String cpasswordKey = cpassword.getText().toString();
                String emailKey = email.getText().toString();

                if(usernameKey.equals("") && passwordKey.equals("") && emailKey.equals("") && cpasswordKey.equals("")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Hal_Register.this);
                    builder.setMessage("All data must be filled")
                            .setNegativeButton("Retry", null).create().show();
                }
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(Hal_Register.this, LoginActivity.class);
                Hal_Register.this.startActivity(in1);
            }
        });
    }
}
