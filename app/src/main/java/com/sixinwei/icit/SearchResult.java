package com.sixinwei.icit;

import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by John on 2016-04-01.
 */
public class SearchResult extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        TextView text = (TextView) findViewById(R.id.model);
        Intent intent = getIntent();
        text.setText("型号是"+String.valueOf(intent.getStringExtra("model")));
    }
}
