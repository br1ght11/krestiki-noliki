package com.example.krestiknolik;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button nachat;
    String[][] gameField = new String[3][3];
    TextView cheyHod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onlick_nachat(View view) {
        TextView p1 = (TextView)findViewById(R.id.pole1);
        TextView p2 = (TextView)findViewById(R.id.pole2);
        TextView p3 = (TextView)findViewById(R.id.pole3);
        TextView p4 = (TextView)findViewById(R.id.pole4);
        TextView p5 = (TextView)findViewById(R.id.pole5);
        TextView p6 = (TextView)findViewById(R.id.pole6);
        TextView p7 = (TextView)findViewById(R.id.pole7);
        TextView p8 = (TextView)findViewById(R.id.pole8);
        TextView p9 = (TextView)findViewById(R.id.pole9);
        p1.setBackground(getDrawable(R.drawable.black_border_textview));
        p2.setBackground(getDrawable(R.drawable.black_border_textview));
        p3.setBackground(getDrawable(R.drawable.black_border_textview));
        p4.setBackground(getDrawable(R.drawable.black_border_textview));
        p5.setBackground(getDrawable(R.drawable.black_border_textview));
        p6.setBackground(getDrawable(R.drawable.black_border_textview));
        p7.setBackground(getDrawable(R.drawable.black_border_textview));
        p8.setBackground(getDrawable(R.drawable.black_border_textview));
        p9.setBackground(getDrawable(R.drawable.black_border_textview));

    }

    public void onclick_pole1(View view) {
        TextView field = (TextView)findViewById(view.getId());
    }

    public void onclick_pole2(View view) {
        TextView field = (TextView)findViewById(view.getId());
    }

    public void onclick_pole3(View view) {
        TextView field = (TextView)findViewById(view.getId());
    }

    public void onclick_pole4(View view) {
        TextView field = (TextView)findViewById(view.getId());
    }

    public void onclick_pole5(View view) {
        TextView field = (TextView)findViewById(view.getId());
    }

    public void onclick_pole6(View view) {
        TextView field = (TextView)findViewById(view.getId());
    }

    public void onclick_pole7(View view) {
        TextView field = (TextView)findViewById(view.getId());
    }

    public void onclick_pole8(View view) {
        TextView field = (TextView)findViewById(view.getId());
    }

    public void onclick_pole9(View view) {
        TextView field = (TextView)findViewById(view.getId());
    }

}