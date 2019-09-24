package com.nvk.codingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String KEY_NAME_TEXT ="intent_string" ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }



    public void AddToCart(View view) {
        Button btn = (Button) view;
        String name = btn.getText().toString();
        Intent intent = new Intent();
        intent.putExtra(KEY_NAME_TEXT,name);
        setResult(RESULT_OK,intent);

        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("abcxyz","onDestroy");
    }
}
