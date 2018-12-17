package edu.umass.cs325.beleaf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Me extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_news:
                    Intent intentNews = new Intent(Me.this, News.class);
                    startActivity(intentNews);
                    //mTextMessage.setText(R.string.title_news);
                    break;
                case R.id.navigation_footprint:
                    Intent intentFoot = new Intent(Me.this, Footprint.class);
                    startActivity(intentFoot);
                    //mTextMessage.setText(R.string.title_footprint);
                    break;
                case R.id.navigation_forest:
                    Intent intentForest = new Intent(Me.this, MainActivity.class);
                    startActivity(intentForest);
                    //mTextMessage.setText(R.string.title_forest);
                    break;
                case R.id.navigation_goals:
                    Intent intentGoal = new Intent(Me.this, Goals.class);
                    startActivity(intentGoal);
                    //mTextMessage.setText(R.string.title_goals);
                    break;
                case R.id.navigation_me:
                    Intent intentMe = new Intent(Me.this, Me.class);
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
        setContentView(R.layout.activity_me);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
