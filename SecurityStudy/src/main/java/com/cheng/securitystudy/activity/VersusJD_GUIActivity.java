package com.cheng.securitystudy.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cheng.securitystudy.R;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 对抗JD-GUI
 */
public class VersusJD_GUIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_versusjd_gui);
        /**
         * 加上不可能的特殊分支语句，代码如下：
         */
        switch (0) {
            case 1:
                JSONObject jsonObject;
                String date = null;
                String second = null;
                try {
                    jsonObject = new JSONObject();
                    date = jsonObject.getString("date");
                    second = jsonObject.getString("second");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                test.settime(date, second);
                break;
        }
    }

}

class test {
    public static void settime(String a, String b){}
}
