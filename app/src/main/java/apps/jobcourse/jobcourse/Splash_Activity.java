package apps.jobcourse.jobcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_Activity extends AppCompatActivity {
    Animation app_splash,bottom_totop;
    ImageView app_logo;
    TextView app_tagline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //load animation

        app_splash=AnimationUtils.loadAnimation(this,R.anim.app_splash);
        bottom_totop=AnimationUtils.loadAnimation(this,R.anim.app_splash);
        app_logo=findViewById(R.id.app_logo);
        app_tagline=findViewById(R.id.app_subtitle);

        app_logo.startAnimation(app_splash);
        app_tagline.startAnimation(bottom_totop);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //merubah activity
                Intent gogetstarted = new Intent(Splash_Activity.this, GetStarted_Activity.class);
                startActivity(gogetstarted);
                finish();
            }
        },2000);

    }
}