package com.example.higher_lower;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import nl.dionsegijn.konfetti.core.PartyFactory;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.emitter.Emitter;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.xml.KonfettiView;

public class MainActivity extends AppCompatActivity {



    //Shape.DrawableShape ds = new Shape.DrawableShape(AppCompatResources.getDrawable(this,R.drawable.baseline_polyline_24),true);


//    public void explode() {
//        EmitterConfig emitterConfig = new Emitter(100L, TimeUnit.MILLISECONDS).max(100);
//        kv.start(
//                new PartyFactory(emitterConfig)
//                        .spread(360)
//                        .shapes(Arrays.asList(Shape.Square.INSTANCE, Shape.Circle.INSTANCE, ds))
//                        .colors(Arrays.asList(0xfce18a, 0xff726d, 0xf4306d, 0xb48def))
//                        .setSpeedBetween(0f, 30f)
//                        .position(new Position.Relative(0.5, 0.3))
//                        .build()
//        );
//    }

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
        Button btn = findViewById(R.id.button4);
        btn.setOnClickListener(v -> {
            KonfettiView kv = findViewById(R.id.konfettiView);
            EmitterConfig emitterConfig = new Emitter(100L, TimeUnit.MILLISECONDS).max(100);
            kv.start(
                    new PartyFactory(emitterConfig)
                            .spread(360)
                            .shapes(Arrays.asList(Shape.Square.INSTANCE, Shape.Circle.INSTANCE))
                            .colors(Arrays.asList(0xfce18a, 0xff726d, 0xf4306d, 0xb48def))
                            .setSpeedBetween(0f, 30f)
                            .position(new Position.Relative(0.5, 0.3))
                            .build()
            );
        });

    }


}