package com.blackswan.contohbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {
    ListView listbuah;
    String[] buahbuahan = {
            "Belimbing",
            "Jambu",
            "Mangga",
            "Rambutan",
            "Sirsak",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, buahbuahan);

        //---List View---
        listbuah = (ListView) findViewById(R.id.ListView1);
        listbuah.setAdapter(adapter);
        listbuah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                int index = arg2;
                Toast.makeText(getBaseContext(),
                        "List yang di pilih : " + buahbuahan[index],
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}
