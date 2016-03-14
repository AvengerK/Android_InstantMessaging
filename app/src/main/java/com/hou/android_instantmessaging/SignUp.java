package com.hou.android_instantmessaging;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by 凌霄 on 2016/3/13.
 */
public class SignUp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        String setAccount = ((EditText)findViewById(R.id.signup_account)).getText().toString();
        String setPassword = ((EditText)findViewById(R.id.signup_password)).getText().toString();

    }
}
