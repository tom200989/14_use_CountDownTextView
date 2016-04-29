package com.wdpm.countdowntextview;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.wdpm.library.CountDownTextView;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private CountDownTextView mTv;
    Button run;
    Button pause;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        mTv = (CountDownTextView) findViewById(R.id.count_down_text_view);
        run= (Button) findViewById(R.id.btn_run);
        pause= (Button) findViewById(R.id.btn_pause);
        reset= (Button) findViewById(R.id.btn_reset);

        Typeface mTypeface = Typeface.createFromAsset(this.getAssets(), "fonts/wawa.ttf");
        mTv.setTypeface(mTypeface);
        mTv.setCount(20);
        mTv.setTopColor(Color.RED);
        mTv.setBottomColor(Color.GREEN);
        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTv.run();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTv.pause();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTv.reset();
            }
        });

    }

}
