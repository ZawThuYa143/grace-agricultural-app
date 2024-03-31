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

public class Mushroom extends Fragment {

    Activity context_mushroom;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context_mushroom = getActivity();
        return inflater.inflate(R.layout.activity_mushroom,container,false);
    }

    @Override
    public void onViewCreated(View view,@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = view.findViewById(R.id.listview_mushroom);

        List<String> list = new ArrayList<>();
        list.add("မှို၏အင်္ဂါအစိတ်အပိုင်းများ");
        list.add("ကောက်ရိုးမှို မျိုးပြုလုပ်ခြင်း");
        list.add("ကောက်ရိုးမှိုစိုက်ပျိုးနည်း");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.my_list_view,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent = new Intent(context_mushroom,mushroom_organ.class);
                    startActivity(intent);
                }else if(position==1){
                    Intent intent1 = new Intent(context_mushroom,mushrroom_made.class);
                    startActivity(intent1);
                }else if(position==2){
                    Intent intent2 = new Intent(context_mushroom,mushroom_grow.class);
                    startActivity(intent2);
                }
            }
        });
    }
}