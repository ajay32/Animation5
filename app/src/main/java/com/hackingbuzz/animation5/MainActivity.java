package com.hackingbuzz.animation5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void noImage(View view) {   //view is an empty view ...we put it in another variable so that we can work on it like getting image n set animation

        ImageView gettingPenguin = (ImageView) view;                 // if we get anything first we hold it in simlar type of variable and then use it ..we dont directly use it

        // now we need penguin image ...n we also setting the way we want it to come in Empty ImageView

        gettingPenguin.setTranslationY(-1000f);     // style in which we want the image to come
        gettingPenguin.animate().translationYBy(1000).setDuration(2000);

        gettingPenguin.setImageResource(R.drawable.bb);








    }
}
