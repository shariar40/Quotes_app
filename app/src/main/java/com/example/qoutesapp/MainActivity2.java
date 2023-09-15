package com.example.qoutesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView qotes;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        qotes = findViewById(R.id.quote);
        share = findViewById(R.id.share);
    }

    public void nextquote(View v) {
        Intent nextIntent = new Intent(this, MainActivity3.class);
        startActivity(nextIntent);


    }

    public void previousquote(View view) {
        Intent previousIntent = new Intent(this, MainActivity.class);
        startActivity(previousIntent);
    }

    public void onClick(View view) {
        String stevesyquotes = qotes.getText().toString();
        Intent sendintent = new Intent();
        sendintent.setAction(Intent.ACTION_SEND);
        sendintent.setType("text/plain");
        sendintent.putExtra(Intent.EXTRA_TEXT, stevesyquotes);
        startActivity(sendintent);

    }
}