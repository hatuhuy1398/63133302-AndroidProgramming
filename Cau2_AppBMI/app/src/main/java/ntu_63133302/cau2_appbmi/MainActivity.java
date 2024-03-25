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
}