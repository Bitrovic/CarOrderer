package com.example.carorderer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GratitudeActivity extends AppCompatActivity {

    public static final String CAR_NAME = "car";
    public static final String NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gratitude);

        Intent intent = getIntent();
        String carNameText = intent.getStringExtra(CAR_NAME);
        String userNameText = intent.getStringExtra(NAME);

        TextView gratitudeView = (TextView) findViewById(R.id.gratitude);
        String finalMessage = userNameText + " thank you for ordering " + "'" + carNameText + "'. We will contact you soon!";
        gratitudeView.setText(finalMessage);
    }
}