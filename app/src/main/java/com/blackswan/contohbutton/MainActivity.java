package com.blackswan.contohbutton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnalertdialog)
    Button btnalertdialog;
    @BindView(R.id.btnambildatastring)
    Button btnambildatastring;
    @BindView(R.id.btnanalogclock)
    Button btnanalogclock;
    @BindView(R.id.btncheckbox)
    Button btncheckbox;
    @BindView(R.id.btncustomlistbuah)
    Button btncustomlistbuah;
    @BindView(R.id.btndatapicker)
    Button btndatapicker;
    @BindView(R.id.btnlinearlayout)
    Button btnlinearlayout;
    @BindView(R.id.btnlistbuah)
    Button btnlistbuah;
    @BindView(R.id.btnpassword)
    Button btnpassword;
    @BindView(R.id.btnpopup)
    Button btnpopup;
    @BindView(R.id.btnprogressbar)
    Button btnprogressbar;
    @BindView(R.id.btnpromptdialog)
    Button btnpromptdialog;
    @BindView(R.id.btnradiobutton)
    Button btnradiobutton;
    @BindView(R.id.btnratingbar)
    Button btnratingbar;
    @BindView(R.id.btnrelativelayout)
    Button btnrelativelayout;
    @BindView(R.id.btnscrollview)
    Button btnscrollview;
    @BindView(R.id.btnseekbar)
    Button btnseekbar;
    @BindView(R.id.btntablelayout)
    Button btntablelayout;
    @BindView(R.id.btntimepicker)
    Button btntimepicker;
    @BindView(R.id.btntoast)
    Button btntoast;
    @BindView(R.id.btntooglebutton)
    Button btntooglebutton;
    @BindView(R.id.btnwebview)
    Button btnwebview;
    @BindView(R.id.btncustomgridview)
    Button btncustomgridview;
    @BindView(R.id.btncustomlist)
    Button btncustomlist;
    @BindView(R.id.btnedittext)
    Button btnedittext;
    @BindView(R.id.btngridview)
    Button btngridview;
    @BindView(R.id.btnlistmobile)
    Button btnlistmobile;
    @BindView(R.id.btnlistview)
    Button btnlistview;
    @BindView(R.id.btnspinner)
    Button btnspinner;
    @BindView(R.id.btnwebviewhtml)
    Button btnwebviewhtml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnalertdialog, R.id.btnambildatastring, R.id.btnanalogclock, R.id.btncheckbox, R.id.btncustomlistbuah, R.id.btndatapicker, R.id.btnlinearlayout, R.id.btnlistbuah, R.id.btnpassword, R.id.btnpopup, R.id.btnprogressbar, R.id.btnpromptdialog, R.id.btnradiobutton, R.id.btnratingbar, R.id.btnrelativelayout, R.id.btnscrollview, R.id.btnseekbar, R.id.btntablelayout, R.id.btntimepicker, R.id.btntoast, R.id.btntooglebutton, R.id.btnwebview, R.id.btncustomgridview, R.id.btncustomlist, R.id.btnedittext, R.id.btngridview, R.id.btnlistmobile, R.id.btnlistview, R.id.btnspinner, R.id.btnwebviewhtml})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnalertdialog:
                startActivity(new Intent(MainActivity.this,AlertDialog3.class));
                break;
            case R.id.btnambildatastring:
                startActivity(new Intent(MainActivity.this,AmbilDataDaristring.class));

                break;
            case R.id.btnanalogclock:
                startActivity(new Intent(MainActivity.this,ContohAnalogClock.class));

                break;
            case R.id.btncheckbox:
                startActivity(new Intent(MainActivity.this,ContohCheckBox.class));

                break;
            case R.id.btncustomlistbuah:
                startActivity(new Intent(MainActivity.this,ContohCustomList.class));

                break;
            case R.id.btndatapicker:
                startActivity(new Intent(MainActivity.this,ContohDataPicker.class));

                break;
            case R.id.btnlinearlayout:
                startActivity(new Intent(MainActivity.this,ContohLinearLayout.class));

                break;
            case R.id.btnlistbuah:
                startActivity(new Intent(MainActivity.this,ContohListBuah.class));

                break;
            case R.id.btnpassword:
                startActivity(new Intent(MainActivity.this,ContohPassword.class));

                break;
            case R.id.btnpopup:
                startActivity(new Intent(MainActivity.this,ContohPopUpActivity.class));

                break;
            case R.id.btnprogressbar:
                startActivity(new Intent(MainActivity.this,ContohProgressbar.class));

                break;
            case R.id.btnpromptdialog:
                startActivity(new Intent(MainActivity.this,ContohPromtDialog.class));

                break;
            case R.id.btnradiobutton:
                startActivity(new Intent(MainActivity.this,ContohRadioButton.class));

                break;
            case R.id.btnratingbar:
                startActivity(new Intent(MainActivity.this,ContohRatingBar.class));

                break;
            case R.id.btnrelativelayout:
                startActivity(new Intent(MainActivity.this,ContohRelativeLayout.class));

                break;
            case R.id.btnscrollview:
                startActivity(new Intent(MainActivity.this,ContohScrollView.class));

                break;
            case R.id.btnseekbar:
                startActivity(new Intent(MainActivity.this,ContohSeekBar.class));

                break;
            case R.id.btntablelayout:
                startActivity(new Intent(MainActivity.this,ContohTableLayout.class));

                break;
            case R.id.btntimepicker:
                startActivity(new Intent(MainActivity.this,ContohTimePicker.class));

                break;
            case R.id.btntoast:
                startActivity(new Intent(MainActivity.this,ContohToast.class));

                break;
            case R.id.btntooglebutton:
                startActivity(new Intent(MainActivity.this,ContohToogleButton.class));

                break;
            case R.id.btnwebview:
                startActivity(new Intent(MainActivity.this,ContohWebView.class));

                break;
            case R.id.btncustomgridview:
                startActivity(new Intent(MainActivity.this,CustomGridView.class));

                break;
            case R.id.btncustomlist:
                Toast.makeText(this, "sama", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnedittext:
                startActivity(new Intent(MainActivity.this,EdittextActivity.class));

                break;
            case R.id.btngridview:
                startActivity(new Intent(MainActivity.this,GridViewActivity.class));

                break;
            case R.id.btnlistmobile:
                startActivity(new Intent(MainActivity.this,ListMobileActivity.class));

                break;
            case R.id.btnlistview:
                startActivity(new Intent(MainActivity.this,ListViewActivity.class));

                break;
            case R.id.btnspinner:
                startActivity(new Intent(MainActivity.this,SpinnerActivity.class));

                break;
            case R.id.btnwebviewhtml:
                startActivity(new Intent(MainActivity.this,WebViewActivity.class));

                break;
        }
    }
}