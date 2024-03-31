package com.example.testingapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Flower extends Fragment {

    Activity context_flower;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context_flower = getActivity();
        return inflater.inflate(R.layout.activity_flower,container,false);
    }

    @Override
    public void onViewCreated(View view,@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = view.findViewById(R.id.listview_flower);

        List<String> list = new ArrayList<>();
        list.add("နှင်းဆီ (Rose) စိုက်ပျိုးခြင်း");
        list.add("မေမြို့ပန်း (China aster) စိုက်ပျိုးခြင်း");
        list.add("စံပယ်ပန်း (Jasmine) စိုက်ပျိုးခြင်း");
        list.add("သစ္စာပန်း (Gladiolus) စိုက်ပျိုးခြင်း");
        list.add("သစ်ခွပန်း (Orchid) စိုက်ပျိုးခြင်း");
        list.add("ဂန္ဓမာပန်း (Chrysanthemum) စိုက်ပျိုးခြင်း");
        list.add("ဇော်စိမ်း၊ဇော်ကြား (Cordyline) စိုက်ပျိုးခြင်း");
        list.add("ရွက်လှပင် (Colon) များစိုက်ပျိုးခြင်း");
        list.add("သပြေပန်း (Eugenia) စိုက်ပျိုးခြင်း");

        ArrayAdapter arrayAdapter1 = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.my_list_view,list);
        listView.setAdapter(arrayAdapter1);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent = new Intent(context_flower,Rose.class);
                    startActivity(intent);
                }else if(position==1){
                    Intent intent1 = new Intent(context_flower,ChinaAster.class);
                    startActivity(intent1);
                }else if(position==2){
                    Intent intent2 = new Intent(context_flower,Jasmin.class);
                    startActivity(intent2);
                }else if(position==3){
                    Intent intent3 = new Intent(context_flower,Gladiolus.class);
                    startActivity(intent3);
                }
                else if(position==4){
                    Intent intent4 = new Intent(context_flower,Orchid.class);
                    startActivity(intent4);
                }
                else if(position==5){
                    Intent intent5 = new Intent(context_flower,Chrysanthemum.class);
                    startActivity(intent5);
                }else if(position==6){
                    Intent intent6 = new Intent(context_flower,Cordyline.class);
                    startActivity(intent6);
                }else if(position==7){
                    Intent intent7 = new Intent(context_flower,Colon.class);
                    startActivity(intent7);
                }
                else if(position==8){
                    Intent intent8 = new Intent(context_flower,Eugenia.class);
                    startActivity(intent8);
                }
            }
        });
    }
}