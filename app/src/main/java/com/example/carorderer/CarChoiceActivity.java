package com.example.carorderer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CarChoiceActivity extends AppCompatActivity {

    public static final String NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_choice);

        Intent intent = getIntent();
        String nameText = intent.getStringExtra(NAME);
        TextView nameView = (TextView) findViewById(R.id.name);
        String finalMessage = "Hello " + nameText + "!";
        nameView.setText(finalMessage);
    }

    public void onSendMessage(View view){
        EditText car = (EditText) findViewById(R.id.car);
        String carText = car.getText().toString();

        Intent intentOld = getIntent();
        String nameText = intentOld.getStringExtra(NAME);

        Intent intentNew = new Intent(this, GratitudeActivity.class);
        intentNew.putExtra(GratitudeActivity.NAME, nameText);
        intentNew.putExtra(GratitudeActivity.CAR_NAME, carText);
        startActivity(intentNew);
    }
}

