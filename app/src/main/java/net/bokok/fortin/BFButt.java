package net.bokok.fortin;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import github.ishaan.buttonprogressbar.ButtonProgressBar;

public class BFButt extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bfbutt);
        final ButtonProgressBar bpb_start = (ButtonProgressBar) findViewById(R.id.bpb_start);
        bpb_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bpb_start.startLoader();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        bpb_start.stopLoader();
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    }
                }, 2000);
            }
        });
        final ButtonProgressBar bpb_close = (ButtonProgressBar) findViewById(R.id.bpb_close);
        bpb_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bpb_close.startLoader();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        bpb_close.stopLoader();
                        finishAffinity();
                    }
                }, 2000);
            }
        });
    }
}
