package net.bokok.fortin;

import android.app.Application;

import androidx.lifecycle.ViewModelProvider;

public class AppBF extends Application {

   public static ViewMBF viewMBF;
    @Override
    public void onCreate() {
        super.onCreate();

        viewMBF = new ViewModelProvider
                .AndroidViewModelFactory(this)
                .create(ViewMBF.class);
    }

}
