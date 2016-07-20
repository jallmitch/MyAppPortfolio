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
        Toast.makeText(this, "'POPULAR MOVIES' button selected", Toast.LENGTH_LONG).show();
    }

    public void stockHawk(View view)
    {
        Toast.makeText(this, "'STOCK HAWK' button selected", Toast.LENGTH_LONG).show();
    }

    public void buildBigger(View view)
    {
        Toast.makeText(this, "'BUILD IT BIGGER' button selected", Toast.LENGTH_LONG).show();
    }

    public void appMaterial(View view)
    {
        Toast.makeText(this, "'MAKE YOUR APP MATERIAL' button selected", Toast.LENGTH_LONG).show();
    }

    public void ubiquitous(View view)
    {
        Toast.makeText(this, "'GO UBIQUITOUS' button selected", Toast.LENGTH_LONG).show();
    }

    public void capstone(View view)
    {
        Toast.makeText(this, "'CAPSTONE' button selected", Toast.LENGTH_LONG).show();
    }
}
