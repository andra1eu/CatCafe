package com.example.android.catcafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String RESERVATION = "RESERVATION";
    private EditText reservation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reservation = (EditText) findViewById(R.id.reservation_name);

        if (savedInstanceState != null) {
            reservation.setText(savedInstanceState.getString(RESERVATION));
        }

        //this is the code for the costumed ActionBar
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //here you have to create a new layout
        TextView v = (TextView) getLayoutInflater().inflate(R.layout.custom_title_view, null);
        getSupportActionBar().setCustomView(v);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(RESERVATION, reservation.getText().toString());
    }
}
