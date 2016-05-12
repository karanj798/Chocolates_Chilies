package com.jariwala.karan.chocolateschilies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int chocolatesLeft = 13;
    private TextView txtComputer;
    private TextView txtChocolatesRemaining;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private boolean lastTurnPlayer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne = (Button) findViewById(R.id.button);
        btnTwo = (Button) findViewById(R.id.button2);
        btnThree = (Button) findViewById(R.id.button3);
        txtComputer = (TextView) findViewById(R.id.txtComputer);
        txtChocolatesRemaining = (TextView) findViewById(R.id.txtChocolatesRemaining);
        txtComputer.setText("Thinking...");
        txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
        Toast.makeText(MainActivity.this, "Your Turn", Toast.LENGTH_SHORT).show();
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chocolatesLeft = chocolatesLeft - 1;
                txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                lastTurnPlayer = true;
                if (chocolatesLeft > 0) {
                    if (chocolatesLeft >= 4) {
                        chocolatesLeft = chocolatesLeft - (4 - 1);
                        txtComputer.setText("Computer took: " + 3);
                        txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                        lastTurnPlayer = false;
                    } else {
                        switch (chocolatesLeft) {
                            case 1:
                                chocolatesLeft = chocolatesLeft - 1;
                                txtComputer.setText("Computer took: " + 1);
                                txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                                lastTurnPlayer = false;
                                break;
                            case 2:
                                chocolatesLeft = chocolatesLeft - 2;
                                txtComputer.setText("Computer took: " + 2);
                                txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                                lastTurnPlayer = false;
                                break;
                            case 3:
                                chocolatesLeft = chocolatesLeft - 3;
                                txtComputer.setText("Computer took: " + 3);
                                txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                                lastTurnPlayer = false;
                                break;
                        }
                    }
                }
                if (chocolatesLeft == 1){
                    btnTwo.setEnabled(false);
                    btnThree.setEnabled(false);
                }
                if (chocolatesLeft == 2){
                    btnThree.setEnabled(false);
                }
                if (chocolatesLeft == 0) {
                    if (lastTurnPlayer){
                        Toast.makeText(MainActivity.this, "Computer eats the chili", Toast.LENGTH_SHORT).show();
                    }
                    else if (!lastTurnPlayer){
                        Toast.makeText(MainActivity.this, "You eat the chili", Toast.LENGTH_SHORT).show();
                    }
                    btnOne.setEnabled(false);
                    btnThree.setEnabled(false);
                    btnTwo.setEnabled(false);
                }
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chocolatesLeft = chocolatesLeft - 2;
                txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                lastTurnPlayer = true;
                if (chocolatesLeft > 0) {
                    if (chocolatesLeft >= 4) {
                        chocolatesLeft = chocolatesLeft - 2;
                        txtComputer.setText("Computer took: " + 2);
                        txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                        lastTurnPlayer = false;
                    } else {
                        switch (chocolatesLeft) {
                            case 1:
                                chocolatesLeft = chocolatesLeft - 1;
                                txtComputer.setText("Computer took: " + 1);
                                txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                                lastTurnPlayer = false;
                                break;
                            case 2:
                                chocolatesLeft = chocolatesLeft - 2;
                                txtComputer.setText("Computer took: " + 2);
                                txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                                lastTurnPlayer = false;
                                break;
                            case 3:
                                chocolatesLeft = chocolatesLeft - 3;
                                txtComputer.setText("Computer took: " + 3);
                                txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                                lastTurnPlayer = false;
                                break;
                        }
                    }
                }
                if (chocolatesLeft == 1){
                    btnTwo.setEnabled(false);
                    btnThree.setEnabled(false);
                }
                if (chocolatesLeft == 2){
                    btnThree.setEnabled(false);
                }
                if (chocolatesLeft == 0) {
                    if (lastTurnPlayer){
                        Toast.makeText(MainActivity.this, "Computer eats the chili", Toast.LENGTH_SHORT).show();
                    }
                    else if (!lastTurnPlayer){
                        Toast.makeText(MainActivity.this, "You eat the chili", Toast.LENGTH_SHORT).show();
                    }
                    btnOne.setEnabled(false);
                    btnThree.setEnabled(false);
                    btnTwo.setEnabled(false);
                }
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chocolatesLeft = chocolatesLeft - 3;
                txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                lastTurnPlayer = true;
                if (chocolatesLeft > 0) {
                    if (chocolatesLeft >= 4) {
                        chocolatesLeft = chocolatesLeft - 1;
                        txtComputer.setText("Computer took: " + 1);
                        txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                        lastTurnPlayer = false;
                    } else {
                        switch (chocolatesLeft) {
                            case 1:
                                chocolatesLeft = chocolatesLeft - 1;
                                txtComputer.setText("Computer took: " + 1);
                                txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                                lastTurnPlayer = false;
                                break;
                            case 2:
                                chocolatesLeft = chocolatesLeft - 2;
                                txtComputer.setText("Computer took: " + 2);
                                txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                                lastTurnPlayer = false;
                                break;
                            case 3:
                                chocolatesLeft = chocolatesLeft - 3;
                                txtComputer.setText("Computer took: " + 3);
                                txtChocolatesRemaining.setText("Chocolates Remaining: " + chocolatesLeft);
                                lastTurnPlayer = false;
                                break;
                        }
                    }
                }
                if (chocolatesLeft == 1){
                    btnTwo.setEnabled(false);
                    btnThree.setEnabled(false);
                }
                if (chocolatesLeft == 2){
                    btnThree.setEnabled(false);
                }
                if (chocolatesLeft == 0) {
                    if (lastTurnPlayer){
                        Toast.makeText(MainActivity.this, "Computer eats the chili", Toast.LENGTH_SHORT).show();
                    }
                    else if (!lastTurnPlayer){
                        Toast.makeText(MainActivity.this, "You eat the chili", Toast.LENGTH_SHORT).show();
                    }
                    btnOne.setEnabled(false);
                    btnThree.setEnabled(false);
                    btnTwo.setEnabled(false);
                }
            }
        });
    }
    void Temp (){

    }
}
