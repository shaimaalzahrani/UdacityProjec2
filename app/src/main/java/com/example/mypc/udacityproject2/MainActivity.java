package com.example.mypc.udacityproject2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Global GScores = new Global();
    TextView ScoreALabel;
    TextView ScoreBLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScoreALabel = (TextView)findViewById(R.id.teamAScore);
        ScoreBLabel = (TextView)findViewById(R.id.teamBScore);
        // PASTE CODE YOU WANT TO TEST HERE

    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    public void AddPointsToTeamA(View view){
        if(view == view.findViewById(R.id.add1ToA))
            GScores.scoreA = GScores.scoreA+1;
        else if(view == view.findViewById(R.id.add5ToA))
            GScores.scoreA = GScores.scoreA+5;

        ScoreALabel.setText(""+GScores.scoreA);
    }


    public void AddPointsToTeamB(View view){
        if(view == view.findViewById(R.id.add1ToB))
            GScores.scoreB = GScores.scoreB+1;
        else if(view == view.findViewById(R.id.add5ToB))
            GScores.scoreB = GScores.scoreB+5;

        ScoreBLabel.setText(""+GScores.scoreB);
    }

    public void Reset(View view){
        GScores.scoreA = 0;
        ScoreALabel.setText(""+GScores.scoreA);
        GScores.scoreB = 0;
        ScoreBLabel.setText(""+GScores.scoreB);
    }
}