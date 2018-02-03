package com.example.asus.tictacto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    //0: Yellow, 1: Red

    int isTerisi[] = {2,2,2,2,2,2,2,2,2};

    boolean redOrYellow = false;

    Map enterIn = new HashMap();

    public void dropIn(View view)
    {
        ImageView counter = (ImageView) view;

        if(isTerisi[Integer.parseInt(counter.getTag().toString())] == 2) {
            if (redOrYellow) {
                counter.setImageResource(R.drawable.red);
                redOrYellow = false;
                isTerisi[Integer.parseInt(counter.getTag().toString())]=1;
            } else {
                counter.setImageResource(R.drawable.yellow);
                redOrYellow = true;
                isTerisi[Integer.parseInt(counter.getTag().toString())]=0;
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
