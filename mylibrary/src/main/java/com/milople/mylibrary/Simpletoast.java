package com.milople.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Simpletoast {

    public static void toasty(Context ctx, String msg)
    {
        Toast.makeText(ctx,msg,Toast.LENGTH_SHORT).show();
    }
}
