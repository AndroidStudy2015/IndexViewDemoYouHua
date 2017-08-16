package com.example.apple.indexviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;

import com.example.apple.indexviewdemo.adapter.MyAdapter;
import com.example.apple.indexviewdemo.view.IndexView;

import java.util.Arrays;

public class Main2Activity extends AppCompatActivity {
    private String[] firstLetterArrays =
            {"定位", "热门",
                    "A", "B", "C", "D", "E", "F", "G",
                    "H", "I", "J", "K", "L", "M", "N",
                    "O", "P", "Q", "R", "S", "T", "U",
                    "V", "W", "X", "Y", "Z",
            "#"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        IndexView indexView = (IndexView) findViewById(R.id.indexView);


//      1. set初始化城市集合
        indexView.setOriginalCityStrings(Arrays.asList(getResources().getStringArray(R.array.city_array)));
//      2.set右侧indexBar显示的内容
        indexView.setIndexBarData(firstLetterArrays,50);
        indexView.setIndexBarSizeAndGravityAndMargin(100,1800, Gravity.TOP|Gravity.RIGHT,0,100,0,0);

//      3.设置A字符在firstLetterArrays中的索引
        indexView.setPositionA(2);
//      4.setAdapter,注意一定要传入排序后的城市列表
        indexView.setAdapter(new MyAdapter(this,indexView.getSortCityList(),2));
    }

}
