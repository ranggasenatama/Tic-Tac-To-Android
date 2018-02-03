package com.example.asus.tictacto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean redOrYellow = false;

    public void dropIn(View view)
    {
        ImageView counter = (ImageView) view;

        if(redOrYellow)
        {
            counter.setImageResource(R.drawable.red);
            redOrYellow =false;
        }
        else
        {
            counter.setImageResource(R.drawable.yellow);
            redOrYellow = true;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
