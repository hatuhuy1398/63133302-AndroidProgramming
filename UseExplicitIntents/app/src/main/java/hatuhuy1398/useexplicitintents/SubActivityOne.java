package hatuhuy1398.useexplicitintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class SubActivityOne extends AppCompatActivity {
    Button btn_sub_one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
        btn_sub_one = findViewById(R.id.btn_sub_one);
        btn_sub_one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent iSubOne = new Intent(SubActivityOne.this, MainActivity.class);
                startActivity(iSubOne);
            }
        });
    }
}
