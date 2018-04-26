package com.blackswan.contohbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContohPassword extends AppCompatActivity {
    private EditText password;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_password);
        addListenerOnButton();

    }

    public void addListenerOnButton() {

        password = (EditText) findViewById(R.id.txtPassword);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(ContohPassword.this, password.getText(),
                        Toast.LENGTH_SHORT).show();

            }

        });

    }
}