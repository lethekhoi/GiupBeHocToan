package lethekhoi.ltk.hcmus.giupbehoctoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class HocSoActivity extends AppCompatActivity {
    ImageButton imgButton1, imgButton2;
    int index;
    int number;
    ImageView imgViewHinh;
    int[] arrayImage = new int[11];
    int[] arrayHinh = new int[11];
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoc_so);
        init();
        mapView();
        event();
    }

    private void init() {
        imgButton1 = findViewById(R.id.imagebutton1);
        imgButton2 = findViewById(R.id.imagebutton2);
        imgViewHinh = findViewById(R.id.imgHinh);
        arrayImage[1] = R.drawable.ic_one;
        arrayImage[2] = R.drawable.ic_two;
        arrayImage[3] = R.drawable.ic_three;
        arrayImage[4] = R.drawable.ic_four;
        arrayImage[5] = R.drawable.ic_five;
        arrayImage[6] = R.drawable.ic_six;
        arrayImage[7] = R.drawable.ic_seven;
        arrayImage[8] = R.drawable.ic_eight;
        arrayImage[9] = R.drawable.ic_nine;
        arrayImage[10] = R.drawable.ic_eight;

        arrayHinh[1]= R.drawable.one;
        arrayHinh[2]= R.drawable.two;
        arrayHinh[3]= R.drawable.three;
        arrayHinh[4]= R.drawable.four;
        arrayHinh[5]= R.drawable.five;
        arrayHinh[6]= R.drawable.six;
        arrayHinh[7]= R.drawable.seven;
        arrayHinh[8]= R.drawable.eight;
        arrayHinh[9]= R.drawable.nine;
        arrayHinh[10]= R.drawable.eight;


        random = new Random();

    }

    private void mapView() {
        handleRandom();

    }

    private void handleRandom() {
        index = random.nextInt(2);
        number = random.nextInt(9) + 1;
        Log.d("BBB", index + "");
        Log.d("BBB", number + "");
        switch (index) {

            case 0:

                imgViewHinh.setImageResource(arrayHinh[number]);
                imgButton1.setImageResource(arrayImage[number]);
                imgButton2.setImageResource(arrayImage[number + 1]);

                break;
            case 1:
                imgViewHinh.setImageResource(arrayHinh[number]);
                imgButton2.setImageResource(arrayImage[number]);
                imgButton1.setImageResource(arrayImage[number + 1]);
                break;
        }

    }

    private void event() {

       imgButton1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch(index){
                   case 0:
                       Toast.makeText(HocSoActivity.this, "Chính xác", Toast.LENGTH_SHORT).show();
                       handleRandom();
                       break;
                   case 1:
                       Toast.makeText(HocSoActivity.this, "Sai rồi", Toast.LENGTH_SHORT).show();
                       handleRandom();
                       break;
               }
           }
       });
       imgButton2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               switch(index){
                   case 0:
                       Toast.makeText(HocSoActivity.this, "Sai rồi", Toast.LENGTH_SHORT).show();
                       handleRandom();
                       break;
                   case 1:
                       Toast.makeText(HocSoActivity.this, "Chính xác", Toast.LENGTH_SHORT).show();
                       handleRandom();
                       break;
               }
           }
       });
        /*switch (index) {
            case 1:
                imgButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(HocSoActivity.this, "Chính xác", Toast.LENGTH_SHORT).show();
                        handleRandom();
                    }
                });
                imgButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(HocSoActivity.this, "Sai rồi", Toast.LENGTH_SHORT).show();
                        handleRandom();

                    }
                });

                break;
            case 0:
                imgButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(HocSoActivity.this, "Chính xác", Toast.LENGTH_SHORT).show();
                        handleRandom();
                    }
                });
                imgButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(HocSoActivity.this, "Sai rồi", Toast.LENGTH_SHORT).show();
                        handleRandom();
                    }

                });


                break;

        }*/

}
}
