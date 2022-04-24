package net.bokok.fortin;

import static net.bokok.fortin.AppBF.viewMBF;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView s1, s2,s3,s4,s5,s6,imageStart,imageM;
    TextView textViewWin,tM;
    int bb = 0;


    public void initViewBF(){
        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);
        s4 = findViewById(R.id.s4);
        s5 = findViewById(R.id.s5);
        s6 = findViewById(R.id.s6);
        imageStart = findViewById(R.id.imageStart);
        imageM = findViewById(R.id.imageM);
        textViewWin = findViewById(R.id.textViewWin);
        tM = findViewById(R.id.tM);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewBF();


        imageStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewMBF.getB() !=0){
                    textViewWin.setVisibility(View.INVISIBLE);
                    viewMBF.gameStartBF(s1,s2,s3,s4,s5,s6,textViewWin,tM);
                }else {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Place your bet", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });

        imageM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bb = 0;
                viewMBF.setB(bb);
                EditText inputEditTextField = new EditText(MainActivity.this);
                inputEditTextField.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        try {
                            bb = Integer.parseInt(editable.toString());
                            tM.setText(bb+"");
                        }catch (Exception e){
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "Enter the number!", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                    }
                });
                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Place your bet")

                        .setView(inputEditTextField)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                if (bb !=0){
                                    viewMBF.setB(bb);

                                }else {
                                    Toast toast = Toast.makeText(getApplicationContext(),
                                            "Place your bet", Toast.LENGTH_SHORT);
                                    toast.show();
                                }
                            }
                        })
                        .setNegativeButton("Cancel", null)
                        .create();
                dialog.show();
            }
        });

    }
}