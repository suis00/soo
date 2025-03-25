package com.example.dice_project;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;
import android.widget.ImageView;
import android.widget.Button;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button button;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.rollbutton);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                rollDice();
            }
        });
    }
    private void rollDice() {
        int number = random.nextInt(6) + 1;
        int resId = getResources().getIdentifier("dice" + number, "drawable", getPackageName());
        imageView.setImageResource(resId);
    }
}