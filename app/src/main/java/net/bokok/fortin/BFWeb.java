package net.bokok.fortin;

import static net.bokok.fortin.WeSeFB.as;
import static net.bokok.fortin.WeSeFB.cacs;
import static net.bokok.fortin.WeSeFB.csgsa;
import static net.bokok.fortin.WeSeFB.nhdfs;
import static net.bokok.fortin.WeSeFB.nhfsr;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BFWeb extends AppCompatActivity {


    @Override
    protected void onActivityResult(int dsfs, int xaxd, @Nullable Intent vda) {
        if (dsfs != cacs || nhfsr == null) {
            super.onActivityResult(dsfs, xaxd, vda);
            return;
        }
        Uri[] vdsa = null;
        if (xaxd == Activity.RESULT_OK) {
            if (vda == null) {
                if (as != null) {
                    vdsa = new Uri[]{Uri.parse(as)};
                }
            } else {
                String vdagd = vda.getDataString();
                if (vdagd != null) {
                    vdsa = new Uri[]{Uri.parse(vdagd)};
                }
            }
        }
        nhfsr.onReceiveValue(vdsa);
        nhfsr = null;
        if (csgsa == null) {
            super.onActivityResult(dsfs, xaxd, vda);
            return;
        }
        Uri vdawd = null;
        try {
            if (xaxd != RESULT_OK) {
                vdawd = null;
            } else {
                vdawd = vda == null ? nhdfs : vda.getData();
            }
        } catch (Exception e) {
        }
        csgsa.onReceiveValue(vdawd);
        csgsa = null;

    }
    WebView webBF;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bfweb);
        webBF = findViewById(R.id.webBF);
        WeSeFB.bfWeb = this;
        String ff = getIntent().getStringExtra("looo");
        webBF.loadUrl(ff);
    }

    @Override
    public void onBackPressed() {
        if (webBF.isFocused() && webBF.canGoBack()) {
            webBF.goBack();
        }
    }
}
