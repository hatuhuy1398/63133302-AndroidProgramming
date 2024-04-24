package hatuhuy1398.useintent_ex2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHome extends AppCompatActivity {

    TextView txt_username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        txt_username = findViewById(R.id.input_name);
        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("username");
        txt_username.setText(username);
    }
}