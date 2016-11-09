package com.example.user.wordcountapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
/**
 * Created by user on 08/11/2016.
 */

public class WordCount extends AppCompatActivity {

    EditText mInputText;
    Button mButton;
    Counter mWords;
    TextView mAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("WordCounter", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInputText = (EditText) findViewById(R.id.sentence_text);

        mButton = (Button) findViewById(R.id.count_words);


        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("WordCounter", "Counter called");
                String words = mInputText.getText().toString();
                Log.d("WordCounter", "The input text is '" + words + "'");
                mWords = new Counter(words);
                int wordCount = mWords.wordCount();

                mAnswer = (TextView) findViewById(R.id.count_words);

                String answer = "Word count: "+ wordCount;
                mAnswer.setText(answer);
            }
        });
    }
}
