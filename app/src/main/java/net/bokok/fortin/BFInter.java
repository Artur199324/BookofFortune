package net.bokok.fortin;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import github.ishaan.buttonprogressbar.ButtonProgressBar;

public class BFInter extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bfinter);
        final ButtonProgressBar bpb_inter = (ButtonProgressBar) findViewById(R.id.bpb_inter);
        bpb_inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bpb_inter.startLoader();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        bpb_inter.stopLoader();
                       startActivity(new Intent(getApplicationContext(),BF.class));
                       finishAffinity();
                    }
                }, 2000);
            }
        });
    }
}
