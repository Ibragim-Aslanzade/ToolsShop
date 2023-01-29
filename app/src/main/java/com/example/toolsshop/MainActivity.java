package com.example.toolsshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listViewTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewTools = findViewById(R.id.listViewTools);
        listViewTools.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch(position) {
                   case 0:
                       Intent intent = new Intent(getApplicationContext(), DrillCategoryActivity.class);
                   break;
                   case 1:
                       Intent intent1 = new Intent(getApplicationContext(), BolgarkaCategoryActivity.class);
                       break;
                   case 2:
                       Intent intent2 = new Intent(getApplicationContext(), PerforatorCategoryActivity.class);
                       break;
               }
            }
        });
    }
}