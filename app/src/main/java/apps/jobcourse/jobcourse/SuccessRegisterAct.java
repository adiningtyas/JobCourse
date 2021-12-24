package apps.jobcourse.jobcourse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SuccessRegisterAct extends AppCompatActivity {
    Button btn_explore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_register);

        btn_explore=findViewById(R.id.btn_explore);

        btn_explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gotoregister= new Intent(SuccessRegisterAct.this, HomeAct.class);
                startActivity(gotoregister);
            }
        });
    }
}