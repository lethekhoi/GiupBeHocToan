package lethekhoi.ltk.hcmus.giupbehoctoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void button1Click(View view ){

        Intent intent = new Intent(this, HocSoActivity.class);

        startActivity(intent);
    }
    public void button2Click(View view) {
        Intent intent = new Intent(this, CompareActivity.class);

        startActivity(intent);

    }
    public void button3Click(View view ){

        Intent intent = new Intent(this, PhepToanPhamVi10Activity.class);

        startActivity(intent);
    }
    public void button4Click(View view ){

        Intent intent = new Intent(this, PhepToanPhamVi100Activity.class);

        startActivity(intent);
    }


}
