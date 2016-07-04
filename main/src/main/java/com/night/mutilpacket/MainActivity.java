package com.night.mutilpacket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.night.mutilpacket.common.Common;
import com.night.mutilpacket.common.Constant;

public class MainActivity extends AppCompatActivity {
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView)findViewById(R.id.tv_title);
        Log.e(Constant.TAG, "---IP---" + Constant.APP_IP
                + "\n" + Common.getMetaData("NIGHT_CHANNEL"));
        String textString = Common.getMetaData("NIGHT_CHANNEL")
                + "/" + Common.getMetaData("UMENG_CHANNEL_VALUE")
                + "/" + Common.getMetaData("NIGHT_CHANNEL_KEY");
        mText.setText(textString);

        Toast.makeText(this, getResources().getString(R.string.hello_world)
                + Common.getMetaData("NIGHT_CHANNEL_KEY"), Toast.LENGTH_SHORT).show();

    }
}
