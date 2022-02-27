package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PlayingActivity extends AppCompatActivity {
    public Toolbar toolbar;
    public ImageView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    public  String startgame="x";
    public TextView reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
        toolbar=findViewById(R.id.appToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        initializeWidgets();

    }
    private void initializeWidgets() {
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        reset=findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearViews();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(startgame.equals("x")){
                   btn1.setImageResource(R.mipmap.rounder_foreground);
                   startgame=("0");
                   btn1.setClickable(false);
               }
               else {
                   btn1.setImageResource(R.mipmap.like_btn_foreground);
                   startgame=("x");
                   btn1.setClickable(false);

               }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startgame.equals("x")){
                    btn2.setImageResource(R.mipmap.rounder_foreground);
                    startgame=("0");
                    btn2.setClickable(false);
                }
                else {
                    btn2.setImageResource(R.mipmap.like_btn_foreground);
                    startgame=("x");
                    btn2.setClickable(false);

                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (startgame.equals("x")) {
                    btn3.setImageResource(R.mipmap.rounder_foreground);
                    startgame = ("0");
                    btn3.setClickable(false);
                } else {
                    btn3.setImageResource(R.mipmap.like_btn_foreground);
                    startgame = ("x");
                    btn3.setClickable(false);

                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startgame.equals("x")) {
                    btn4.setImageResource(R.mipmap.rounder_foreground);
                    startgame = ("0");
                    btn4.setClickable(false);
                } else {
                    btn4.setImageResource(R.mipmap.like_btn_foreground);
                    startgame = ("x");
                    btn4.setClickable(false);

                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (startgame.equals("x")) {
                    btn5.setImageResource(R.mipmap.rounder_foreground);
                    startgame = ("0");
                    btn5.setClickable(false);
                } else {
                    btn5.setImageResource(R.mipmap.like_btn_foreground);
                    startgame = ("x");
                    btn5.setClickable(false);

                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startgame.equals("x")) {
                    btn6.setImageResource(R.mipmap.rounder_foreground);
                    startgame = ("0");
                    btn6.setClickable(false);
                } else {
                    btn6.setImageResource(R.mipmap.like_btn_foreground);
                    startgame = ("x");
                    btn6.setClickable(false);

                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startgame.equals("x")) {
                    btn7.setImageResource(R.mipmap.rounder_foreground);
                    startgame = ("0");
                    btn7.setClickable(false);
                } else {
                    btn7.setImageResource(R.mipmap.like_btn_foreground);
                    startgame = ("x");
                    btn7.setClickable(false);

                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startgame.equals("x")) {
                    btn8.setImageResource(R.mipmap.rounder_foreground);
                    startgame = ("0");
                    btn8.setClickable(false);
                } else {
                    btn8.setImageResource(R.mipmap.like_btn_foreground);
                    startgame = ("x");
                    btn8.setClickable(false);

                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startgame.equals("x")) {
                    btn9.setImageResource(R.mipmap.rounder_foreground);
                    startgame = ("0");
                    btn9.setClickable(false);
                } else {
                    btn9.setImageResource(R.mipmap.like_btn_foreground);
                    startgame = ("x");
                    btn9.setClickable(false);



                }
            }
        });

    }

    private void clearViews() {
        if(startgame.equals("x")){

        }


    }
}