package com.example.hashset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HashSet<String>haset=new HashSet<>();
        haset.add("Monet");
        haset.add("concent");
        haset.add("AshmaIp");
        haset.add("Zoho");
        haset.add("khji");
        haset.add("Zoho");//No order no duplicate in hashset
        haset.add(null);//hashset allows null value.
        System.out.println("out is="+haset);
    }
}
