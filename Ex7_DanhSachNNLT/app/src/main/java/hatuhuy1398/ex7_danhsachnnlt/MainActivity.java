package hatuhuy1398.ex7_danhsachnnlt;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //khai bao
    String myphone[] ={"Python","C#","Java","Kotlin","Ruby","C++"};
    ArrayAdapter<String> myadapter;
    ListView lv1;
    TextView txt_Select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //anh xa id
        txt_Select= findViewById(R.id.txt_Select);
        lv1= findViewById(R.id.lv1);
        myadapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,myphone);
        lv1.setAdapter(myadapter);

       lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               txt_Select.setText("Vị trí "+position+ " : "+myphone[position]);
           }
       });
    }
}
