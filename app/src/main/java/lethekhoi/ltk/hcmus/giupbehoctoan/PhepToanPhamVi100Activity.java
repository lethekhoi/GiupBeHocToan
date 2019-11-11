package lethekhoi.ltk.hcmus.giupbehoctoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class PhepToanPhamVi100Activity extends AppCompatActivity {

    TextView txtSoHang1, txtSoHang2, txtPhepToan;
    Button btnKiemTra;
    EditText edtKetQua;
    Random mRandom;
    int mRandomSt1 = 0;
    int mRandomSt2 = 0;
    int mKQ = 0;
    int mIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phep_toan_pham_vi100);

        init();

        mapView();

        event();
    }

    private void init() {
        txtSoHang1 = findViewById(R.id.txtSoHang1);
        txtSoHang2 = findViewById(R.id.txtSoHang2);
        txtPhepToan = findViewById(R.id.txtPhepToan);
        btnKiemTra = findViewById(R.id.btnKiemTra);
        edtKetQua = findViewById(R.id.edtKetQua);
        mRandom = new Random();
    }


    private void mapView() {

        handleRandom();

    }

    private void handleRandom() {
        mIndex = mRandom.nextInt(2);
        switch (mIndex) {
            case 0://+
                mRandomSt1 = mRandom.nextInt(100);
                mRandomSt2 = mRandom.nextInt(100 - mRandomSt1 + 1);
                txtSoHang1.setText(mRandomSt1 + "");
                txtSoHang2.setText(mRandomSt2 + "");
                txtPhepToan.setText("+");
                break;


            case 1:
                mRandomSt1 = mRandom.nextInt(100);
                mRandomSt2 = mRandom.nextInt(mRandomSt1 + 1);
                txtSoHang1.setText(mRandomSt1 + "");
                txtSoHang2.setText(mRandomSt2 + "");
                txtPhepToan.setText("-");
                break;
        }

    }

    private void event() {
        btnKiemTra.setOnClickListener(new View.OnClickListener() {
            String thongbao = "";
            @Override
            public void onClick(View view) {

                mKQ = Integer.parseInt(edtKetQua.getText().toString());
                switch (mIndex) {

                    case 0:
                        thongbao=  (mKQ==mRandomSt1+mRandomSt2)?"Chính xác":"Sai rồi";
                        Log.d("ABC",mRandomSt1 + "+" + mRandomSt2);
                        Toast.makeText(PhepToanPhamVi100Activity.this,thongbao,Toast.LENGTH_SHORT).show();
                        Log.d("ABC",thongbao);
                        break;

                    case 1:
                        thongbao=  (mKQ==mRandomSt1-mRandomSt2)? "Chính xác":"Sai rồi";
                        Toast.makeText(PhepToanPhamVi100Activity.this,thongbao,Toast.LENGTH_SHORT).show();
                        Log.d("ABC",mRandomSt1 + "-" + mRandomSt2);
                        Log.d("ABC",thongbao);
                        break;

                }
                handleRandom();
            }
        });


    }
}
