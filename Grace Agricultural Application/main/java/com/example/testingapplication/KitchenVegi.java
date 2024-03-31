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

public class KitchenVegi extends Fragment {

    Activity context_kit;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context_kit = getActivity();
        return inflater.inflate(R.layout.activity_kitchen_vegi,container,false);
    }

    @Override
    public void onViewCreated(View view,@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = view.findViewById(R.id.listview_kitchen);

        List<String> list = new ArrayList<>();
        list.add("ခရမ်းချဉ်စိုက်ပျိုးခြင်း");
        list.add("အာလူးစိုက်ပျိုးခြင်း");
        list.add("ခရမ်းစိုက်ပျိုးခြင်း");
        list.add("ငရုတ်စိုက်ပျိုးခြင်း");
        list.add("ဆလတ်စိုက်ပျိုးခြင်း");
        list.add("ဂေါ်ဖီထုပ်စိုက်ပျိုးခြင်း");
        list.add("ပန်းမုန်လာစိုက်ပျိုးခြင်း");
        list.add("မုန်လာဥစိုက်ပျိုးခြင်း");
        list.add("ကြက်သွန်နီစိုက်ပျိုးခြင်း");
        list.add("ကြက်သွန်ဖြူစိုက်ပျိုးခြင်း");
        list.add("ဘူးစိုက်ပျိုးခြင်း");
        list.add("သခွားစိုက်ပျိုးခြင်း");
        list.add("မုန်ညင်းးစိုက်ပျိုးခြင်း");
        list.add("ကိုက်လန်စိုက်ပျိုးခြင်း");
        list.add("ရုံးပတီစိုက်ပျိုးခြင်း");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.my_list_view,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent = new Intent(context_kit,Tomato.class);
                    startActivity(intent);
                }else if(position==1){
                    Intent intent1 = new Intent(context_kit,Potato.class);
                    startActivity(intent1);
                }else if(position==2){
                    Intent intent2 = new Intent(context_kit,Eggplant.class);
                    startActivity(intent2);
                }else if(position==3){
                    Intent intent3 = new Intent(context_kit,Chilli.class);
                    startActivity(intent3);
                }else if(position==4){
                    Intent intent4 = new Intent(context_kit,Salat.class);
                    startActivity(intent4);
                }else if(position==5){
                    Intent intent5 = new Intent(context_kit,Gabbage.class);
                    startActivity(intent5);
                }else if(position==6){
                    Intent intent6 = new Intent(context_kit,Panmonelar.class);
                    startActivity(intent6);
                }else if(position==7){
                    Intent intent7 = new Intent(context_kit,Carrot.class);
                    startActivity(intent7);
                }else if(position==8){
                    Intent intent8 = new Intent(context_kit,Onion.class);
                    startActivity(intent8);
                }
                else if(position==9){
                    Intent intent9 = new Intent(context_kit,Gallage.class);
                    startActivity(intent9);
                }
                else if(position==10){
                    Intent intent10 = new Intent(context_kit,Buu.class);
                    startActivity(intent10);
                }
                else if(position==11){
                    Intent intent11 = new Intent(context_kit,Cucumber.class);
                    startActivity(intent11);
                }
                else if(position==12){
                    Intent intent12 = new Intent(context_kit,Monenyin.class);
                    startActivity(intent12);
                }
                else if(position==13){
                    Intent intent13 = new Intent(context_kit,Kitelan.class);
                    startActivity(intent13);
                }
                else if(position==14){
                    Intent intent14 = new Intent(context_kit,Yonepati.class);
                    startActivity(intent14);
                }
            }
        });
    }

}