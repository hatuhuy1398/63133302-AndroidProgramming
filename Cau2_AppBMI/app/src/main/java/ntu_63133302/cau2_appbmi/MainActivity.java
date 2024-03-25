package ntu_63133302.cau2_appbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText edtTuoi;
    EditText edtChieuCao;
    EditText edtCanNang;

    EditText edtKetQua;
    Button btnTinh;
    // group 2 radio

    RadioGroup radioGroup;
    RadioButton radNam;
    RadioButton radNu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimView();
        TinhBMI();
    }
    public void TimView(){
        edtTuoi = (EditText) findViewById(R.id.edtTuoi);
        edtChieuCao = (EditText) findViewById(R.id.edtChieuCao);
        edtCanNang = (EditText) findViewById(R.id.edtCanNang);
        btnTinh = (Button) findViewById(R.id.btnTinh);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radNam = (RadioButton) findViewById(R.id.radNam);
        radNu = (RadioButton) findViewById(R.id.radNu);
        edtKetQua = (EditText) findViewById(R.id.edtKetQua);
    }
    public void TinhBMI(){
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double chieuCao = Double.parseDouble(edtChieuCao.getText().toString());
                double canNang = Double.parseDouble(edtCanNang.getText().toString());
                double bmi = canNang / (chieuCao * chieuCao);
                String ketQua = "";
                // nữ
                if(radNu.isChecked()){
                    if(bmi < 19){
                        ketQua = "Bạn gầy. Cần tăng cân ngay!";
                    }else if(bmi >= 19 && bmi < 24){
                        ketQua = "Bạn bình thường! Hãy giữ vững cân nặng";
                    }else if(bmi >= 24 && bmi < 30){
                        ketQua = "Bạn béo phì. Cần giảm cân ngay!";
                    }else{
                        ketQua = "Bạn béo phì cấp độ 2 .Cần giảm cân ngay!";
                    }
                }else{
                    // nam
                    if(bmi < 20){
                        ketQua = "Bạn gầy.  Cần tăng cân ngay!";
                    }else if(bmi >= 20 && bmi < 25){
                        ketQua = "Bạn bình thường.  Hãy giữ vững cân nặng";
                    }else if(bmi >= 25 && bmi < 30){
                        ketQua = "Bạn béo phì.  Cần giảm cân ngay!";
                    }else{
                        ketQua = "Bạn béo phì cấp độ 2. Cần giảm cân ngay!";
                    }
                }
                edtKetQua.setText("Chỉ số BMI của bạn là: " + bmi + "\n" + ketQua);
            }
        });
    }
}