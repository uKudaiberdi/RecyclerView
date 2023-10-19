package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> contactNameList = new ArrayList<>();
    private RecyclerView rvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void loadData() {
        contactNameList.add("ACAN");
        contactNameList.add("ACfAN");
        contactNameList.add("ACAsN");
        contactNameList.add("ACAaN");
        contactNameList.add("ACAgN");
        contactNameList.add("ACANh");
        contactNameList.add("ACcAN");
        contactNameList.add("ACAvN");
        contactNameList.add("ACANs");
        contactNameList.add("ACANw");
        contactNameList.add("ACANq");
        contactNameList.add("ACANf");
        contactNameList.add("ACANu");
        initAdapter();
    }

    private void initAdapter() {
        ContactAdapter adapter = new ContactAdapter(contactNameList);
        rvContact.setAdapter(adapter);
    }

    private void initView() {
        rvContact = findViewById(R.id.rv_contact);
    }
}