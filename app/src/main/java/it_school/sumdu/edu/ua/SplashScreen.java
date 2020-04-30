package it_school.sumdu.edu.ua;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
/**
 * Created by walk on 24.02.2016.
 */
public class SplashScreen extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 3*1000);
    }
}
