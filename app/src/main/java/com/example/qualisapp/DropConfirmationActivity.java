package com.example.qualisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DropConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_comfirmation);

        Button confirmDrop = (Button) findViewById(R.id.confirmDrop);
        confirmDrop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ReceiveConfirmationActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton returnBttn = (ImageButton) findViewById(R.id.returnBttn);
        returnBttn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
