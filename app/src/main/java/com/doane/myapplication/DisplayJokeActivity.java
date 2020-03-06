package com.doane.myapplication;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class DisplayJokeActivity extends Activity {

    private jokeSelect joker = new jokeSelect();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_display_joke);
        Intent intent = getIntent();
        String jokeType = intent.getStringExtra("Joke");
        TextView jokeText = (TextView) findViewById(R.id.joke);
          jokeText.setText(joker.getJoke(jokeType));
      //  jokeText.setText(jokeType);
    }
}
