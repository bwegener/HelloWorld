package edu.orangecoastcollege.cs273.bwegener.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This activity displays "Hello World" to the screen.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Initializes <code>PetListActivity</code> by inflating its UI.
     *
     * @param savedInstanceState Bundle containing the data it recently supplied in
     *                           onSaveInstanceState(Bundle) if activity was reinitialized after
     *                           being previously shut down. Otherwise it is null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
