package com.joinlink.tg.mytestjcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.joinlink.tg.testtools.MyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyToast.show(this,"testJCenter");
    }
}
