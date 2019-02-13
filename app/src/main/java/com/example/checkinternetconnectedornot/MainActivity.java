package com.example.checkinternetconnectedornot;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button checkInternet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkInternet=findViewById(R.id.checkInternet);
        checkInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //checkConnection();
                final ConnectivityManager conMgr = (ConnectivityManager)getSystemService(getApplicationContext().CONNECTIVITY_SERVICE);
                final NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();

                if (activeNetwork != null && activeNetwork.isConnected()){
                    Toast.makeText(MainActivity.this,"You are connected to Internet",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"You are not connected to Internet",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

//    protected boolean isOnline() {
//
//        ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo netInfo = cm.getActiveNetworkInfo();
//        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void checkConnection() {
//        if (isOnline()) {
//            Toast.makeText(MainActivity.this, "You are connected to Internet", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(MainActivity.this, "You are not connected to Internet", Toast.LENGTH_SHORT).show();
//
//        }
//    }
}
