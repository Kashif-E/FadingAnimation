package com.infinity.fadinganimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean homer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void fade(View view)
    {

        if(homer)
        {
            ImageView simpsons= (ImageView)findViewById(R.id.imageView);
            simpsons.animate().alphaBy(0).setDuration(2000000);

            simpsons.setImageResource(R.drawable.sim2);
            simpsons.animate().alphaBy(1).setDuration(1000);
            homer=false;

        }
        else
        {
            ImageView simpsons= (ImageView)findViewById(R.id.imageView);
            simpsons.animate().alphaBy(0).setDuration(2000000);
            Log.i("hh","hj");
            simpsons.setImageResource(R.drawable.sim1);
            simpsons.animate().alphaBy(1).setDuration(1000);


            homer=true;

        }


    }
}
