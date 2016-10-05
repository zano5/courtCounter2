package com.example.user11.courtcounter2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnFreethrowA, btnFreethrowB, btnThreePointsA, btnThreePointsB, btnTwoPointsA, btnTwoPointB, btnReset;
    private TextView tvScore1, tvScore2;
    private int score1, score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnFreethrowA = (Button) findViewById(R.id.btnFreeThrowA);
        btnFreethrowB = (Button) findViewById(R.id.btnFreeThrowB);
        btnThreePointsB = (Button) findViewById(R.id.btn3pointsB);
        btnThreePointsA = (Button) findViewById(R.id.btn3pointsA);
        btnTwoPointB = (Button) findViewById(R.id.btn2pointsB);
        btnTwoPointsA = (Button) findViewById(R.id.btn2pointsA);
        tvScore1 = (TextView) findViewById(R.id.tvScore1);
        btnReset = (Button) findViewById(R.id.btnReset);
        tvScore2 = (TextView) findViewById(R.id.tvScore2);


    }


    public void reset()
    {
        score1 =0;
        score2 = 0;
        tvScore1.setText(""+score1);
        tvScore2.setText(""+score2);

    }


    public void threePointsA()
    {

        score1+=3;

        tvScore1.setText("" + score1);
    }




    public void twoPointsA()
    {

        score1+=2;

        tvScore1.setText("" + score1);
    }


    public void freeThrowA()
    {

        score1+=1;

        tvScore1.setText("" + score1);
    }


    public void threePointsB()
    {

        score2+=3;

        tvScore2.setText("" + score2);
    }


    public void twoPointsB()
    {

        score2+=2;

        tvScore2.setText("" + score2);
    }


    public void freeThrowB()
    {

        score2+=1;

        tvScore2.setText("" + score2);
    }

    public void onClick(View view )
    {
       int id = view.getId();


        switch(id)
        {

            case  R.id.btn2pointsA:

                twoPointsA();
            break;


            case R.id.btn2pointsB:

                twoPointsB();
                break;

            case R.id.btnFreeThrowA:

                freeThrowA();
                break;


            case R.id.btnFreeThrowB:

                freeThrowB();
                break;


            case R.id.btn3pointsA:

                threePointsA();
                break;


            case R.id.btn3pointsB:

                threePointsB();
                break;

            default:
              reset();

                break;

        }
    }


}
