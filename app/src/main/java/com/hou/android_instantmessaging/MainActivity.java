package com.hou.android_instantmessaging;

import android.content.Intent;
import android.media.MediaExtractor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by 凌霄 on 2016/3/13.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button signUpBtn = (Button)findViewById(R.id.signup);
        Button loginBtn = (Button)findViewById(R.id.login);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DialogList.class);
                startActivity(intent);
            }
        });


        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
            }
        });

        String account = ((EditText)findViewById(R.id.account)).getText().toString();
        String password = ((EditText)findViewById(R.id.password)).getText().toString();
    }


}
