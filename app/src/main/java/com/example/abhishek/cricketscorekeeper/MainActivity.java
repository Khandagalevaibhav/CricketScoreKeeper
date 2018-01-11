package com.example.abhishek.cricketscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        (findViewById(R.id.team_a_ball_1)).setBackgroundResource(R.color.colorSuccess);
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
        TextView currentView = null;
        TextView swap = null;
        if (s == -1)
            displayScore = "O";
        else
            displayScore = "" + s;
        switch (ball) {
            case 1:
                currentView = findViewById(R.id.team_a_ball_1);
                findViewById(R.id.team_a_ball_2).setBackgroundResource(R.color.colorSuccess);
                break;
            case 2:
                currentView = findViewById(R.id.team_a_ball_2);
                findViewById(R.id.team_a_ball_3).setBackgroundResource(R.color.colorSuccess);
                break;
            case 3:
                currentView = findViewById(R.id.team_a_ball_3);
                findViewById(R.id.team_a_ball_4).setBackgroundResource(R.color.colorSuccess);
                break;
            case 4:
                currentView = findViewById(R.id.team_a_ball_4);
                findViewById(R.id.team_a_ball_5).setBackgroundResource(R.color.colorSuccess);
                break;
            case 5:
                currentView = findViewById(R.id.team_a_ball_5);
                findViewById(R.id.team_a_ball_6).setBackgroundResource(R.color.colorSuccess);
                break;
            case 6:
                currentView = findViewById(R.id.team_a_ball_6);
                break;
            case 7:
                currentView = findViewById(R.id.team_a_ball_1);
                swap = findViewById(R.id.team_a_ball_2);
                swap.setText("0");
                swap.setBackgroundResource(R.color.colorSuccess);
                swap = findViewById(R.id.team_a_ball_3);
                swap.setText("0");
                swap.setBackgroundResource(R.color.colorGray300);
                swap = findViewById(R.id.team_a_ball_4);
                swap.setText("0");
                swap.setBackgroundResource(R.color.colorGray300);
                swap = findViewById(R.id.team_a_ball_5);
                swap.setText("0");
                swap.setBackgroundResource(R.color.colorGray300);
                swap = findViewById(R.id.team_a_ball_6);
                swap.setText("0");
                swap.setBackgroundResource(R.color.colorGray300);
                ball = 1;
                swap = findViewById(R.id.team_a_over);
                swap.setText(String.format("%d", Integer.parseInt(swap.getText().toString()) + 1));
        }
        currentView.setText(displayScore);
        if (displayScore.equalsIgnoreCase("o")) {
            currentView.setBackgroundResource(R.color.colorDanger);
            swap = findViewById(R.id.team_a_wickets);
            swap.setText(String.format("%d", Integer.parseInt(swap.getText().toString()) + 1));
        } else currentView.setBackgroundResource(R.color.colorGray500);
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
