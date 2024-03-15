package hatuhuy1398.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void XuLyCong(View view){
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextSoKQ = findViewById(R.id.edtKQ);

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
        int tong = so_A+so_B;

        String strTong=String.valueOf(tong);
        editTextSoKQ.setText(strTong);

    }
    public void XuLyTru(View view){
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextSoKQ = findViewById(R.id.edtKQ);

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
        int hieu = so_A-so_B;

        String strHieu=String.valueOf(hieu);
        editTextSoKQ.setText(strHieu);

    }
    public void XuLyNhan(View view){
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextSoKQ = findViewById(R.id.edtKQ);

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
        int tich = so_A*so_B;

        String strTich=String.valueOf(tich);
        editTextSoKQ.setText(strTich);

    }
    public void XuLyChia(View view){

        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextSoKQ = findViewById(R.id.edtKQ);

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        double so_A = Integer.parseInt(strA);
        double so_B = Integer.parseInt(strB);
        if(so_B==0){
            editTextSoKQ.setText("Khong chia duoc!!!");
        }
        else{
            double thuong=so_A/so_B;
            String strThuong=String.valueOf(thuong);
            editTextSoKQ.setText(strThuong);
        }



    }
}