package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AnswerActivity extends AppCompatActivity {

    WordCounter wordCounter;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        wordCounter = new WordCounter();



        String phrase = extras.getString("phrase");
        wordCounter.addPhrase(phrase);
        int words = wordCounter.getWordListLength();

        answerText = (TextView)findViewById(R.id.answer_text);
        answerText.setText(phrase + ": " + words + " words");
    }


}
