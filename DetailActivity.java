package com.simra.recyclerview.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.simra.recyclerview.R;

public class DetailActivity extends AppCompatActivity {
    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_QUOTE = "EXTRA_QUOTE";
    private static final String EXTRA_ATTR = "EXTRA_ATTR";
    private static final String[] Hitting = {""};
    private static final String[] Passing = {""};
    private static final String[] Game_to_21 = {""};
    private static final String[] OTM_1 = {""};
    private static final String[] OTM_5 = {""};
    private static final String[] OTM_short = {""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS);

        ((TextView)findViewById(R.id.name)).setText(extras.getString(EXTRA_QUOTE));
        ((TextView)findViewById(R.id.position)).setText(extras.getString(EXTRA_ATTR));


        Button addItem = (Button) findViewById(R.id.addStats);
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}