package com.example.assignment7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    TextView tvWidth;
    TextView tvLength;

    Button btResults;

    EditText etWidth;
    EditText etLength;
    private int textViewWidth;
    private int textViewLength;
private int editTextWidth;
private int editTextLength;
private int buttonResults;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWidth = (TextView) findViewById(textViewWidth);
        etWidth = (EditText) findViewById(editTextWidth);

        tvLength = (TextView) findViewById(textViewLength);
        etLength = (EditText) findViewById(editTextLength);

        btResults = (Button) findViewById(buttonResults);

        btResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent detailActIntent = new Intent(String.valueOf(ResultActivity.class));
                detailActIntent.putExtra("WIDTH_KEY", "LENGTH_KEY");
                startActivity(detailActIntent);


            }
        });
    }
}