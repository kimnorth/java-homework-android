package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCountActivity extends AppCompatActivity {

    EditText phraseText;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        Log.d(getClass().toString(), "onCreate called");

        phraseText = (EditText)findViewById(R.id.phrase_text);
        countButton = (Button)findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View button){
        Log.d(getClass().toString(), "Button was clicked");

        String phrase = phraseText.getText().toString();
        Log.d("Phrase entered was: ", phrase);

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("phrase", phrase);

        startActivity(intent);
    }




}
