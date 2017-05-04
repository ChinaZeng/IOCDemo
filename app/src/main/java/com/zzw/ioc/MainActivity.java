package com.zzw.ioc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import ioc.zzw.com.ioclibrary.CheckNet;
import ioc.zzw.com.ioclibrary.OnClick;
import ioc.zzw.com.ioclibrary.ViewById;
import ioc.zzw.com.ioclibrary.ViewUtils;

public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.test_tv)
    private TextView mTestTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewUtils.inject(this);
        mTestTv.setText("ioc_");
    }


    @OnClick({R.id.test_tv, R.id.test_button})
    @CheckNet
    private void onClick(View view) {
        switch (view.getId()) {
            case R.id.test_tv:
                Toast.makeText(this, "点击了TextView", Toast.LENGTH_SHORT).show();
                break;

            case R.id.test_button:
                Toast.makeText(this, "点击了Button", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
