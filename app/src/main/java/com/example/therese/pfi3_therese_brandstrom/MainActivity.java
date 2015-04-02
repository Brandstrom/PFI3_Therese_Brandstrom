package com.example.therese.pfi3_therese_brandstrom;

import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    //public String[] mFacts =  Context.getResources().getStringArray(R.array.RandomQuotes);
    //public String mFact = null;

    //public String getFact() {

    Button nextquotebutton;
    TextView textView;



    int[] quotes = {R.string.quote_1, R.string.quote_2,R.string.quote_3 };

        // Randomly select a fact
       // Random randomGenerator = new Random(); // construct new RNG
        //int randomNumber = randomGenerator.nextInt(mFacts.length);

        //mFact = mFacts[randomNumber];
       // return mFact;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextquotebutton = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);


        //Button
        nextquotebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                //LogCat funktionen
                Log.i("Button", "The button was pressed");

                //HÄmtar och randomizerar
                int number = new Random().nextInt(3);
                String randomString = getString(quotes[number]);
                textView.setText(randomString);

            }

        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public boolean isDestroyed() {
        return super.isDestroyed();
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }
}


