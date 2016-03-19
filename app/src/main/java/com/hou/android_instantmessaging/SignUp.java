package com.hou.android_instantmessaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by 凌霄 on 2016/3/13.
 */
public class SignUp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        final String setAccount = ((EditText)findViewById(R.id.signup_account)).getText().toString();
        final String setPassword = ((EditText)findViewById(R.id.signup_password)).getText().toString();

        Button signUp = (Button)findViewById(R.id.signup_Button);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("account",setAccount);
                intent.putExtra("password",setPassword);
                setResult(RESULT_OK, intent);
                Toast.makeText(SignUp.this,"Sign Up Successful",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

    /*public static void actionStart(Context context,String account,String password){
        Intent intent = new Intent(context,SignUp.class);
        intent.putExtra("account",account);
        intent.putExtra("password",password);
        context.startActivity(intent);
    }*/

}
