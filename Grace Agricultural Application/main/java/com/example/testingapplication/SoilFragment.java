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

public class SoilFragment extends Fragment {

    Activity context_soil;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context_soil = getActivity();
        return inflater.inflate(R.layout.fragment_soil,container,false);
    }

    @Override
    public void onViewCreated(View view,@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = view.findViewById(R.id.listview_soil);

        List<String> list = new ArrayList<>();
        list.add("မြေဆွေးဆိုသည်မှာ");
        list.add("သီးနှံအကြွင်းအကျန်များကိုအသုံးပြု၍မြေဆွေးပြုလုပ်ခြင်း");
        list.add("တီကျစ်စာမြေဆွေးပြုလုပ်ခြင်း");
        list.add("အကျိုးပြုအဏုဇီဝသက်ရှိများပါဝင်သော ဖျော်ရည် (အီးအမ်ဖျော်ရည်) ကို အသုံးပြု၍ မြေဆွေးပြုလုပ်ခြင်း");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.my_list_view,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent = new Intent(context_soil,Soil.class);
                    startActivity(intent);
                }else if(position==1){
                    Intent intent1 = new Intent(context_soil,FruitSoil.class);
                    startActivity(intent1);
                }else if(position==2){
                    Intent intent2 = new Intent(context_soil,WarmSoil.class);
                    startActivity(intent2);
                }else if(position==3){
                    Intent intent3 = new Intent(context_soil,VirousSoil.class);
                    startActivity(intent3);
                }
            }
        });
    }
}
