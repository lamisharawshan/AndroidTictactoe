package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int active_player=0;
public void dropin(View view)
{

    ImageView image=(ImageView) view;
    image.setTranslationY(-1500);
    if(active_player==0) {
        image.setImageResource(R.drawable.hashtag);
        active_player=1;
    }
    else if(active_player==1)
    {
        image.setImageResource(R.drawable.cross);
        active_player=0;
    }
    image.animate().translationYBy(1500).setDuration(300);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}