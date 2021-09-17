package com.example.dsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class register<phoneNumber, phone> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void toLogin(View view) {
        Intent intent=new Intent(view.getContext(),MainActivity.class);
        startActivity(intent);
    }

    public void toHome(View view) {
        Intent intent=new Intent(view.getContext(),home_page.class);
        startActivity(intent);
    }


}



