package com.blackswan.contohbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EdittextActivity extends AppCompatActivity {
    private EditText edittext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext);
//prosedure/method
        addKeyListener();
    }

    public void addKeyListener() {

        // get edittext component
        edittext = (EditText) findViewById(R.id.editText);

        // add a keylistener to keep track user input
        edittext.setOnKeyListener(new View.OnKeyListener() {
                //keycode =aksi
            //keyevent =kejadian
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                // if keydown and "enter" is pressed
                if ((event.getAction() == KeyEvent.ACTION_DOWN)
                        && (keyCode == KeyEvent.KEYCODE_ENTER)) {

                    // display a floating message
                    Toast.makeText(EdittextActivity.this,
                            edittext.getText(), Toast.LENGTH_LONG).show();
                    return true;

                } else if ((event.getAction() == KeyEvent.ACTION_DOWN)
                        && (keyCode == KeyEvent.KEYCODE_9)) {

                    // display a floating message
                    Toast.makeText(EdittextActivity.this,
                            "Number 9 is pressed!", Toast.LENGTH_LONG).show();
                    return true;
                }

                return false;
            }
        });
    }
}