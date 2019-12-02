package com.akmal.jamq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {
    TextClock jamdigital;
    Button tomboljam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextClock jam1 = (TextClock)findViewById(R.id.jam1);

        jamdigital = (TextClock)findViewById(R.id.jam2);
        jamdigital.setVisibility(View.INVISIBLE);

        tomboljam = (Button)findViewById(R.id.button1);
    }
    public void showTextClock(View view){
        jamdigital.setVisibility(view.VISIBLE);
        tomboljam.setText("Tampilkan Jam Digital");
    }
    public void keluar (View view){
        finish();

    }
}
