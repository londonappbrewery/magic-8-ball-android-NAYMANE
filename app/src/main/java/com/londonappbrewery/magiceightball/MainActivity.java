package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = (Button) findViewById(R.id.button_ask);
        final ImageView ballImage = (ImageView) findViewById(R.id.image_ball);
        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Magic 8 Ball", "The Button has been clicked");
                Random randomNumber = new Random();
                 int number = randomNumber.nextInt(5);
                Log.d("Magic 8 Ball", "The random number is: " + number);
                 ballImage.setImageResource(ballArray[number]);
            }
        });
    }
}
