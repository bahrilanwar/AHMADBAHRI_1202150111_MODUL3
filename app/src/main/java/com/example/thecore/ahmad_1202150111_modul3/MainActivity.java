package com.example.thecore.ahmad_1202150111_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = (EditText) findViewById(R.id.user);
        final EditText password = (EditText) findViewById(R.id.pass);
        Button login = (Button) findViewById(R.id.Login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name = username.getText().toString();
                String pass_ =  password.getText().toString();
                if (user_name.equals("EAD")&&pass_.equals("MOBILE")){
                    Toast.makeText(getApplicationContext(),"Login Success!",Toast.LENGTH_SHORT).show();
                    Intent list = new Intent(getApplicationContext(),ListAir.class);
                    startActivity(list);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Access Denied!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

