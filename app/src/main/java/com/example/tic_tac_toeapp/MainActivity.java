package com.example.tic_tac_toeapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean checkTies,checkTies1,checkTies2,checkTies3,checkTies4,checkTies5,checkTies6,checkTies7;
    int inc,incO,incT = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button XoButton1 = findViewById(R.id.button1);
        Button XoButton2 = findViewById(R.id.button2);
        Button XoButton3 = findViewById(R.id.button3);
        Button XoButton4 = findViewById(R.id.button4);
        Button XoButton5 = findViewById(R.id.button5);
        Button XoButton6 = findViewById(R.id.button6);
        Button XoButton7 = findViewById(R.id.button7);
        Button XoButton8 = findViewById(R.id.button8);
        Button XoButton9 = findViewById(R.id.button9);
        Button XoButton10 = findViewById(R.id.button10);
        Button XoButton11= findViewById(R.id.button11);
        TextView xNumber = findViewById(R.id.xNumber);
        TextView oNumber = findViewById(R.id.oNumber);
        TextView tNumber = findViewById(R.id.tieNumber);
        TextView XOMove = findViewById(R.id.XOMove);
        XOMove.setText("X");



    XoButton1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (XOMove.getText().equals("X")){
            XoButton1.setText("X");
                XOMove.setText("O");

            }
            else {
                XoButton1.setText("O");
                XOMove.setText("X");

            }

            //rows
            if(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText())){

                if(XoButton1.getText().equals("X")){
                    inc = inc+1;
                    xNumber.setText(String.valueOf(inc));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("X's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");

                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();




                }
                else if(XoButton1.getText().equals("O")){
                    incO = incO+1;
                    oNumber.setText(String.valueOf(incO));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("O's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
                checkTies = true;




            }
            else if (!(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText()))){
                checkTies = false;
            }


            if(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText())){

                if(XoButton4.getText().equals("X")){
                    inc = inc+1;
                    xNumber.setText(String.valueOf(inc));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("X's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
                else if(XoButton4.getText().equals("O")){
                    incO = incO+1;
                    oNumber.setText(String.valueOf(incO));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("O's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
                checkTies1 = true;

            }
            else if (!(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText()))){
                checkTies1 = false;
            }


            if(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText())){
                if(XoButton7.getText().equals("X")){
                    inc = inc+1;
                    xNumber.setText(String.valueOf(inc));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("X's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
                else if(XoButton7.getText().equals("O")){
                    incO = incO+1;
                    oNumber.setText(String.valueOf(incO));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("O's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
                checkTies2 = true;

            }
            else if (!(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText()))){
                checkTies2 = false;
            }
            //columns
            if(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText())){
                if(XoButton1.getText().equals("X")){
                    inc = inc+1;
                    xNumber.setText(String.valueOf(inc));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("X's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();

                }
                else if(XoButton1.getText().equals("O")){
                    incO = incO+1;
                    oNumber.setText(String.valueOf(incO));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("O's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
                checkTies3 = true;

            }
            else if (!(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText()))){
                checkTies3 = false;
            }


            if(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText())){
                if(XoButton2.getText().equals("X")){
                    inc = inc+1;
                    xNumber.setText(String.valueOf(inc));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("X's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();

                }
                else if(XoButton2.getText().equals("O")){
                    incO = incO+1;
                    oNumber.setText(String.valueOf(incO));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("O's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
                checkTies4 = true;

            }
            else if (!(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText()))){
                checkTies4 = false;
            }

            if(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText())){
                if(XoButton3.getText().equals("X")){
                    inc = inc+1;
                    xNumber.setText(String.valueOf(inc));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("X's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();

                }
                else if(XoButton3.getText().equals("O")){
                    incO = incO+1;
                    oNumber.setText(String.valueOf(incO));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("O's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
                checkTies5 = true;

            }
            else if (!(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText()))){
                checkTies5 = false;
            }

            //cross
            if(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText())){
                if(XoButton1.getText().equals("X")){
                    inc = inc+1;
                    xNumber.setText(String.valueOf(inc));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("X's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();

                }
                else if(XoButton1.getText().equals("O")){
                    incO = incO+1;
                    oNumber.setText(String.valueOf(incO));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("O's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
                checkTies6 = true;

            }
            else if (!(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText()))){
                checkTies6 = false;
            }

            if(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText())){
                if(XoButton3.getText().equals("X")){
                    inc = inc+1;
                    xNumber.setText(String.valueOf(inc));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("X's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");
                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();

                }
                else if(XoButton3.getText().equals("O")){
                    incO = incO+1;
                    oNumber.setText(String.valueOf(incO));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("O's is the Winner!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
                checkTies7 = true;

            }
            else if (!(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText()))){
                checkTies7 = false;
            }

        }
    });
        XoButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (XOMove.getText().equals("X")){
                    XoButton2.setText("X");
                    XOMove.setText("O");

                }
                else {
                    XoButton2.setText("O");
                    XOMove.setText("X");

                }

                //rows
                if(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies = true;

                }
                else if (!(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText()))){
                    checkTies = false;
                }


                if(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText())){

                    if(XoButton4.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    else if(XoButton4.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies1 = true;

                }
                else if (!(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText()))){
                    checkTies1 = false;
                }


                if(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText())){
                    if(XoButton7.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    else if(XoButton7.getText().equals("O")){
                        incO = incO+1;


                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies2 = true;

                }
                else if (!(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText()))){
                    checkTies2 = false;
                }
                //columns
                if(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies3 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText()))){
                    checkTies3 = false;
                }


                if(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText())){
                    if(XoButton2.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton2.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies4 = true;

                }
                else if (!(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText()))){
                    checkTies4 = false;
                }

                if(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies5 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText()))){
                    checkTies5 = false;
                }

                //cross
                if(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies6 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText()))){
                    checkTies6 = false;
                }

                if(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies7 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText()))){
                    checkTies7 = false;
                }


            }
        });
        XoButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (XOMove.getText().equals("X")){
                    XoButton3.setText("X");
                    XOMove.setText("O");

                }
                else {
                    XoButton3.setText("O");
                    XOMove.setText("X");

                }

                //rows
                if(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies = true;

                }
                else if (!(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText()))){
                    checkTies = false;
                }


                if(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText())){

                    if(XoButton4.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    else if(XoButton4.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies1 = true;

                }
                else if (!(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText()))){
                    checkTies1 = false;
                }


                if(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText())){
                    if(XoButton7.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    else if(XoButton7.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies2 = true;

                }
                else if (!(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText()))){
                    checkTies2 = false;
                }
                //columns
                if(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies3 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText()))){
                    checkTies3 = false;
                }


                if(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText())){
                    if(XoButton2.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();


                    }
                    else if(XoButton2.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies4 = true;

                }
                else if (!(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText()))){
                    checkTies4 = false;
                }

                if(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies5 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText()))){
                    checkTies5 = false;
                }

                //cross
                if(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();


                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies6 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText()))){
                    checkTies6 = false;
                }

                if(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies7 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText()))){
                    checkTies7 = false;
                }


            }
        });
        XoButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (XOMove.getText().equals("X")){
                    XoButton4.setText("X");
                    XOMove.setText("O");

                }
                else {
                    XoButton4.setText("O");
                    XOMove.setText("X");

                }

                //rows
                if(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies = true;

                }
                else if (!(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText()))){
                    checkTies = false;
                }


                if(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText())){

                    if(XoButton4.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    else if(XoButton4.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies1 = true;

                }
                else if (!(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText()))){
                    checkTies1 = false;
                }


                if(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText())){
                    if(XoButton7.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    else if(XoButton7.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies2 = true;

                }
                else if (!(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText()))){
                    checkTies2 = false;
                }
                //columns
                if(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies3 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText()))){
                    checkTies3 = false;
                }


                if(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText())){
                    if(XoButton2.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton2.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies4 = true;

                }
                else if (!(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText()))){
                    checkTies4 = false;
                }

                if(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies5 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText()))){
                    checkTies5 = false;
                }

                //cross
                if(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();


                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies6 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText()))){
                    checkTies6 = false;
                }

                if(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    checkTies7 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText()))){
                    checkTies7 = false;
                }

            }
        });
        XoButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (XOMove.getText().equals("X")){
                    XoButton5.setText("X");
                    XOMove.setText("O");

                }
                else {
                    XoButton5.setText("O");
                    XOMove.setText("X");

                }

                //rows
                if(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();


                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies = true;

                }
                else if (!(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText()))){
                    checkTies = false;
                }


                if(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText())){

                    if(XoButton4.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    else if(XoButton4.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies1 = true;

                }
                else if (!(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText()))){
                    checkTies1 = false;
                }


                if(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText())){
                    if(XoButton7.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    else if(XoButton7.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies2 = true;

                }
                else if (!(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText()))){
                    checkTies2 = false;
                }
                //columns
                if(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies3 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText()))){
                    checkTies3 = false;
                }


                if(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText())){
                    if(XoButton2.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton2.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies4 = true;

                }
                else if (!(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText()))){
                    checkTies4 = false;
                }

                if(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies5 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText()))){
                    checkTies5 = false;
                }

                //cross
                if(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();


                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies6 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText()))){
                    checkTies6 = false;
                }

                if(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies7 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText()))){
                    checkTies7 = false;
                }


            }
        });
        XoButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (XOMove.getText().equals("X")){
                    XoButton6.setText("X");
                    XOMove.setText("O");

                }
                else {
                    XoButton6.setText("O");
                    XOMove.setText("X");

                }


                //rows
                if(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies = true;

                }
                else if (!(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText()))){
                    checkTies = false;
                }


                if(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText())){

                    if(XoButton4.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton4.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies1 = true;

                }
                else if (!(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText()))){
                    checkTies1 = false;
                }


                if(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText())){
                    if(XoButton7.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    else if(XoButton7.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies2 = true;

                }
                else if (!(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText()))){
                    checkTies2 = false;
                }
                //columns
                if(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies3 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText()))){
                    checkTies3 = false;
                }


                if(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText())){
                    if(XoButton2.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton2.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies4 = true;

                }
                else if (!(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText()))){
                    checkTies4 = false;
                }

                if(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies5 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText()))){
                    checkTies5 = false;
                }

                //cross
                if(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies6 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText()))){
                    checkTies6 = false;
                }

                if(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies7 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText()))){
                    checkTies7 = false;
                }



            }
        });
        XoButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (XOMove.getText().equals("X")){
                    XoButton7.setText("X");
                    XOMove.setText("O");

                }
                else {
                    XoButton7.setText("O");
                    XOMove.setText("X");

                }

                //rows
                if(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies = true;

                }
                else if (!(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText()))){
                    checkTies = false;
                }


                if(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText())){

                    if(XoButton4.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    else if(XoButton4.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies1 = true;

                }
                else if (!(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText()))){
                    checkTies1 = false;
                }


                if(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText())){
                    if(XoButton7.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    else if(XoButton7.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies2 = true;

                }
                else if (!(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText()))){
                    checkTies2 = false;
                }
                //columns
                if(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();


                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies3 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText()))){
                    checkTies3 = false;
                }


                if(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText())){
                    if(XoButton2.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();


                    }
                    else if(XoButton2.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies4 = true;

                }
                else if (!(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText()))){
                    checkTies4 = false;
                }

                if(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies5 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText()))){
                    checkTies5 = false;
                }

                //cross
                if(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    checkTies6 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText()))){
                    checkTies6 = false;
                }

                if(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies7 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText()))){
                    checkTies7 = false;
                }



            }
        });
        XoButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (XOMove.getText().equals("X")){
                    XoButton8.setText("X");
                    XOMove.setText("O");

                }
                else {
                    XoButton8.setText("O");
                    XOMove.setText("X");

                }

                //rows
                if(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies = true;

                }
                else if (!(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText()))){
                    checkTies = false;
                }


                if(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText())){

                    if(XoButton4.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton4.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies1 = true;

                }
                else if (!(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText()))){
                    checkTies1 = false;
                }


                if(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText())){
                    if(XoButton7.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton7.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies2 = true;

                }
                else if (!(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText()))){
                    checkTies2 = false;
                }
                //columns
                if(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies3 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText()))){
                    checkTies3 = false;
                }


                if(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText())){
                    if(XoButton2.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton2.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies4 = true;

                }
                else if (!(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText()))){
                    checkTies4 = false;
                }

                if(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies5 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText()))){
                    checkTies5 = false;
                }

                //cross
                if(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies6 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText()))){
                    checkTies6 = false;
                }

                if(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies7 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText()))){
                    checkTies7 = false;
                }


            }
        });
        XoButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (XOMove.getText().equals("X")){
                    XoButton9.setText("X");
                    XOMove.setText("O");

                }
                else {
                    XoButton9.setText("O");
                    XOMove.setText("X");

                }

                //rows
                if(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();


                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies = true;

                }
                else if (!(XoButton1.getText().equals(XoButton2.getText()) && XoButton1.getText().equals(XoButton3.getText()))){
                    checkTies = false;
                }


                if(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText())){

                    if(XoButton4.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    else if(XoButton4.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies1 = true;

                }
                else if (!(XoButton4.getText().equals(XoButton5.getText()) && XoButton4.getText().equals(XoButton6.getText()))){
                    checkTies1 = false;
                }


                if(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText())){
                    if(XoButton7.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    else if(XoButton7.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies2 = true;

                }
                else if (!(XoButton7.getText().equals(XoButton8.getText()) && XoButton7.getText().equals(XoButton9.getText()))){
                    checkTies2 = false;
                }
                //columns
                if(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies3 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton4.getText()) && XoButton1.getText().equals(XoButton7.getText()))){
                    checkTies3 = false;
                }


                if(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText())){
                    if(XoButton2.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton2.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    checkTies4 = true;

                }
                else if (!(XoButton2.getText().equals(XoButton5.getText()) && XoButton2.getText().equals(XoButton8.getText()))){
                    checkTies4 = false;
                }

                if(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies5 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton6.getText()) && XoButton3.getText().equals(XoButton9.getText()))){
                    checkTies5 = false;
                }

                //cross
                if(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText())){
                    if(XoButton1.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton1.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies6 = true;

                }
                else if (!(XoButton1.getText().equals(XoButton5.getText()) && XoButton1.getText().equals(XoButton9.getText()))){
                    checkTies6 = false;
                }

                if(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText())){
                    if(XoButton3.getText().equals("X")){
                        inc = inc+1;
                        xNumber.setText(String.valueOf(inc));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("X's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();

                    }
                    else if(XoButton3.getText().equals("O")){
                        incO = incO+1;
                        oNumber.setText(String.valueOf(incO));

                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("O's is the Winner!");
                        builder1.setCancelable(false);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        XoButton1.setText("");
                                        XoButton2.setText("");
                                        XoButton3.setText("");
                                        XoButton4.setText("");
                                        XoButton5.setText("");
                                        XoButton6.setText("");
                                        XoButton7.setText("");
                                        XoButton8.setText("");
                                        XoButton9.setText("");
                                        dialog.cancel();
                                    }
                                });


                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                    checkTies7 = true;

                }
                else if (!(XoButton3.getText().equals(XoButton5.getText()) && XoButton3.getText().equals(XoButton7.getText()))){
                    checkTies7 = false;
                }



            }
        });
        XoButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                xNumber.setText("0");
                oNumber.setText("0");
                tNumber.setText("0");
                inc = 0;
                incT = 0;
                incO = 0;



            }
        });
        XoButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                XoButton1.setText("");
                XoButton2.setText("");
                XoButton3.setText("");
                XoButton4.setText("");
                XoButton5.setText("");
                XoButton6.setText("");
                XoButton7.setText("");
                XoButton8.setText("");
                XoButton9.setText("");


                if(checkTies == false && checkTies1 == false && checkTies2 == false && checkTies3 == false && checkTies4 == false && checkTies5 == false && checkTies6 == false && checkTies7 == false ){
                    incT = incT+1;
                    tNumber.setText(String.valueOf(incT));

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("Tie!");
                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    XoButton1.setText("");
                                    XoButton2.setText("");
                                    XoButton3.setText("");
                                    XoButton4.setText("");
                                    XoButton5.setText("");
                                    XoButton6.setText("");
                                    XoButton7.setText("");
                                    XoButton8.setText("");
                                    XoButton9.setText("");

                                    checkTies = true;
                                    checkTies1 = true;
                                    checkTies2 = true;
                                    checkTies3 = true;
                                    checkTies4 = true;
                                    checkTies5 = true;
                                    checkTies6 = true;
                                    checkTies7 = true;

                                    dialog.cancel();
                                }
                            });


                    AlertDialog alert11 = builder1.create();
                    alert11.show();

                }





            }
        });

    }
}