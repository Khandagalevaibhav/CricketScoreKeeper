package com.example.abhishek.cricketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int ball = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTeamA = 0;
    }

    /**
     * Adds runs to team A's score
     */
    public void addRunsTeamA(View view) {
        TextView runField = findViewById(R.id.team_a_runs);
        int score = Integer.parseInt(runField.getText().toString());
        scoreTeamA += score;
        runField.setText("0");
        displayOverScore(score);
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * Increases runs by 1 for Team A
     */
    public void incrementRunsTeamA(View view) {
        TextView runField = findViewById(R.id.team_a_runs);
        int score = Integer.parseInt(runField.getText().toString());
        score += 1;
        runField.setText("" + score);
    }

    /**
     * Decreases runs by 1 for Team A
     */
    public void decrementRunsTeamA(View view) {
        TextView runField = findViewById(R.id.team_a_runs);
        int score = Integer.parseInt(runField.getText().toString());
        if (score > 0) score -= 1;
        runField.setText("" + score);
    }


    /**
     * Adds 4 runs to team A's score
     */
    public void addFourTeamA(View view) {
        scoreTeamA += 4;
        displayOverScore(4);
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * Adds 6 runs to team A's score
     */
    public void addSixTeamA(View view) {
        scoreTeamA += 6;
        displayOverScore(6);
        displayScoreTeamA(scoreTeamA);
    }

    public void outTeamA(View view) {
        displayOverScore(-1);
    }

    private void displayOverScore(int s) {
        String displayScore;
        if (s == -1)
            displayScore = "O";
        else
            displayScore = "" + s;
        switch (ball) {
            case 1:
                ((TextView) findViewById(R.id.team_a_ball_1)).setText(displayScore);
                break;
            case 2:
                ((TextView) findViewById(R.id.team_a_ball_2)).setText(displayScore);
                break;
            case 3:
                ((TextView) findViewById(R.id.team_a_ball_3)).setText(displayScore);
                break;
            case 4:
                ((TextView) findViewById(R.id.team_a_ball_4)).setText(displayScore);
                break;
            case 5:
                ((TextView) findViewById(R.id.team_a_ball_5)).setText(displayScore);
                break;
            case 6:
                ((TextView) findViewById(R.id.team_a_ball_6)).setText(displayScore);
                break;
            case 7:
                ((TextView) findViewById(R.id.team_a_ball_1)).setText(displayScore);
                ((TextView) findViewById(R.id.team_a_ball_2)).setText("0");
                ((TextView) findViewById(R.id.team_a_ball_3)).setText("0");
                ((TextView) findViewById(R.id.team_a_ball_4)).setText("0");
                ((TextView) findViewById(R.id.team_a_ball_5)).setText("0");
                ((TextView) findViewById(R.id.team_a_ball_6)).setText("0");
                ball = 1;
        }
        ball++;
    }

    /**
     * Displays the Team A's score
     *
     * @param score int: score to be displayed
     */
    private void displayScoreTeamA(int score) {
        TextView scoreField = findViewById(R.id.team_a_score);
        scoreField.setText("" + score);
    }

}
