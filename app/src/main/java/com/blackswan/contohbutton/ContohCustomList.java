package com.blackswan.contohbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.blackswan.contohbutton.adaptor.CustomListAdapter;

import java.util.ArrayList;

public class ContohCustomList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_custom_list);
        ArrayList image_details = getListData();
        final ListView lv1 = (ListView) findViewById(R.id.custom_list);
        lv1.setAdapter(new CustomListAdapter(this, image_details));
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                CustomList newsData = (CustomList) o;
                Toast.makeText(ContohCustomList.this, "Selected :" + " " + newsData, Toast.LENGTH_LONG).show();
            }
        });
    }

    private ArrayList getListData() {
        ArrayList<CustomList> results = new ArrayList<CustomList>();
        CustomList newsData = new CustomList();
        newsData.setHeadline("Dance of Democracy");
        newsData.setReporterName("Pankaj Gupta");
        newsData.setDate("May 26, 2013, 13:35");
        results.add(newsData);

        // Add some more dummy data for testing
        return results;
    }
}


