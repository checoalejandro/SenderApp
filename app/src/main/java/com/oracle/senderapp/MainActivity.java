package com.oracle.senderapp;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.oracle.lensapi.models.JsonData;

import com.google.gson.Gson;
import com.oracle.lensapi.LensAPI;

public class MainActivity extends AppCompatActivity {
    private static final String TEXTVIEW_TAG = "{\"name\":\"Sunspots\",\"subtitle\":\"sheet 1\",\"headers\":[\"Country\",\"Name\",\"Amount\",\"Age\",\"Money\"],\"content\":[[\"Mexico\",\"Alex\",\"1241\",\"22\",\"6708\"],[\"Canada\",\"Luis\",\"1241\",\"27\",\"45064\"],[\"US\",\"Maria\",\"1241\",\"25\",\"4520\"],[\"Mexico\",\"John\",\"1241\",\"26\",\"1204\"],[\"US\",\"Luis\",\"1241\",\"22\",\"7665\"],[\"Mexico\",\"Alex\",\"1241\",\"22\",\"7900\"],[\"Canada\",\"Luis\",\"1241\",\"26\",\"5890\"],[\"Mexico\",\"Maria\",\"1241\",\"25\",\"7943\"],[\"US\",\"Luis\",\"1241\",\"22\",\"3405\"],[\"US\",\"Alex\",\"1241\",\"25\",\"3467\"],[\"Mexico\",\"Alonso\",\"1241\",\"27\",\"8052\"],[\"Canada\",\"Alex\",\"1241\",\"22\",\"7594\"],[\"US\",\"Luis\",\"1241\",\"25\",\"8001\"],[\"Mexico\",\"Freddy\",\"1241\",\"22\",\"5734\"],[\"Canada\",\"Alex\",\"1241\",\"22\",\"5631\"],[\"US\",\"Alex\",\"1241\",\"27\",\"1903\"],[\"Mexico\",\"Luis\",\"1241\",\"25\",\"2049\"],[\"Canada\",\"Freddy\",\"1241\",\"22\",\"3067\"],[\"US\",\"John\",\"1241\",\"26\",\"2501\"],[\"Mexico\",\"Maria\",\"1241\",\"26\",\"7840\"],[\"Mexico\",\"Alex\",\"1241\",\"22\",\"6708\"],[\"Canada\",\"Luis\",\"1241\",\"27\",\"45064\"],[\"US\",\"Maria\",\"1241\",\"25\",\"4520\"],[\"Mexico\",\"John\",\"1241\",\"26\",\"1204\"],[\"US\",\"Luis\",\"1241\",\"22\",\"7665\"],[\"Mexico\",\"Alex\",\"1241\",\"22\",\"7900\"],[\"Canada\",\"Luis\",\"1241\",\"26\",\"5890\"],[\"Mexico\",\"Maria\",\"1241\",\"25\",\"7943\"],[\"US\",\"Luis\",\"1241\",\"22\",\"3405\"],[\"US\",\"Alex\",\"1241\",\"25\",\"3467\"],[\"Mexico\",\"Alonso\",\"1241\",\"27\",\"8052\"],[\"Canada\",\"Alex\",\"1241\",\"22\",\"7594\"],[\"US\",\"Luis\",\"1241\",\"25\",\"8001\"],[\"Mexico\",\"Freddy\",\"1241\",\"22\",\"5734\"],[\"Canada\",\"Alex\",\"1241\",\"22\",\"5631\"],[\"US\",\"Alex\",\"1241\",\"27\",\"1903\"],[\"Mexico\",\"Luis\",\"1241\",\"25\",\"2049\"],[\"Canada\",\"Freddy\",\"1241\",\"22\",\"3067\"],[\"US\",\"John\",\"1241\",\"26\",\"2501\"],[\"Mexico\",\"Maria\",\"1241\",\"26\",\"7840\"],[\"Mexico\",\"Alex\",\"1241\",\"22\",\"6708\"],[\"Canada\",\"Luis\",\"1241\",\"27\",\"45064\"],[\"US\",\"Maria\",\"1241\",\"25\",\"4520\"],[\"Mexico\",\"John\",\"1241\",\"26\",\"1204\"],[\"US\",\"Luis\",\"1241\",\"22\",\"7665\"],[\"Mexico\",\"Alex\",\"1241\",\"22\",\"7900\"],[\"Canada\",\"Luis\",\"1241\",\"26\",\"5890\"],[\"Mexico\",\"Maria\",\"1241\",\"25\",\"7943\"],[\"US\",\"Luis\",\"1241\",\"22\",\"3405\"],[\"US\",\"Alex\",\"1241\",\"25\",\"3467\"],[\"Mexico\",\"Alonso\",\"1241\",\"27\",\"8052\"],[\"Canada\",\"Alex\",\"1241\",\"22\",\"7594\"],[\"US\",\"Luis\",\"1241\",\"25\",\"8001\"],[\"Mexico\",\"Freddy\",\"1241\",\"22\",\"5734\"],[\"Canada\",\"Alex\",\"1241\",\"22\",\"5631\"],[\"US\",\"Alex\",\"1241\",\"27\",\"1903\"],[\"Mexico\",\"Luis\",\"1241\",\"25\",\"2049\"],[\"Canada\",\"Freddy\",\"1241\",\"22\",\"3067\"],[\"US\",\"John\",\"1241\",\"26\",\"2501\"],[\"Mexico\",\"Maria\",\"1241\",\"26\",\"7840\"],[\"Mexico\",\"Alex\",\"1241\",\"22\",\"6708\"],[\"Canada\",\"Luis\",\"1241\",\"27\",\"45064\"],[\"US\",\"Maria\",\"1241\",\"25\",\"4520\"],[\"Mexico\",\"John\",\"1241\",\"26\",\"1204\"],[\"US\",\"Luis\",\"1241\",\"22\",\"7665\"],[\"Mexico\",\"Alex\",\"1241\",\"22\",\"7900\"],[\"Canada\",\"Luis\",\"1241\",\"26\",\"5890\"],[\"Mexico\",\"Maria\",\"1241\",\"25\",\"7943\"],[\"US\",\"Luis\",\"1241\",\"22\",\"3405\"],[\"US\",\"Alex\",\"1241\",\"25\",\"3467\"],[\"Mexico\",\"Alonso\",\"1241\",\"27\",\"8052\"],[\"Canada\",\"Alex\",\"1241\",\"22\",\"7594\"],[\"US\",\"Luis\",\"1241\",\"25\",\"8001\"],[\"Mexico\",\"Freddy\",\"1241\",\"22\",\"5734\"],[\"Canada\",\"Alex\",\"1241\",\"22\",\"5631\"],[\"US\",\"Alex\",\"1241\",\"27\",\"1903\"],[\"Mexico\",\"Luis\",\"1241\",\"25\",\"2049\"],[\"Canada\",\"Freddy\",\"1241\",\"22\",\"3067\"],[\"US\",\"John\",\"1241\",\"26\",\"2501\"],[\"Mexico\",\"Maria\",\"1241\",\"26\",\"7840\"],[\"Mexico\",\"Alex\",\"1241\",\"22\",\"6708\"],[\"Canada\",\"Luis\",\"1241\",\"27\",\"45064\"],[\"US\",\"Maria\",\"1241\",\"25\",\"4520\"],[\"Mexico\",\"John\",\"1241\",\"26\",\"1204\"],[\"US\",\"Luis\",\"1241\",\"22\",\"7665\"],[\"Mexico\",\"Alex\",\"1241\",\"22\",\"7900\"],[\"Canada\",\"Luis\",\"1241\",\"26\",\"5890\"],[\"Mexico\",\"Maria\",\"1241\",\"25\",\"7943\"],[\"US\",\"Luis\",\"1241\",\"22\",\"3405\"],[\"US\",\"Alex\",\"1241\",\"25\",\"3467\"],[\"Mexico\",\"Alonso\",\"1241\",\"27\",\"8052\"],[\"Canada\",\"Alex\",\"1241\",\"22\",\"7594\"],[\"US\",\"Luis\",\"1241\",\"25\",\"8001\"],[\"Mexico\",\"Freddy\",\"1241\",\"22\",\"5734\"],[\"Canada\",\"Alex\",\"1241\",\"22\",\"5631\"],[\"US\",\"Alex\",\"1241\",\"27\",\"1903\"],[\"Mexico\",\"Luis\",\"1241\",\"25\",\"2049\"],[\"Canada\",\"Freddy\",\"1241\",\"22\",\"3067\"],[\"US\",\"John\",\"1241\",\"26\",\"2501\"],[\"Mexico\",\"Maria\",\"1241\",\"26\",\"7840\"]]}";

    Button btnSecondActivity;
    TextView txtDragMe;
    EditText etxtName;
    EditText etxtSubtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSecondActivity = (Button)findViewById(R.id.btnSecondActivity);
        btnSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        etxtName = (EditText) findViewById(R.id.etxtProjectName);
        etxtSubtitle = (EditText) findViewById(R.id.etxtProjectSubtitle);
        txtDragMe = (TextView)findViewById(R.id.txtDragMe);


        txtDragMe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                JsonData jsonData = new Gson().fromJson(TEXTVIEW_TAG, JsonData.class);
                if(!etxtName.getText().toString().isEmpty()){
                    jsonData.setName(etxtName.getText().toString());
                }

                if(!etxtSubtitle.getText().toString().isEmpty()){
                    jsonData.setSubtitle(etxtSubtitle.getText().toString());
                }

                txtDragMe.setTag(new Gson().toJson(jsonData));

                LensAPI.startDrag(view, jsonData);
                return true;
            }
        });

    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        Log.i("MainActivity", "On multiwindow");
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }
}
