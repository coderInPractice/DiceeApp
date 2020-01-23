package edu.learn.diceeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
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

        Button rollButton = (Button) findViewById(R.id.roll_button);

        final ImageView left_image = (ImageView)findViewById(R.id.left_dice);
        final ImageView right_image = (ImageView) findViewById(R.id.right_dice);

        final int [] diceArray = {R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);

                left_image.setImageResource(diceArray[number]);

                number = randomNumberGenerator.nextInt(6);

                right_image.setImageResource(diceArray[number]);
            }
        });
    }
}
