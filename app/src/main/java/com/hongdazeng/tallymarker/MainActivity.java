package com.hongdazeng.tallymarker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int firstCount = 0;
    int secondCount = 0;
    int thirdCount = 0;

    String name1 = "Tally 1";
    String name2 = "Tally 2";
    String name3 = "Tally 3";

    TextView disFirst;
    TextView disSecond;
    TextView disThird;

    TextView nmFirst;
    TextView nmSecond;
    TextView nmThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Created by Hongda Zeng at Yhack 2015 ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final EditText input = (EditText) findViewById(R.id.editText);

        Button resetAll = (Button) findViewById(R.id.buttonReset);

        Button incFirst = (Button) findViewById(R.id.buttonInc1);
        Button incSecond = (Button) findViewById(R.id.buttonInc2);
        Button incThird = (Button) findViewById(R.id.buttonInc3);

        Button resFirst = (Button) findViewById(R.id.buttonRes1);
        Button resSecond = (Button) findViewById(R.id.buttonRes2);
        Button resThird = (Button) findViewById(R.id.buttonRes3);

        Button nameFirst = (Button) findViewById(R.id.set1);
        Button nameSecond = (Button) findViewById(R.id.set2);
        Button nameThird = (Button) findViewById(R.id.set3);

        disFirst = (TextView) findViewById(R.id.textView);
        disSecond = (TextView) findViewById(R.id.textView2);
        disThird = (TextView) findViewById(R.id.textView3);

        nmFirst = (TextView) findViewById(R.id.name1);
        nmSecond = (TextView) findViewById(R.id.name2);
        nmThird = (TextView) findViewById(R.id.name3);

        resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name1 = "Tally 1";
                name2 = "Tally 2";
                name3 = "Tally 3";
                refreshName();

                firstCount = 0;
                secondCount = 0;
                thirdCount = 0;
                refreshText();
            }
        });

        incFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstCount++;
                refreshText();
            }
        });

        incSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondCount++;
                refreshText();
            }
        });

        incThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirdCount++;
                refreshText();
            }
        });

        resFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstCount = 0;
                refreshText();
            }
        });

        resSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondCount = 0;
                refreshText();
            }
        });

        resThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirdCount = 0;
                refreshText();
            }
        });

        nameFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name1 = input.getText().toString();
                refreshName();
            }
        });

        nameSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name2 = input.getText().toString();
                refreshName();
            }
        });

        nameThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name3 = input.getText().toString();
                refreshName();
            }
        });
    }

    public void refreshText() {
        disFirst.setText(String.valueOf(firstCount));
        disSecond.setText(String.valueOf(secondCount));
        disThird.setText(String.valueOf(thirdCount));
    }

    public void refreshName() {
        nmFirst.setText(String.valueOf(name1));
        nmSecond.setText(String.valueOf(name2));
        nmThird.setText(String.valueOf(name3));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
