package hatuhuy1398.useintent_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityLogin extends AppCompatActivity {
    Button btn_login;
    TextView input_username, input_password, input_email, error_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_login = findViewById(R.id.btn_login);
        input_username = findViewById(R.id.input_username);
        input_password = findViewById(R.id.input_password);
        input_email = findViewById(R.id.input_email);
        error_message = findViewById(R.id.error_message);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = input_username.getText().toString();
                String password = input_password.getText().toString();
                String email = input_email.getText().toString();
                if (username.equals("63MTT") && password.equals("hatuhuy1398")) {
                    Intent intent = new Intent(ActivityLogin.this, ActivityHome.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                }
                else{
                    error_message.setText("Username or password is incorrect");
                }
            }
        });
    }
}