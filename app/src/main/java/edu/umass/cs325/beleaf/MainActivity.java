package edu.umass.cs325.beleaf;

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

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_news:
                    mTextMessage.setText(R.string.title_news);
                    return true;
                case R.id.navigation_footprint:
                    mTextMessage.setText(R.string.title_footprint);
                    return true;
                case R.id.navigation_forest:
                    mTextMessage.setText(R.string.title_forest);
                    return true;
                case R.id.navigation_goals:
                    mTextMessage.setText(R.string.title_goals);
                    return true;
                case R.id.navigation_me:
                    mTextMessage.setText(R.string.title_me);
                    return true;
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
