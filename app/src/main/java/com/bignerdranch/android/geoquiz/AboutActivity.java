package com.bignerdranch.android.geoquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Ovsyankin on 30.11.2016.
 */

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //String valueNote;
        setContentView(R.layout.activity_about);
        /*valueNote = getIntent().getExtras().getString("valueNote");
        TextView showText = (TextView)findViewById(R.id.show_text);
        showText.setText(valueNote);*/

    }
}
