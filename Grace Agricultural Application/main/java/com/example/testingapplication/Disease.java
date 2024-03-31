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

public class Disease extends Fragment {

    Activity context_disease;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context_disease = getActivity();
        return inflater.inflate(R.layout.activity_disease,container,false);
    }

    @Override
    public void onViewCreated(View view,@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = view.findViewById(R.id.listview_disease);

        List<String> list = new ArrayList<>();
        list.add("အာလူးလောင်မည်း ရောဂါ");
        list.add("အာလူးလောင်ပြောက် ရောဂါ");
        list.add("အာလူး/ခရမ်းချဉ်ပင်ညှိုး (လောင်ဖြူ) ရောဂါ");
        list.add("ခရမ်းချဉ်ဖြူစေရီယမ်ပင်ညှိုးရောဂါ");
        list.add("ကြက်သွန်ရွက်ခြောက်ရောဂါ");
        list.add("ကြက်သွန်တောက်တဲ့မြီးရောဂါ");
        list.add("ငရုတ်မှဲ့ပြောက်စွန်းရောဂါ");
        list.add("သခွားရွက်ခြောက်ရောဂါ");
        list.add("သခွားမှဲ့ပြောက်စွန်းရောဂါ");
        list.add("သခွားပင်စည်အစေးထွက်ရောဂါ");
        list.add("နှင်းဆီရွက်နက်ပြောက်ရောဂါ");
        list.add("ဂန္ဓမာသံချေးဖြူရောဂါ");
        list.add("စပျစ်ရွက်ခြောက်ရောဂါ");
        list.add("သရက်မှဲ့ပြောက်စွန်းရောဂါ");
        list.add("ရှောက်သံပုရာ၊ လိမ္မော် အပင်နှင့်အသီးအစိမ်းရောင်ရောဂါ");
        list.add("ဒူးရင်းပင်စည်နှင့်အမြစ်ပုပ်ရောဂါ");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity().getApplicationContext(), R.layout.my_list_view,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent = new Intent(context_disease,PotatoBlack.class);
                    startActivity(intent);
                }else if(position==1){
                    Intent intent1 = new Intent(context_disease,PotatoDot.class);
                    startActivity(intent1);
                }else if(position==2){
                    Intent intent2 = new Intent(context_disease,PotatoWhite.class);
                    startActivity(intent2);
                }else if(position==3){
                    Intent intent3 = new Intent(context_disease,EggplantWhite.class);
                    startActivity(intent3);
                }else if(position==4){
                    Intent intent4 = new Intent(context_disease,OnionDry.class);
                    startActivity(intent4);
                }else if(position==5){
                    Intent intent5 = new Intent(context_disease,OnionTouk.class);
                    startActivity(intent5);
                }else if(position==6){
                    Intent intent6 = new Intent(context_disease,ChiliMae.class);
                    startActivity(intent6);
                }else if(position==7){
                    Intent intent7 = new Intent(context_disease,CucumberDry.class);
                    startActivity(intent7);
                }else if(position==8){
                    Intent intent8 = new Intent(context_disease,CucumberMae.class);
                    startActivity(intent8);
                }else if(position==9){
                    Intent intent9 = new Intent(context_disease,CucumberStem.class);
                    startActivity(intent9);
                }else if(position==10){
                    Intent intent10 = new Intent(context_disease,RoseBlack.class);
                    startActivity(intent10);
                }else if(position==11){
                    Intent intent11 = new Intent(context_disease,GannamarChee.class);
                    startActivity(intent11);
                }else if(position==12){
                    Intent intent12 = new Intent(context_disease,GrapeDry.class);
                    startActivity(intent12);
                }else if(position==13){
                    Intent intent13 = new Intent(context_disease,MangoMae.class);
                    startActivity(intent13);
                }else if(position==14){
                    Intent intent14 = new Intent(context_disease,LimeGreen.class);
                    startActivity(intent14);
                }else if(position==15){
                    Intent intent15 = new Intent(context_disease,DurinRoot.class);
                    startActivity(intent15);
                }
            }
        });
    }
}