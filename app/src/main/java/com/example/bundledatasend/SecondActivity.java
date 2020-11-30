package com.example.bundledatasend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Character sports = (Character)getIntent().getSerializableExtra("Character");
        TextView textView = findViewById(R.id.textView);
        textView.setText(sports.name +"\n" + sports.rollno + "\n" + sports.id+ "\n" + Arrays.toString(sports.abilities));
    }
}