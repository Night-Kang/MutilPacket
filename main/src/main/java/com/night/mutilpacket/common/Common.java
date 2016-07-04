package com.night.mutilpacket.common;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

import com.night.mutilpacket.MultiApplication;


/**
 * Created by Night on 7/4/16.
 */
public class Common {

    public static String getMetaData(String name) {
        ApplicationInfo applicationInfo;
        String value = "";

        try {
            applicationInfo = MultiApplication.getInstance().getPackageManager()
                    .getApplicationInfo(MultiApplication.getInstance().getPackageName(),
                    PackageManager.GET_META_DATA);
            value = applicationInfo.metaData.getString(name);
            //something about 360 will go error
            if (TextUtils.isEmpty(value)) {
                value = String.valueOf(applicationInfo.metaData.getInt(name));
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }
}
