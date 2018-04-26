package com.blackswan.contohbutton;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class AlertDialog3 extends AppCompatActivity {

    Button btnAlertDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog3);

        btnAlertDialog = (Button) findViewById(R.id.btn_AlertDialog);

        btnAlertDialog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                displayAlertDialog();
            }
        });
    }
        public void displayAlertDialog(){
            LayoutInflater inflater = getLayoutInflater();
            View alertLayout = inflater.inflate(R.layout.layout_custom_dialog, null);
            final EditText etUsername = (EditText) alertLayout.findViewById(R.id.et_Username);
            final EditText etPassword = (EditText) alertLayout.findViewById(R.id.et_Password);
            final CheckBox cbShowPassword = (CheckBox) alertLayout.findViewById(R.id.cb_ShowPassword);

            cbShowPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked)
                        etPassword.setTransformationMethod(null);
                    else
                        etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());			}
            });

            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Login");
            alert.setView(alertLayout);
            alert.setCancelable(false);
            alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getBaseContext(), "Cancel clicked", Toast.LENGTH_SHORT).show();
                }
            });

            alert.setPositiveButton("Login", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // code for matching password
                    String user = etUsername.getText().toString();
                    String pass = etPassword.getText().toString();
                    Toast.makeText(getBaseContext(), "Username: " + user + " Password: " + pass, Toast.LENGTH_SHORT).show();
                }
            });

            AlertDialog dialog = alert.create();
            dialog.show();
        }

    }
