package com.example.a2_activities;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MyNewActivity extends AppCompatActivity {

    private String tag = "Zdarzenie: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag,"onCreate(new)");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_new);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onStart(){

        super.onStart();
        Log.d(tag,"onStart(new)");
    }
    @Override
    public void onRestart(){

        super.onRestart();
        Log.d(tag,"onRestart(new)");
    }
    @Override
    public  void onResume(){

        super.onResume();
        Log.d(tag,"onResume(new)");

    }
    @Override
    public  void onPause(){

        super.onPause();

        Log.d(tag,"onPause(new)");
    }
    @Override
    public void onStop(){

        super.onStop();
        Log.d(tag,"onStop(new)");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag,"onDestroy(new)");
    }
}