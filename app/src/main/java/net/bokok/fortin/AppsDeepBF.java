package net.bokok.fortin;

import static net.bokok.fortin.BF.bbb;

import android.content.Intent;
import android.os.Handler;
import android.util.Log;

import androidx.annotation.Nullable;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

import java.util.Map;

public class AppsDeepBF {


    int ffd = 0;
    public static String csdfs;
    public static String vdssa;
    public static String cscs = "-";
    public static String scsafe;
    public static String csace;
    public static String csawdsa = "NWNtR0FudWUyRHUyUjhtc3lLSkR2Uwo=";
    public static String cacwa;
    public static String cacwds;
    public static String scwxax;
    public static String scwasa;
    public static String csawdcsa;
    public static String csawdx;
    public static String csada = null;
    public static String cawdx = "-";

    public String getLink() {
        return csdfs;
    }

    public void setLink(String link) {
        this.csdfs = link;
    }

    public String getPackageNameBF() {
        return scwasa;
    }

    public void setPackageNameBF(String packageNameBF) {
        this.scwasa = packageNameBF;
    }

    public String getFbIdBF() {
        return csawdcsa;
    }

    public void setFbIdBF(String fbIdBF) {
        this.csawdcsa = fbIdBF;
    }

    public String getFbTokenBF() {
        return csawdx;
    }

    public void setFbTokenBF(String fbTokenBF) {
        this.csawdx = fbTokenBF;
    }

    public void oneSignalBF(BF bf) {
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(bf);
        OneSignal.setAppId("e05dd860-b16e-4364-9afa-6a558fc086c5");
    }

    public void ifj(BF bf) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    scsafe = AdvertisingIdClient.getAdvertisingIdInfo(bf.getApplicationContext()).getId();

                } catch (Exception e) {
                }
            }
        }).start();
    }

    public void uyu(BF bf) {
        vdssa = AppsFlyerLib.getInstance().getAppsFlyerUID(bf.getApplicationContext());

    }

    public void iuh(BF bf) {

        AppsFlyerLib.getInstance().init("5cmGAnue2Du2R8msyKJDvS", new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {

                cscs = map.get(WeSeFB.decodeBF("YWZfc3RhdHVz")).toString();

                if (cscs.equals(WeSeFB.decodeBF("Tm9uLW9yZ2FuaWM="))) {

                    try {
                        cacwa = map.get(WeSeFB.decodeBF("Y2FtcGFpZ24=")).toString();
                    } catch (Exception e) {

                    }

                    try {

                        cacwds = map.get(WeSeFB.decodeBF("bWVkaWFfc291cmNl")).toString();
                    } catch (Exception e) {

                    }

                    try {

                        scwxax = map.get(WeSeFB.decodeBF("YWZfY2hhbm5lbA==")).toString();
                    } catch (Exception e) {

                    }


                           csace = parserBF(cacwa);


                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        }, bf);
        AppsFlyerLib.getInstance().start(bf);
    }

    private String parserBF(String caxa) {

        String sacs;
        String caa;
        String bvvc;
        String zzxz;
        String bnvv;
        String gggd;

        String[] aaaa = caxa.split("_");

        try {
            sacs = aaaa[0];
        } catch (Exception e) {

            sacs = "";
        }
        try {
            caa = aaaa[1];
        } catch (Exception e) {

            caa = "";
        }
        try {
            bvvc = aaaa[2];
        } catch (Exception e) {
            bvvc = "";

        }
        try {
            zzxz = aaaa[3];
        } catch (Exception e) {
            zzxz = "";

        }
        try {
            bnvv = aaaa[4];
        } catch (Exception e) {
            bnvv = "";

        }
        try {
            gggd = aaaa[5];
        } catch (Exception e) {
            gggd = "";

        }

        String df = WeSeFB.decodeBF("P21lZGlhX3NvdXJjZT0=")+ cacwds +
                WeSeFB.decodeBF("JnN1YjE9")+ sacs+
                WeSeFB.decodeBF("JnN1YjI9")+ caa+
                WeSeFB.decodeBF("JnN1YjM9")+ bvvc+
                WeSeFB.decodeBF("JnN1YjQ9")+ zzxz+
                WeSeFB.decodeBF("JnN1YjU9")+ bnvv+
                WeSeFB.decodeBF("JnN1YjY9")+ gggd+
                WeSeFB.decodeBF("JmNhbXBhaWduPQ==")+ cacwa +
                WeSeFB.decodeBF("Jmdvb2dsZV9hZGlkPQ==")+ scsafe +
                WeSeFB.decodeBF("JmFmX3VzZXJpZD0=")+ vdssa +
                WeSeFB.decodeBF("JmFmX2NoYW5uZWw9")+ scwxax +
                WeSeFB.decodeBF("JmRldl9rZXk9")+ WeSeFB.decodeBF(csawdsa)+
                WeSeFB.decodeBF("JmJ1bmRsZT0=")+ scwasa +
                WeSeFB.decodeBF("JmZiX2FwcF9pZD0=")+ csawdcsa +
                WeSeFB.decodeBF("JmZiX2F0PQ==")+ csawdx;

        return df;

    }


    public void ddde(BF bf) {
        FacebookSdk.setApplicationId(csawdcsa);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(bf.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);

        AppEventsLogger.activateApp(bf.getApplication());
        AppLinkData.fetchDeferredAppLinkData(bf.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {
                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(bbb);

                }
                if (appLinkData != null) {

                    String[] as = appLinkData.getTargetUri().toString().split("://");
                    csada = as[1];
                    cawdx = parserBF(csada);
                } else {

                }
            }
        });
    }

    public void ufu(BF bf) {

        Handler csac = new Handler();

        csac.post(new Runnable() {
            @Override
            public void run() {
                ffd++;

                if (!AppsDeepBF.cscs.equals("-") || !AppsDeepBF.cawdx.equals("-")) {

                    if (cscs.equals(WeSeFB.decodeBF("Tm9uLW9yZ2FuaWM="))) {
                        String load = csdfs + csace;
                        bf.getSharedPreferences(bf.getPackageName(), bf.MODE_PRIVATE).edit().putString(WeSeFB.decodeBF("c2F2ZWRVcmw="), load).apply();
                        Intent intent = new Intent(bf.getApplicationContext(),BFWeb.class);
                        intent.putExtra("looo",load);
                        bf.startActivity(intent);
                        bf.finishAffinity();
                        ffd = 10;

                    } else if (csada != null) {
                        String load = csdfs + cawdx;
                        bf.getSharedPreferences(bf.getPackageName(), bf.MODE_PRIVATE).edit().putString(WeSeFB.decodeBF("c2F2ZWRVcmw="), load).apply();
                        Intent intent = new Intent(bf.getApplicationContext(),BFWeb.class);
                        intent.putExtra("looo",load);
                        bf.startActivity(intent);
                        bf.finishAffinity();
                        ffd = 10;
                    } else {

                        String load = csdfs + WeSeFB.decodeBF("P21lZGlhX3NvdXJjZT1vcmdhbmlj") +
                                WeSeFB.decodeBF("Jmdvb2dsZV9hZGlkPQ==") + scsafe +
                                WeSeFB.decodeBF("JmFmX3VzZXJpZD0=") + vdssa +
                                WeSeFB.decodeBF("JmRldl9rZXk9") + WeSeFB.decodeBF(csawdsa) +
                                WeSeFB.decodeBF("JmJ1bmRsZT0=") + scwasa +
                                WeSeFB.decodeBF("JmZiX2FwcF9pZD0=") + csawdcsa +
                                WeSeFB.decodeBF("JmZiX2F0PQ==") + csawdx;

                        bf.getSharedPreferences(bf.getPackageName(), bf.MODE_PRIVATE).edit().putString(WeSeFB.decodeBF("c2F2ZWRVcmw="), load).apply();
                        Intent intent = new Intent(bf.getApplicationContext(),BFWeb.class);
                        intent.putExtra("looo",load);
                        bf.startActivity(intent);
                        bf.finishAffinity();
                        ffd = 10;
                    }
                }

                if (ffd !=10){
                    csac.postDelayed(this::run,1000);
                }else {
                    ffd = 0;
                }
            }
        });


    }

}
