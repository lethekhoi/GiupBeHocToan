package lethekhoi.ltk.hcmus.giupbehoctoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button mbtnBatDau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animation animationScale = AnimationUtils.loadAnimation(this, R.anim.amin_scale);
        final Animation animationAlpha = AnimationUtils.loadAnimation(this, R.anim.amin_alpha);

    }

    public static final String EXTRA_MESSAGE =
            "com.example.myfirstapp.MESSAGE";

    public void startProgram(View view) {
        Intent intent = new Intent(this, MenuActivity.class);

        startActivity(intent);

    }


}
