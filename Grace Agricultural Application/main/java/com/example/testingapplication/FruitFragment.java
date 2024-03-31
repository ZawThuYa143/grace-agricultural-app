package com.example.testingapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class FruitFragment extends Fragment {

    Activity context;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = getActivity();
        return inflater.inflate(R.layout.fragment_fruit,container,false);
    }

    @Override
    public void onViewCreated(View view,@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = view.findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("သရက်စိုက်ပျိုးခြင်း");
        list.add("ငှက်ပျောစိုက်ပျိုးခြင်း");
        list.add("နာနတ်စိုက်ပျိုးခြင်း");
        list.add("သင်္ဘောစိုက်ပျိုးခြင်း");
        list.add("ရှောက်၊ သံပုရာမျိုးရင်းဝင်အပင်များ");
        list.add("နဂါးမောက်စိုက်ပျိုးခြင်း");
        list.add("စပျစ်စိုက်ပျိုးခြင်း");
        list.add("ဖရဲစိုက်ပျိုးခြင်း");
        list.add("အုန်းစိုက်ပျိုးခြင်း");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.my_list_view,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent = new Intent(context,Mango.class);
                    startActivity(intent);
                }else if(position==1){
                    Intent intent1 = new Intent(context,Banana.class);
                    startActivity(intent1);
                }else if(position==2){
                    Intent intent2 = new Intent(context,Pineapple.class);
                    startActivity(intent2);
                }else if(position==3){
                    Intent intent3 = new Intent(context,Thinbaw.class);
                    startActivity(intent3);
                }else if(position==4){
                    Intent intent4 = new Intent(context,Limon.class);
                    startActivity(intent4);
                }else if(position==5){
                    Intent intent5 = new Intent(context,DragonFruit.class);
                    startActivity(intent5);
                }else if(position==6){
                    Intent intent6 = new Intent(context,Grape.class);
                    startActivity(intent6);
                }else if(position==7){
                    Intent intent7 = new Intent(context,WaterMelon.class);
                    startActivity(intent7);
                }else if(position==8){
                    Intent intent8 = new Intent(context,Coconut.class);
                    startActivity(intent8);
                }
            }
        });
    }
}
