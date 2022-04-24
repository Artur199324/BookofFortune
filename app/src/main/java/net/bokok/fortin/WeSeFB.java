package net.bokok.fortin;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WeSeFB {
    public static ValueCallback<Uri> csgsa;
    public static Uri nhdfs = null;
    public static ValueCallback<Uri[]> nhfsr;
    public static String as;
    public static final int cacs = 1;

    private WFB wfb;
    public static BFWeb bfWeb;
    public WeSeFB(WFB wfb) {
        this.wfb = wfb;
    }

    public WFB getWfb() {
        return wfb;
    }

    public void setWfb(WFB wfb) {
        this.wfb = wfb;
    }

    public void wesefb(){
        wfb.getSettings().setJavaScriptEnabled(true);
        wfb.getSettings().setDomStorageEnabled(true);
        wfb.getSettings().setLoadWithOverviewMode(true);
        wfb.clearCache(false);
        wfb.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(wfb, true);

        wfb.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (url.contains(decodeBF("ZXJyb3I9YXBwYWZBczNm")) || url.contains(decodeBF("ZGlzYWJsZWQuaHRtbA=="))) {

                    bfWeb.startActivity(new Intent(bfWeb.getApplicationContext(),BFButt.class));
                    bfWeb.finishAffinity();
                    Log.d("weq","bot");
                }
            }
        });
        wfb.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(WebView view,
                                             ValueCallback<Uri[]> csac,
                                             FileChooserParams csaw) {
                if (nhfsr != null) {
                    nhfsr.onReceiveValue(null);
                }
                nhfsr = csac;
                Intent cacrew = new Intent(Intent.ACTION_GET_CONTENT);
                cacrew.addCategory(Intent.CATEGORY_OPENABLE);
                cacrew.setType("*/*");
                Intent[] ngt = new Intent[0];
                Intent jytr = new Intent(Intent.ACTION_CHOOSER);
                jytr.putExtra(Intent.EXTRA_INTENT, cacrew);
                jytr.putExtra(Intent.EXTRA_TITLE, decodeBF("U2VsZWN0IE9wdGlvbjo="));
                jytr.putExtra(Intent.EXTRA_INITIAL_INTENTS, ngt);
                bfWeb.startActivityForResult(jytr, 1);
                return true;
            }
        });
    }

    public static String decodeBF(String vds){
        byte[] decoded = android.util.Base64.decode(vds, Base64.DEFAULT);
        return new String(decoded);
    }
}
