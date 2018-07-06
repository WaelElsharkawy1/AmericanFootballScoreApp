package com.example.waelmelsh.AmericanFootballScoreApp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
     int Acounter = 0;
     int Bcounter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null){
            Acounter =savedInstanceState.getInt("Acounter");
            Bcounter =savedInstanceState.getInt("Bcounter");
            displayA(Acounter);
            displayB(Bcounter);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("Acounter",Acounter);
        outState.putInt("Bcounter",Bcounter);

    }

    public void Aplus3(View view) {
        Acounter = Acounter + 3;
        displayA(Acounter);
    }

    public void Aplus2(View view) {
        Acounter = Acounter + 2;
        displayA(Acounter);
    }

    public void AFreeThrow(View view) {
        Acounter = Acounter + 5;
        displayA(Acounter);

    }

    public void Bplus3(View view) {
        Bcounter = Bcounter + 3;
        displayB(Bcounter);
    }

    public void Bplus2(View view) {
        Bcounter = Bcounter + 2;
        displayB(Bcounter);
    }

    public void BFreeThrow(View view) {
        Bcounter = Bcounter + 5;
        displayB(Bcounter);
    }

    public void DoReset(View view) {
        Acounter = 0;
        Bcounter = 0;
        displayA(Acounter);
        displayB(Bcounter);
        Toast.makeText(this, R.string.ResetMessage , Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("SetTextI18n")
    private void displayB(int counter) {
        TextView BScoretxt = (TextView) findViewById(R.id.txtScoreTeamB);
        BScoretxt.setText(counter +"");

    }

    @SuppressLint("SetTextI18n")
    private void displayA(int counter) {
        TextView AScoretxt = (TextView) findViewById(R.id.txtScoreTeamA);
        AScoretxt.setText(counter +"");
    }

}
