package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intents: facilities communication bet. different component of an app
        // as well as bet. different application

        //type of intents:
        //1- Explicit Intents

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity();

            }
        });

        //2- Implicit Intents
        Button btn2 = findViewById(R.id.openBrowser);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage();

            }
        });







    }
    public  void goToSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }

    public  void openWebPage(){
        Uri webpage =Uri.parse("https://www.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);
    }



}
