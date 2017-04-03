package com.example.leechaelin.hw_4;

import android.app.Fragment;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Fragement extends Fragment{
    TextView e1,e2,e3,e4,e5,e6;
    Button b1,b2,b3,b4,b5,b6,b7;
    data apple, grape, kiwi ,grapefruit
;    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragveiw = inflater.inflate(R.layout.activity_fragement,container,false);

        b1 = (Button)fragveiw.findViewById(R.id.apple);
        b2 = (Button)fragveiw.findViewById(R.id.grape);
        b3 = (Button)fragveiw.findViewById(R.id.kiwi);
        b4 = (Button)fragveiw.findViewById(R.id.grapefruit);
        b5 = (Button)fragveiw.findViewById(R.id.new_order);
        b6 = (Button)fragveiw.findViewById(R.id.change);
        b7 = (Button)fragveiw.findViewById(R.id.reset);

        e1 = (TextView)fragveiw.findViewById(R.id.edittext);
        e2 = (TextView)fragveiw.findViewById(R.id.edittext2);
        e3 = (TextView)fragveiw.findViewById(R.id.edittext3);
        e4 = (TextView)fragveiw.findViewById(R.id.edittext4);
        e5 = (TextView)fragveiw.findViewById(R.id.edittext5);
        e6 = (TextView)fragveiw.findViewById(R.id.edittext6);

        init();
        function();
        return fragveiw;

    }

    void init(){
        apple = new data("사과 테이블 ","",0,0,"",0.0);
        grape = new data("포도 테이블 ","",0,0,"",0.0);
        kiwi = new data("키위 테이블 ","",0,0,"",0.0);
        grapefruit = new data("자몽 테이블 ","",0,0,"",0.0);

        setting(apple);
        setting(grape);
        setting(kiwi);
        setting(grapefruit);

    }

    public void setting(data start){
        e1.setText(start.tablename);
        e2.setText(start.time);
        e3.setText(Integer.toString(start.spa));
        e4.setText(Integer.toString(start.pizza));
        e5.setText(start.membership);
        e6.setText(Double.toString(start.price));
    }


    public void function(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(apple.price==0){
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    e1.setText("사과 테이블 ");
                    e2.setText("");
                    e3.setText(Integer.toString(0));
                    e4.setText(Integer.toString(0));
                    e5.setText("");
                    e6.setText(Integer.toString(0));
                    Toast.makeText(getActivity(),"비어있는 테이블 입니다 ",Toast.LENGTH_SHORT).show();
                }else{
                    e1.setText(apple.tablename);
                    e2.setText(apple.time);
                    e3.setText(Integer.toString(apple.spa));
                    e4.setText(Integer.toString(apple.pizza));
                    e5.setText(apple.membership);
                    e6.setText(Double.toString(apple.price));
                    b6.setEnabled(true);
                    b7.setEnabled(true);
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grape.price==0){
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    e1.setText("포도 테이블 ");
                    e2.setText("");
                    e3.setText(Integer.toString(0));
                    e4.setText(Integer.toString(0));
                    e5.setText("");
                    e6.setText(Integer.toString(0));
                    Toast.makeText(getActivity(),"비어있는 테이블 입니다 ",Toast.LENGTH_SHORT).show();
                }else{
                    e1.setText(grape.tablename);
                    e2.setText(grape.time);
                    e3.setText(Integer.toString(grape.spa));
                    e4.setText(Integer.toString(grape.pizza));
                    e5.setText(grape.membership);
                    e6.setText(Double.toString(grape.price));
                    b6.setEnabled(true);
                    b7.setEnabled(true);
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kiwi.price==0){
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    e1.setText("키위 테이블 ");
                    e2.setText("");
                    e3.setText(Integer.toString(0));
                    e4.setText(Integer.toString(0));
                    e5.setText("");
                    e6.setText(Integer.toString(0));
                    Toast.makeText(getActivity(),"비어있는 테이블 입니다 ",Toast.LENGTH_SHORT).show();
                }else {
                    e1.setText(kiwi.tablename);
                    e2.setText(kiwi.time);
                    e3.setText(Integer.toString(kiwi.spa));
                    e4.setText(Integer.toString(kiwi.pizza));
                    e5.setText(kiwi.membership);
                    e6.setText(Double.toString(kiwi.price));
                    b6.setEnabled(true);
                    b7.setEnabled(true);
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grapefruit.price==0){
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    e1.setText("자몽 테이블 ");
                    e2.setText("");
                    e3.setText(Integer.toString(0));
                    e4.setText(Integer.toString(0));
                    e5.setText("");
                    e6.setText(Integer.toString(0));
                    Toast.makeText(getActivity(),"비어있는 테이블 입니다 ",Toast.LENGTH_SHORT).show();
                }else{
                    e1.setText(grapefruit.tablename);
                    e2.setText(grapefruit.time);
                    e3.setText(Integer.toString(grapefruit.spa));
                    e4.setText(Integer.toString(grapefruit.pizza));
                    e5.setText(grapefruit.membership);
                    e6.setText(Double.toString(grapefruit.price));
                    b6.setEnabled(true);
                    b7.setEnabled(true);
                }
            }
        });

        //b5 = 새주문
        b5.setOnClickListener(new View.OnClickListener() {
            Calendar calendar = Calendar.getInstance();
            String str = calendar.getTime().toString();
            @Override

            public void onClick(final View v) {
                View view = View.inflate(getActivity(), R.layout.activity_dlg, null);
                final EditText t1 = (EditText) view.findViewById(R.id.edit);
                final EditText t2 = (EditText) view.findViewById(R.id.edit2);
                final RadioButton rb1 = (RadioButton) view.findViewById(R.id.radioButton);
                final RadioButton rb2 = (RadioButton) view.findViewById(R.id.radioButton2);

                b6.setEnabled(true);
                b7.setEnabled(true);
                AlertDialog.Builder dlg = new AlertDialog.Builder(getActivity());
                dlg.setTitle("주문받기 ")
                        .setView(view)
                        .setPositiveButton("확인 ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                e2.setText(str);
                                String a = t1.getText().toString();
                                String b = t2.getText().toString();
                                e3.setText(a);
                                e4.setText(b);
                                Snackbar.make(v, "정보가 입력되었습니다 ", Snackbar.LENGTH_SHORT).setAction("Ok", null).show();
                                Double summation;
                                Double cost = 0.0;
                                if (rb1.isChecked()) {
                                    e5.setText("기본 멤버쉽 ");
                                    summation = Double.parseDouble(a) * 10000.0 + Double.parseDouble(b) * 12000.0;
                                    cost = summation * 0.9;
                                } else if (rb2.isChecked()) {
                                    e5.setText("VIP 멤버쉽 ");
                                    summation = Double.parseDouble(a) * 10000.0 + Double.parseDouble(b) * 12000.0;
                                    cost = summation * 0.7;
                                }
                                e6.setText(Double.toString(cost));
                                if(e1.getText().toString().equals("사과 테이블 ")){
                                    apple.time = e2.getText().toString();
                                    apple.spa = Integer.parseInt(e3.getText().toString());
                                    apple.pizza = Integer.parseInt(e4.getText().toString());
                                    apple.membership = e5.getText().toString();
                                    apple.price = Double.parseDouble(e6.getText().toString());
                                    b1.setText("사과 테이블 ");
                                    b6.setEnabled(true);
                                    b7.setEnabled(true);
                                }else if(e1.getText().toString().equals("포도 테이블 ")) {
                                    grape.time = e2.getText().toString();
                                    grape.spa = Integer.parseInt(e3.getText().toString());
                                    grape.pizza = Integer.parseInt(e4.getText().toString());
                                    grape.membership = e5.getText().toString();
                                    grape.price = Double.parseDouble(e6.getText().toString());
                                    b2.setText("포도 테이블 ");
                                    b6.setEnabled(true);
                                    b7.setEnabled(true);
                                }else if(e1.getText().toString().equals("키위 테이블 ")) {
                                    kiwi.time = e2.getText().toString();
                                    kiwi.spa = Integer.parseInt(e3.getText().toString());
                                    kiwi.pizza = Integer.parseInt(e4.getText().toString());
                                    kiwi.membership = e5.getText().toString();
                                    kiwi.price = Double.parseDouble(e6.getText().toString());
                                    b3.setText("키위 테이블 ");
                                    b6.setEnabled(true);
                                    b7.setEnabled(true);
                                }else if(e1.getText().toString().equals("자몽 테이블 ")) {
                                    grapefruit.time = e2.getText().toString();
                                    grapefruit.spa = Integer.parseInt(e3.getText().toString());
                                    grapefruit.pizza = Integer.parseInt(e4.getText().toString());
                                    grapefruit.membership = e5.getText().toString();
                                    grapefruit.price = Double.parseDouble(e6.getText().toString());
                                    b4.setText("자몽 테이블 ");
                                    b6.setEnabled(true);
                                    b7.setEnabled(true);

                                }

                            }

                        })
                        .setNegativeButton(" 취소 ", null)
                        .show();


            }

        });

        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                View view = View.inflate(getActivity(), R.layout.activity_dlg, null);
                final EditText t1 = (EditText) view.findViewById(R.id.edit);
                final EditText t2 = (EditText) view.findViewById(R.id.edit2);
                final RadioButton rb1 = (RadioButton) view.findViewById(R.id.radioButton);
                final RadioButton rb2 = (RadioButton) view.findViewById(R.id.radioButton2);

                AlertDialog.Builder dlg = new AlertDialog.Builder(getActivity());
                dlg.setTitle("주문받기 ")
                        .setView(view)
                        .setPositiveButton("확인 ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                String a = t1.getText().toString();
                                String b = t2.getText().toString();
                                e3.setText(a);
                                e4.setText(b);
                                Snackbar.make(v, "정보가 입력되었습니다 ", Snackbar.LENGTH_SHORT).setAction("Ok", null).show();
                                Double summation;
                                Double cost = 0.0;
                                if (rb1.isChecked()) {
                                    e5.setText("기본 멤버쉽 ");
                                    summation = Double.parseDouble(a) * 10000.0 + Double.parseDouble(b) * 12000.0;
                                    cost = summation * 0.9;
                                } else if (rb2.isChecked()) {
                                    e5.setText("VIP 멤버쉽 ");
                                    summation = Double.parseDouble(a) * 10000.0 + Double.parseDouble(b) * 12000.0;
                                    cost = summation * 0.7;
                                }
                                e6.setText(Double.toString(cost));
                                if(e1.getText().toString().equals("사과 테이블 ")){
                                    apple.time = e2.getText().toString();
                                    apple.spa = Integer.parseInt(e3.getText().toString());
                                    apple.pizza = Integer.parseInt(e4.getText().toString());
                                    apple.membership = e5.getText().toString();
                                    apple.price = Double.parseDouble(e6.getText().toString());
                                    b1.setText("사과 테이블 ");
                                    b6.setEnabled(true);
                                    b7.setEnabled(true);
                                }else if(e1.getText().toString().equals("포도 테이블 ")) {
                                    grape.time = e2.getText().toString();
                                    grape.spa = Integer.parseInt(e3.getText().toString());
                                    grape.pizza = Integer.parseInt(e4.getText().toString());
                                    grape.membership = e5.getText().toString();
                                    grape.price = Double.parseDouble(e6.getText().toString());
                                    b2.setText("포도 테이블 ");
                                    b6.setEnabled(true);
                                    b7.setEnabled(true);
                                }else if(e1.getText().toString().equals("키위 테이블 ")) {
                                    kiwi.time = e2.getText().toString();
                                    kiwi.spa = Integer.parseInt(e3.getText().toString());
                                    kiwi.pizza = Integer.parseInt(e4.getText().toString());
                                    kiwi.membership = e5.getText().toString();
                                    kiwi.price = Double.parseDouble(e6.getText().toString());
                                    b3.setText("키위 테이블 ");
                                    b6.setEnabled(true);
                                    b7.setEnabled(true);
                                }else if(e1.getText().toString().equals("자몽 테이블 ")) {
                                    grapefruit.time = e2.getText().toString();
                                    grapefruit.spa = Integer.parseInt(e3.getText().toString());
                                    grapefruit.pizza = Integer.parseInt(e4.getText().toString());
                                    grapefruit.membership = e5.getText().toString();
                                    grapefruit.price = Double.parseDouble(e6.getText().toString());
                                    b4.setText("자몽 테이블 ");
                                    b6.setEnabled(true);
                                    b7.setEnabled(true);

                                }

                            }

                        })
                        .setNegativeButton(" 취소 ", null)
                        .show();

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e2.setText("");
                e3.setText("0");
                e4.setText("0");
                e5.setText("");
                e6.setText("0");

                if(e1.getText().toString().equals("사과 테이블 ")){
                    apple.time="";
                    apple.spa= 0;
                    apple.pizza= 0;
                    apple.membership="";
                    apple.price=0.0;
                    b1.setText("사과 Table(비어있음) ");
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                }else if(e1.getText().toString().equals("포도 테이블 ")){
                    grape.time="";
                    grape.spa= 0;
                    grape.pizza= 0;
                    grape.membership="";
                    grape.price=0.0;
                    b2.setText("포도 Table (비어있음 )");
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                }else if(e1.getText().toString().equals("키위 테이블 ")){
                    kiwi.time="";
                    kiwi.spa= 0;
                    kiwi.pizza= 0;
                    kiwi.membership="";
                    kiwi.price=0.0;
                    b3.setText("키위 Table (비어있음 )");
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                }else if(e1.getText().toString().equals("자몽 테이블 ")){
                    grapefruit.time="";
                    grapefruit.spa= 0;
                    grapefruit.pizza= 0;
                    grapefruit.membership="";
                    grapefruit.price=0.0;
                    b4.setText("자몽 Table (비어있음 ) ");
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                }
            }
        });
    }

}
