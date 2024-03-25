package ntu_63133302.cau3_gioithieubanthan;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shareButton = findViewById(R.id.share_button);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareProfile();
            }
        });
    }

    private void shareProfile() {
        String name = "Hà Tứ Huy";
        String email = "huy.ht.63cntt@ntu.edu.vn";
        String address = "Nha Trang, Khánh Hoà";
        String occupation = "Sinh Viên";
        String education = "NTU";
        String tele="0123456789";

        String message =
                "Name: " + name + "\t\t" +
                "Email: " + email + "\t\t" +
                "Address: " + address + "\t\t" +
                "Occupation: " + occupation + "\t\t" +
                "Education: " + education + "\t\t" +
                "Telephone: " + tele;

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My Profile");
        shareIntent.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(Intent.createChooser(shareIntent, "Share Profile via"));
    }
}
