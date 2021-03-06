package edu.orangecoastcollege.cs273.alohamusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Displays a splash screen before the application begins
 */
public class SplashActivity extends AppCompatActivity {

    /**
     * Creates an instance of <code>SplashActivity</code> in the view
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Create a TimerTask to defer the loading of MusicActivity by 3 seconds
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // Finish the current SplashActivity
                finish();

                // Launch the MusicActivity
                Intent musicIntent = new Intent(SplashActivity.this, MusicActivity.class);
                startActivity(musicIntent);
            }
        };

        // Run the timer task after 3 seconds
        Timer timer = new Timer();
        timer.schedule(task, 3000);
    }
}
