package net.bokok.fortin;

import android.annotation.SuppressLint;
import android.app.Application;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class ViewMBF extends AndroidViewModel {
    GameBF gameBF;
    ConBF conBF;
    AppsDeepBF appsDeepBF;


    public ViewMBF(@NonNull Application application) {
        super(application);
        gameBF = new GameBF();
        conBF = new ConBF();
        appsDeepBF = new AppsDeepBF();

    }

    public void gameStartBF(ImageView s1, ImageView s2, ImageView s3, ImageView s4, ImageView s5, ImageView s6, TextView textView, TextView tM) {
        gameBF.setS1(s1);
        gameBF.setS2(s2);
        gameBF.setS3(s3);
        gameBF.setS4(s4);
        gameBF.setS5(s5);
        gameBF.setS6(s6);
        gameBF.settM(tM);
        gameBF.setTextViewWin(textView);
        gameBF.game();
    }

    public void setB(int bb) {
        gameBF.setBet(bb);
    }

    public int getB() {
        return gameBF.getBet();
    }

    public ConBF getCon(String sasa) {
        conBF.cooBF(sasa);
        return conBF;
    }

    public void appsInBF(BF bf) {

        appsDeepBF.oneSignalBF(bf);
        appsDeepBF.ifj(bf);
        appsDeepBF.uyu(bf);

        appsDeepBF.ddde(bf);
    }

    public void dsd(BF bf) {
        appsDeepBF.iuh(bf);
    }

    public void flf(String pac, String fb, String fbT, String linnn) {

        appsDeepBF.setPackageNameBF(pac);
        appsDeepBF.setFbIdBF(fb);
        appsDeepBF.setFbTokenBF(fbT);
        appsDeepBF.setLink(linnn);
    }

    public void uu(BF bf) {
        appsDeepBF.ufu(bf);
    }
}
