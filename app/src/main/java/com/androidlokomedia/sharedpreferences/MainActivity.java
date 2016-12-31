package com.androidlokomedia.sharedpreferences;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        SharedPreferences sharedPreferences =  this.getSharedPreferences("com.androidlokomedia.sharedpreferences", Context.MODE_PRIVATE);
//        sharedPreferences.edit().putString("username","saifuddin").apply();
//
//        String username = sharedPreferences.getString("username","");

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.androidlokomedia.sharedpreferences", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("username","ahmad").apply();
        String username = sharedPreferences.getString("username","");

        Log.i("username", "onCreate: "+username);

        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Are you sure?")
                .setMessage("do you definitely want to do this?")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.i("posistif", "onClick: Button tapped");
                    }
                })
                .setNegativeButton("No", null).show();
    }
}
