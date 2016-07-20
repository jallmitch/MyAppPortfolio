package com.example.jessemitchell.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popularMovies(View view)
    {
        Toast.makeText(this,
                       getResources().getString(R.string.popular_movies) + " " +
                       getResources().getString(R.string.toast_message),
                       Toast.LENGTH_LONG).show();
    }

    public void stockHawk(View view)
    {
        Toast.makeText(this,
                       getResources().getString(R.string.stock_hawk) + " " +
                       getResources().getString(R.string.toast_message),
                       Toast.LENGTH_LONG).show();
    }

    public void buildBigger(View view)
    {
        Toast.makeText(this,
                       getResources().getString(R.string.build_bigger) + " " +
                       getResources().getString(R.string.toast_message),
                       Toast.LENGTH_LONG).show();
    }

    public void appMaterial(View view)
    {
        Toast.makeText(this,
                       getResources().getString(R.string.app_material) + " " +
                       getResources().getString(R.string.toast_message),
                       Toast.LENGTH_LONG).show();
    }

    public void ubiquitous(View view)
    {
        Toast.makeText(this,
                       getResources().getString(R.string.go_ubiquitous) + " " +
                       getResources().getString(R.string.toast_message),
                       Toast.LENGTH_LONG).show();
    }

    public void capstone(View view)
    {
        Toast.makeText(this,
                       getResources().getString(R.string.capstone) + " " +
                       getResources().getString(R.string.toast_message),
                       Toast.LENGTH_LONG).show();
    }
}
