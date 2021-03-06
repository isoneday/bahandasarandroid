package com.blackswan.contohbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TextView;

public class ContohPopUpActivity extends AppCompatActivity {

    String[] DayOfWeek = {"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_pop_up);
        final EditText textIn = (EditText)findViewById(R.id.textin);

        final Button btnOpenPopup = (Button) findViewById(R.id.openpopup);
        btnOpenPopup.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater =
                        (LayoutInflater)getBaseContext()
                                .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

                //Update TextView in PopupWindow dynamically
                TextView textOut = (TextView)popupView.findViewById(R.id.textout);
                String stringOut = textIn.getText().toString();
                if(!stringOut.equals("")){
                    textOut.setText(stringOut);
                }

                Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);

                Spinner popupSpinner = (Spinner)popupView.findViewById(R.id.popupspinner);

                ArrayAdapter<String> adapter =
                        new ArrayAdapter<String>(ContohPopUpActivity.this,
                                android.R.layout.simple_spinner_item, DayOfWeek);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                popupSpinner.setAdapter(adapter);

                btnDismiss.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }});

                popupWindow.showAsDropDown(btnOpenPopup, 50, -30);


            }

        });
    }

}
