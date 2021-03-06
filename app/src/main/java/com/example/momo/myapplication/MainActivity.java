package com.example.momo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private String[] data = {"Apple", "Banana", "Orange", "Watermelon",
            "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadingDialog.getInstance(this).dismiss();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

//        调用加载中页面
        //LoadingDialog.getInstance(this).show();
        //LoadingDialog.getInstance(this).dismiss();

    }


    //跳转到某一条记录的详情页
    public void next(View view) {
        Intent i = new Intent(this, detail.class);
        startActivity(i);
        //点击按钮时会触发加载动画
        LoadingDialog.getInstance(this).show();
    }
                                                                                                                                            
}
