package com.doane.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class PromptJokeActivity extends Activity {

    private jokeSelect joker = new jokeSelect();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompt_joke);
    }

    //onCLick
    public void JokeOne(View view){

        Intent intent = new Intent(this, DisplayJokeActivity.class);
        Spinner currJoke = (Spinner) findViewById(R.id.joke);
        String selected = String.valueOf(currJoke.getSelectedItem());
        intent.putExtra("Joke", selected);
        startActivity(intent);
    }
}
