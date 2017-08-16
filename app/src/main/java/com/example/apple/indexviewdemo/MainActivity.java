package com.example.apple.indexviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
//      PinYinUtils.  getCityQuanPin("重庆");


        for (int i = 0; i < 20; i++) {
            Log.e("AAAAAAAA",(char)('Z'+i)+"===");

        }

        String pinyin="*sdfsf";
         pinyin = pinyin.toUpperCase();
        char firstLetterTempPinyin = pinyin.charAt(0);
        Log.e("cccccccccc",firstLetterTempPinyin+"==="+('*'-'A')+"==="+('*'-'Z'));

        if ((firstLetterTempPinyin<'A')||(firstLetterTempPinyin>'Z')){
            pinyin='#'+pinyin;
            Log.e("cccccccccc",pinyin+"===");

        }
    }


}
