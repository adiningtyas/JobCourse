package apps.jobcourse.jobcourse;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GetStarted_Activity extends AppCompatActivity {
    Button btn_signin,btn_newaccount;
    Animation ttb, btt;
    ImageView emblem_app;
    TextView intro_app;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarted);

        // load animation
        ttb = AnimationUtils.loadAnimation(this, R.anim.ttb);
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);

        btn_signin = findViewById(R.id.btn_sign_in);
        btn_newaccount = findViewById(R.id.btn_new_account_create);

        emblem_app = findViewById(R.id.emblem_app);
        intro_app = findViewById(R.id.intro_app);

        // run animation
        emblem_app.startAnimation(ttb);
        intro_app.startAnimation(ttb);
        btn_signin.startAnimation(btt);
        btn_newaccount.startAnimation(btt);

        btn_signin = findViewById(R.id.btn_sign_in);
        btn_newaccount = findViewById(R.id.btn_new_account_create);

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosign = new Intent(GetStarted_Activity.this,SignInAct.class);
                startActivity(gotosign);
            }
        });

        btn_newaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoregisterone = new Intent(GetStarted_Activity.this,RegisterOneAct.class);
                startActivity(gotoregisterone);
            }
        });
    }
}
