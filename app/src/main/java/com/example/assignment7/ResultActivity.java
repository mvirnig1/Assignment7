package com.example.assignment7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView tvFlooringResults;
    EditText etWidth;
    EditText etLength;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


            tvFlooringResults = (TextView) findViewById(R.id.textViewFlooringResults);

        Bundle extras = getIntent().getExtras();
        tvFlooringResults.setText("Width is:" + etWidth + "Length is:" + etLength + "Flooring results are:");
        calculate();

    }
    public void calculate(){
        double w = Double.parseDouble(etWidth.getText().toString());
        double l = Double.parseDouble(etLength.getText().toString());
        double calculatedFlooring = w * l;
    }
}
