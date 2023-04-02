package com.example.carorderer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view){
        EditText name = (EditText) findViewById(R.id.name);
        String nameText = name.getText().toString();

        Intent intent = new Intent(this, CarChoiceActivity.class);
        intent.putExtra(CarChoiceActivity.NAME, nameText);
        startActivity(intent);
    }
}