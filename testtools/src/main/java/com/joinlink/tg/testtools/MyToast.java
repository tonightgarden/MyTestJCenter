package com.joinlink.tg.testtools;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by tg on 2017/8/21.
 */

public class MyToast {

    public static void show(Context context,String string)
    {
        Toast.makeText(context, string,Toast.LENGTH_SHORT).show();
    }

}
