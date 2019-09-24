package com.nvk.codingchallenge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static com.nvk.codingchallenge.SecondActivity.KEY_NAME_TEXT;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUESTCODE = 1;
    private static final String KEY_1 = "KEY_1";
    private static final String KEY_2 = "KEY_2";
    private static final String KEY_3 = "KEY_3";
    private static final String KEY_4 = "KEY_4";
    private static final String KEY_5 = "KEY_5";
    private static final String KEY_6 = "KEY_6";
    private static final String KEY_7 = "KEY_7";
    private static final String KEY_8 = "KEY_8";
    private static final String KEY_9 = "KEY_9";
    private static final String KEY_10 = "KEY_10";
    private TextView tvCart1,tvCart2,tvCart3,tvCart4,tvCart5,tvCart6,tvCart7,tvCart8,tvCart9,tvCart10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Radiation();
        Log.d("abcxyz","----------");
        Log.d("abcxyz","onCreate");
    }

    private void Radiation() {
        tvCart1 = findViewById(R.id.tvCart1);
        tvCart2 = findViewById(R.id.tvCart2);
        tvCart3 = findViewById(R.id.tvCart3);
        tvCart4 = findViewById(R.id.tvCart4);
        tvCart5 = findViewById(R.id.tvCart5);
        tvCart6 = findViewById(R.id.tvCart6);
        tvCart7 = findViewById(R.id.tvCart7);
        tvCart8 = findViewById(R.id.tvCart8);
        tvCart9 = findViewById(R.id.tvCart9);
        tvCart10 = findViewById(R.id.tvCart10);

    }

    public void AddSP(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivityForResult(intent,TEXT_REQUESTCODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUESTCODE){
            if (resultCode == RESULT_OK){
                String name = data.getStringExtra(KEY_NAME_TEXT);
                Show( name);
            }

        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_1,tvCart1.getText().toString());
        outState.putString(KEY_2,tvCart2.getText().toString());
        outState.putString(KEY_3,tvCart3.getText().toString());
        outState.putString(KEY_4,tvCart4.getText().toString());
        outState.putString(KEY_5,tvCart5.getText().toString());
        outState.putString(KEY_6,tvCart6.getText().toString());
        outState.putString(KEY_7,tvCart7.getText().toString());
        outState.putString(KEY_8,tvCart8.getText().toString());
        outState.putString(KEY_9,tvCart9.getText().toString());
        outState.putString(KEY_10,tvCart10.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null){
            tvCart1.setText(savedInstanceState.getString(KEY_1));
            tvCart2.setText(savedInstanceState.getString(KEY_2));
            tvCart3.setText(savedInstanceState.getString(KEY_3));
            tvCart4.setText(savedInstanceState.getString(KEY_4));
            tvCart5.setText(savedInstanceState.getString(KEY_5));
            tvCart6.setText(savedInstanceState.getString(KEY_6));
            tvCart7.setText(savedInstanceState.getString(KEY_7));
            tvCart8.setText(savedInstanceState.getString(KEY_8));
            tvCart9.setText(savedInstanceState.getString(KEY_9));
            tvCart10.setText(savedInstanceState.getString(KEY_10));
        }
    }

    private void Show(String name) {
        switch (name){
            case "Gạo" :
                tvCart1.setText(name);
                break;
            case "Bơ" :
                tvCart2.setText(name);
                break;
            case "Táo" :
                tvCart3.setText(name);
                break;
            case "Thanh Long" :
                tvCart4.setText(name);
                break;
            case "Xoài" :
                tvCart5.setText(name);
                break;
            case "Nhãn" :
                tvCart6.setText(name);
                break;
            case "Chôm Chôm" :
                tvCart7.setText(name);
                break;
            case "Thịt" :
                tvCart8.setText(name);
                break;
            case "Trà sữa" :
                tvCart9.setText(name);
                break;
            case "Wiki" :
                tvCart10.setText(name);
                break;
        }
    }
}
