package com.example.justmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private int seconds=30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton playButton = (ImageButton) findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,activity_Score.class);
                startActivity(i);

            }
        });



    }




    public void timer(){
        final Handler handler =new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
               if(seconds>0){
                   seconds--;
                   handler.postDelayed(this,100);
               }
               else {
                   //time complete
               }
            }
        }
        );

    }
}
