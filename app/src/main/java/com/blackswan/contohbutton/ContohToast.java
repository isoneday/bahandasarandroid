package com.blackswan.contohbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ContohToast extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_toast);

        button = (Button) findViewById(R.id.buttonToast);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // get your custom_toast.xml ayout
                LayoutInflater inflater = getLayoutInflater();

                View layout = inflater.inflate(R.layout.custom_toast,
                        (ViewGroup) findViewById(R.id.custom_toast_layout_id));

                // set a dummy image
                ImageView image = (ImageView) layout.findViewById(R.id.image);
                image.setImageResource(R.drawable.ic_launcher);

                // set a message
                TextView text = (TextView) layout.findViewById(R.id.text);
                text.setText("Button is clicked!");

                // Toast...
                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();

            }
        });

    }
}