package com.example.asus.tictacto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //0: Yellow, 1: Red
    int isTerisi[] = {2,2,2,2,2,2,2,2,2};
    int winningGame[][] = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,8}};
    boolean redOrYellow = false;
    boolean getWinner = false;

    public void dropIn(View view)
    {
        ImageView counter = (ImageView) view;

        if(getWinner == false) {
            if (isTerisi[Integer.parseInt(counter.getTag().toString())] == 2) {
                if (redOrYellow) {
                    counter.setImageResource(R.drawable.red);
                    redOrYellow = false;
                    isTerisi[Integer.parseInt(counter.getTag().toString())] = 1;
                } else {
                    counter.setImageResource(R.drawable.yellow);
                    redOrYellow = true;
                    isTerisi[Integer.parseInt(counter.getTag().toString())] = 0;
                }
            }

            for (int i = 0; i < 8; i++) {
                if (isTerisi[winningGame[i][0]] == 1 && isTerisi[winningGame[i][1]] == 1 && isTerisi[winningGame[i][2]] == 1) {
                    TextView setWinner = (TextView) findViewById(R.id.textView);
                    Button setButton = (Button) findViewById(R.id.button);
                    setButton.setVisibility(View.VISIBLE);
                    setWinner.setText("Red Win");
                    getWinner=true;
                }
                if (isTerisi[winningGame[i][0]] == 0 && isTerisi[winningGame[i][1]] == 0 && isTerisi[winningGame[i][2]] == 0) {
                    TextView setWinner = (TextView) findViewById(R.id.textView);
                    Button setButton = (Button) findViewById(R.id.button);
                    setButton.setVisibility(View.VISIBLE);
                    setWinner.setText("Yellow Win");
                    getWinner=true;
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
