package com.example.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView list_test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_test = (ListView)findViewById(R.id.list); //리스트 뷰 아이디 값 가져오기

        List<String> data = new ArrayList<>(); //리스트 뷰를 담을 배열 변수 선언

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
        //리스트 뷰에 경우 바로 배열에 넣을 수 없어 배열로 넣을 수 있도록 변환해주는 어댑터 생성
        list_test.setAdapter(adapter);
        //리스트 뷰에 어댑터 장착
        data.add("미미");
        data.add("체리");
        adapter.notifyDataSetChanged();
        //입력 한 배열 저장


    }
}