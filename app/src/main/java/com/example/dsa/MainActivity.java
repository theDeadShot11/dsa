package com.example.dsa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button loginButton;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiate a button
        loginButton = (Button) findViewById(R.id.loginBtn);
        ed1 = (EditText)findViewById(R.id.userName);
        ed2 = (EditText)findViewById(R.id.password);
        // perform click event on the button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Successfully Logged In",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), home_page.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

    public void toRegister(View view) {
        Intent intent=new Intent(view.getContext(),register.class);
        startActivity(intent);
    }
}
