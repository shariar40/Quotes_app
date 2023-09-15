package com.example.qoutesapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView qotes;
    Button share;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qotes = findViewById(R.id.quote);
        share = findViewById(R.id.share);


    }


    public void nextquote(View v) {
        Intent nextIntent = new Intent(this, MainActivity2.class);
        startActivity(nextIntent);


    }
    public void previousquote(View view) {
        Intent previousIntent = new Intent(this, MainActivity3.class);
        startActivity(previousIntent);
    }

    public void onClick(View view) {
        String rumyquotes = qotes.getText().toString();
        Intent sendintent = new Intent();
        sendintent.setAction(Intent.ACTION_SEND);
        sendintent.setType("text/plain");
        sendintent.putExtra(Intent.EXTRA_TEXT, rumyquotes);
        startActivity(sendintent);

    }


}