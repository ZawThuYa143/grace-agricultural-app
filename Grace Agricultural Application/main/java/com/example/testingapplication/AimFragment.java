package com.example.testingapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.List;

public class AimFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_aim,container,false);

    }

    @Override
    public void onViewCreated(View view,@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = view.findViewById(R.id.listview_aim);

        List<String> list = new ArrayList<>();
        list.add("မြန်မာနိုင်ငံတွင် အဓိကစားသုံးစိုက်ပျိုးသော သစ်သီး၀လံ နှင့် ဟင်းသီးဟင်းရွက်များ၏ အကြောင်း၊ စိုက်ပျိုးဖြစ်ထွန်းရန်လိုအပ်သည့်ရေမြေရာသီဥတု၊ စိုက်ပျိုးပြုစုစောင့်ရှောက်ပုံနှင့် စိုက်ပျိုးထုတ်လုပ်နိုင်သည့်ကာလများကိုသိရှိနားလည်ရန်။");
        list.add("ဟင်းသီးဟင်းရွက် ပန်းမန်စိုက်ခင်းများ၊ သစ်သီးခြံများတွင် အထွက်ကောင်းမွန်စေရန် နှင့် အပင်များကြီးထွားသန်စွမ်းစေရန် အသုံးပြုသင့်သော အော်ဂဲနစ် မြေဩဇာများဖြစ်သည့် တီကျစ်စာမြေဆွေး၊ အဏုဇီဝ ဖျော်ရည်ဖြင့်ပြုလုပ်သောမြေဆွေး စသည်တို့ပြုလုပ်ပုံနည်း အဆင့်ဆင့်အား သိရှိစေရန်။");
        list.add("နှင်းဆီသစ္စာပန်း၊ သစ်ခွ၊ ဂန္ဓမာ စသော ပန်းအလှပင်များနှင့် အရွက်အလှ ပင်များအား မျိုးပွားခြင်း၊ စိုက်ပျိုးမြေပြုပြင်ခြင်း၊ စိုက်ပျိုးပြုစုခြင်းနှင့် ပိုးမွှားရောဂါ ကာကွယ်နှိမ်နင်းခြင်း နည်းလမ်းများကို သိရှိစေရန်။");
        list.add("ဥယျာဉ်ခြံသီးနှံများတွင် ကျရောက်သောရောဂါ၏ လက္ခဏာများ၊ ရောဂါဖြစ်စေသော သက်ရှိအမျိုးအစားများနှင့် ရောဂါကာကွယ်နှိမ်နင်းနည်းများကို လေ့လာသိရှိစေရန်။");
        list.add("ကောက်ရိုးမှို တစ်ပိုင်တစ်နိုင်စိုက်ပျိုးနည်းကို လေ့လာသိရှိနိုင်ရန်။");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);
    }
}
