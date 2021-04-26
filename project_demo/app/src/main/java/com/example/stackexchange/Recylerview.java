package com.example.stackexchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Recylerview extends AppCompatActivity {
    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<Model> userList;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recylerview);
        initData();
        initRecyclerView();
        findViewById(R.id.activityRecyclerView_tvReplace).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FragmentDemoActivity.class));
            }
        });
    }
    private void initRecyclerView() {
        mrecyclerView=findViewById(R.id.RecyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mrecyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
    private void initData() {
        userList = new ArrayList<>();
        userList.add(new Model(R.drawable.images,"Anjali","0914567890"));
        userList.add(new Model(R.drawable.images,"Brijesh","089786765"));
        userList.add(new Model(R.drawable.images,"Alex","0914802783"));
    }

}