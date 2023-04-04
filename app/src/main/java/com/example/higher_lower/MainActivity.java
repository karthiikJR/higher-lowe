package com.example.higher_lower;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import nl.dionsegijn.konfetti.xml.KonfettiView;

public class MainActivity extends AppCompatActivity {


    KonfettiView jv = findViewById(R.id.konfettiView);

    Random r = new Random();
    int random = r.nextInt(20);
    int noOfTimesClicked = 0;
    public void onBtnClick(View view) {

        noOfTimesClicked++;

        EditText tv = (EditText) findViewById(R.id.etUsrInp);
        int inp = Integer.parseInt(tv.getText().toString());
        Log.d("TAG", String.valueOf(inp));

        if(inp < random){
            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();

        } else if (inp > random) {
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}