package com.hou.android_instantmessaging;

import android.content.Intent;
import android.media.MediaExtractor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by 凌霄 on 2016/3/13.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String inputAccount = ((EditText)findViewById(R.id.account)).getText().toString();
        final String inputPassword = ((EditText)findViewById(R.id.password)).getText().toString();


        Button signUpBtn = (Button)findViewById(R.id.signup);
        Button loginBtn = (Button)findViewById(R.id.login);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,DialogList.class);
//                startActivity(intent);
                logIn(inputAccount,inputPassword);
            }
        });


        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SignUp.class);
//                startActivity(intent);
//                SignUp.actionStart(MainActivity.this,"account","password");
                Intent intent = new Intent(MainActivity.this,SignUp.class);
                startActivityForResult(intent, 1);
            }
        });

//        String account = ((EditText)findViewById(R.id.account)).getText().toString();
//        String password = ((EditText)findViewById(R.id.password)).getText().toString();
    }

    private static String account,password;
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK){
//                    final String account = data.getStringExtra("account");
//                    final String password = data.getStringExtra("password");
                    account = data.getStringExtra("account");
                    password = data.getStringExtra("password");
                }
                break;
            default:
        }
    }

    protected void logIn(String inputAccount,String inputPassword){
        if(inputAccount.equals(account) && inputPassword.equals(password)){
            Intent intent = new Intent(MainActivity.this,DialogList.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
        }
    }
}
