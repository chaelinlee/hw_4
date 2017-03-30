package com.example.leechaelin.hw_4;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fragement extends Fragment{
    EditText e1,e2,e3,e4,e5,e6;
    data apple, grape, kiwi ,grapefruit
;    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragveiw = inflater.inflate(R.layout.activity_fragement,container,false);

        Button b1 = (Button)fragveiw.findViewById(R.id.apple);
        Button b2 = (Button)fragveiw.findViewById(R.id.grape);
        Button b3 = (Button)fragveiw.findViewById(R.id.kiwi);
        Button b4 = (Button)fragveiw.findViewById(R.id.grapefruit);
        e1 = (EditText)fragveiw.findViewById(R.id.edittext);
        e2 = (EditText)fragveiw.findViewById(R.id.edittext2);
        e3 = (EditText)fragveiw.findViewById(R.id.edittext3);
        e4 = (EditText)fragveiw.findViewById(R.id.edittext4);
        e5 = (EditText)fragveiw.findViewById(R.id.edittext5);
        e6 = (EditText)fragveiw.findViewById(R.id.edittext6);

        init();
        return fragveiw;

    }

    void init(){
        apple = new data("","",0,0,"",0);
        grape = new data("","",0,0,"",0);
        kiwi = new data("","",0,0,"",0);
        grapefruit = new data("","",0,0,"",0);

        setting(apple);
        setting(grape);
        setting(kiwi);
        setting(grapefruit);

    }
    public void setting(data start){
        e1.setText(start.tablename);
        e2.setText(start.time);
        e3.setText(start.spa);
        e4.setText(start.pizza);
        e5.setText(start.membership);
        e6.setText(start.price);
    }

    public void myClick(View v){
        if(v.getId()==R.id.apple){
            if(apple.price==0){
                Toast.makeText(getActivity(),"비어있는 테이블 입니다",Toast.LENGTH_SHORT).show();
            }
        }else if(v.getId()==R.id.grape){

        }else if(v.getId()==R.id.kiwi){

        }else if(v.getId()==R.id.grapefruit){

        }
    }




}