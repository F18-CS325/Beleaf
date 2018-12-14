package edu.umass.cs325.beleaf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import edu.umass.cs325.beleaf.R;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private static ImageView imgview;
    private static Button buttonsbm;
    private static TextView tview;
    private int current_image;
    int[] images={R.drawable.imageone,R.drawable.imagetwo,R.drawable.imagethree};
    String[] text={"Here is your Forest! Feed it water, seeds and leaves to make it grow!", "Good Job! Forest Growing!", "Forest Dying! Feed it more water!"};

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_news:
                    Intent intentNews = new Intent(MainActivity.this, News.class);
                    startActivity(intentNews);
                    //mTextMessage.setText(R.string.title_news);
                    break;
                case R.id.navigation_footprint:
                    Intent intentFoot = new Intent(MainActivity.this, Footprint.class);
                    startActivity(intentFoot);
                    //mTextMessage.setText(R.string.title_footprint);
                    break;
                case R.id.navigation_forest:
                    Intent intentForest = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intentForest);
                    //mTextMessage.setText(R.string.title_forest);
                    break;
                case R.id.navigation_goals:
                    Intent intentGoal = new Intent(MainActivity.this, Goals.class);
                    startActivity(intentGoal);
                    //mTextMessage.setText(R.string.title_goals);
                    break;
                case R.id.navigation_me:
                    Intent intentMe = new Intent(MainActivity.this, Me.class);
                    startActivity(intentMe);
                    //mTextMessage.setText(R.string.title_me);
                    break;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        buttonclick();
    }
    public void buttonclick(){
        imgview=(ImageView)findViewById(R.id.imageView);
        buttonsbm=(Button)findViewById(R.id.button);
        tview = (TextView) findViewById(R.id.textView14);
        buttonsbm.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        current_image++;
                        current_image=current_image % images.length;
                        imgview.setImageResource(images[current_image]);
                        tview.setText(text[current_image]);

                    }
                }
        );

    }
}
