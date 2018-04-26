package com.blackswan.contohbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ContohCheckBox extends AppCompatActivity {
    private CheckBox chkIos, chkAndroid, chkWindows;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_check_box);
        addListenerOnChkIos();
        addListenerOnButton();
    }
    public void addListenerOnChkIos() {

        chkIos = (CheckBox) findViewById(R.id.chkIos);

        chkIos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(ContohCheckBox.this,
                            "Bro, try Android :)", Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    public void addListenerOnButton() {

        chkIos = (CheckBox) findViewById(R.id.chkIos);
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
        chkWindows = (CheckBox) findViewById(R.id.chkWindows);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            //Run when button is clicked
            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
                result.append("IPhone check : ").append(chkIos.isChecked());
                result.append("\nAndroid check : ").append(chkAndroid.isChecked());
                result.append("\nWindows Mobile check :").append(chkWindows.isChecked());

                Toast.makeText(ContohCheckBox.this, result.toString(),
                        Toast.LENGTH_LONG).show();

            }
        });

    }


}
