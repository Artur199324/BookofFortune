package net.bokok.fortin;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class GameBF {

    int a = 0;
    private ImageView s1, s2, s3, s4, s5, s6;
    private TextView textViewWin,tM;
    int bet = 0;


    public GameBF() {
    }

    public TextView gettM() {
        return tM;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public void settM(TextView tM) {
        this.tM = tM;
    }

    public TextView getTextViewWin() {
        return textViewWin;
    }

    public void setTextViewWin(TextView textViewWin) {
        this.textViewWin = textViewWin;
    }

    public ImageView getS1() {
        return s1;
    }

    public void setS1(ImageView s1) {
        this.s1 = s1;
    }

    public ImageView getS2() {
        return s2;
    }

    public void setS2(ImageView s2) {
        this.s2 = s2;
    }

    public ImageView getS3() {
        return s3;
    }

    public void setS3(ImageView s3) {
        this.s3 = s3;
    }

    public ImageView getS4() {
        return s4;
    }

    public void setS4(ImageView s4) {
        this.s4 = s4;
    }

    public ImageView getS5() {
        return s5;
    }

    public void setS5(ImageView s5) {
        this.s5 = s5;
    }

    public ImageView getS6() {
        return s6;
    }

    public void setS6(ImageView s6) {
        this.s6 = s6;
    }


    public void game() {

        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {

                Random random = new Random();
                int i = random.nextInt(5);
                int b = random.nextInt(5);
                int c = random.nextInt(5);
                int v = random.nextInt(5);
                int n = random.nextInt(5);
                int m = random.nextInt(5);
                if (i == 0) {
                    s1.setImageResource(R.drawable.slot1);
                    s1.setTag(0);
                }
                if (i == 1) {
                    s1.setImageResource(R.drawable.slot2);
                    s1.setTag(1);
                }
                if (i == 2) {
                    s1.setImageResource(R.drawable.slot3);
                    s1.setTag(2);
                }
                if (i == 3) {
                    s1.setImageResource(R.drawable.slot4);
                    s1.setTag(3);
                }
                if (i == 4) {
                    s1.setImageResource(R.drawable.slot5);
                    s1.setTag(4);
                }

                if (b == 0) {
                    s2.setImageResource(R.drawable.slot1);
                    s2.setTag(0);
                }
                if (b == 1) {
                    s2.setImageResource(R.drawable.slot2);
                    s2.setTag(1);
                }
                if (b == 2) {
                    s2.setImageResource(R.drawable.slot3);
                    s2.setTag(2);
                }
                if (b == 3) {
                    s2.setImageResource(R.drawable.slot4);
                    s2.setTag(3);
                }

                if (b == 4) {
                    s2.setImageResource(R.drawable.slot5);
                    s2.setTag(4);
                }

                if (c == 0) {
                    s3.setImageResource(R.drawable.slot1);
                    s3.setTag(0);
                }
                if (c == 1) {
                    s3.setImageResource(R.drawable.slot2);
                    s3.setTag(1);
                }
                if (c == 2) {
                    s3.setImageResource(R.drawable.slot3);
                    s3.setTag(2);
                }
                if (c == 3) {
                    s3.setImageResource(R.drawable.slot4);
                    s3.setTag(3);
                }
                if (c == 4) {
                    s3.setImageResource(R.drawable.slot5);
                    s3.setTag(4);
                }

                if (v == 0) {
                    s4.setImageResource(R.drawable.slot1);
                    s4.setTag(0);
                }
                if (v == 1) {
                    s4.setImageResource(R.drawable.slot2);
                    s4.setTag(1);
                }
                if (v == 2) {
                    s4.setImageResource(R.drawable.slot3);
                    s4.setTag(2);
                }
                if (v == 3) {
                    s4.setImageResource(R.drawable.slot4);
                    s4.setTag(3);
                }

                if (v == 4) {
                    s4.setImageResource(R.drawable.slot5);
                    s4.setTag(4);
                }

                if (n == 0) {
                    s5.setImageResource(R.drawable.slot1);
                    s5.setTag(0);
                }
                if (n == 1) {
                    s5.setImageResource(R.drawable.slot2);
                    s5.setTag(1);
                }
                if (n == 2) {
                    s5.setImageResource(R.drawable.slot3);
                    s5.setTag(2);
                }
                if (n == 3) {
                    s5.setImageResource(R.drawable.slot4);
                    s5.setTag(3);
                }
                if (n == 4) {
                    s5.setImageResource(R.drawable.slot5);
                    s5.setTag(4);
                }
                if (m == 0) {
                    s6.setImageResource(R.drawable.slot1);
                    s6.setTag(0);
                }
                if (m == 1) {
                    s6.setImageResource(R.drawable.slot2);
                    s6.setTag(1);
                }
                if (m == 2) {
                    s6.setImageResource(R.drawable.slot3);
                    s6.setTag(2);
                }
                if (m == 3) {
                    s6.setImageResource(R.drawable.slot4);
                    s6.setTag(3);
                }

                if (m == 4) {
                    s6.setImageResource(R.drawable.slot5);
                    s6.setTag(4);
                }

                a++;
                if (a != 40) {
                    handler.postDelayed(this::run, 10);
                } else {
                    a = 0;

                }


            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                int b1 = (int) s1.getTag();
                int b2 = (int) s2.getTag();
                int b3 = (int) s3.getTag();
                int b4 = (int) s4.getTag();
                int b5 = (int) s5.getTag();
                int b6 = (int) s6.getTag();

                int gg = 0;
                int bb = 0;
                if (b1 == b3 || b5 == b1) {
                    gg = 1;
                }

                if (b2 == b4 || b6 == b2) {
                    bb = 1;
                }

                if (gg == 1 && bb == 1) {

                    textViewWin.setVisibility(View.VISIBLE);
                    textViewWin.setText("YOU WIN");
                    bet += bet/2;
                    tM.setText(bet+"");
                } else if (gg == 1) {
                    textViewWin.setVisibility(View.VISIBLE);
                    textViewWin.setText("YOU have won half the bet");
                    bet += (bet/2)/2;
                    tM.setText(bet+"");
                } else if (bb == 1) {
                    textViewWin.setVisibility(View.VISIBLE);
                    textViewWin.setText("YOU have won half the bet");
                    bet += (bet/2)/2;
                    tM.setText(bet+"");
                } else {
                    textViewWin.setVisibility(View.VISIBLE);
                    textViewWin.setText("you lost");
                    bet -= (bet/3);
                    tM.setText(bet+"");
                }


            }


        }, 1000);


    }
}
