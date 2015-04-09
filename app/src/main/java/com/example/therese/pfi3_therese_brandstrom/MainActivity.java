package com.example.therese.pfi3_therese_brandstrom;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {
//    private static final android.R.attr R = ;

    // zpublic String[] mFacts =  Context.getResources().getStringArray(R.array.RandomQuotes);
//    public String mFact = null;

    //public String getFact() {

    //Button nextquotebutton;
    //TextView textView;


    //int[] quotes = { R.string.quote_1 , R.string.quote_2,R.string.quote_3 };

    // Randomly select a fact
    // Random randomGenerator = new Random(); // construct new RNG
    //int randomNumber = randomGenerator.nextInt(mFacts.length);

    //mFact = mFacts[randomNumber];
    // return mFact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_main);
        //  nextquotebutton = (Button) findViewById(R.id.button);
        //textView = (TextView) findViewById(R.id.textView);
    }

    public void clickelick(View v) {
        Log.i("Button", "The button was pressed");
        //  int number = new Random().nextInt(2);
        //  String randomString = getResources().getString( quotes[1]);
        // textView.setText(randomString);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        Log.i("Button", "onCreate");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        return true;
    }

    // return super.onOptionsItemSelected(item);


    @Override
    protected void onStop() {
        super.onStop();
    }
    // Log.i("assignment_1", "onStop");

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    //  Log.i("Button", "onDestroy");
    @Override
    protected void onPause() {
        super.onPause();
    }
    //Log.i("Button", "onPause");

    @Override
    protected void onResume() {
        super.onResume();
    }
    //Log.i("Button", "oResume");

    @Override
    protected void onStart() {
        Log.i("Button", "onStart");
        super.onStart();
    }

    // @Override
    private boolean onDestroyed(View v) {
        Log.i("Button", "onDestroyed");
        return super.isDestroyed();


    }


    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.i("Button", "onCreate");
    }
}



