package hatuhuy1398.viewpaper2recyclerviewadapter;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> viewPaperDatas;
    ViewPager2 viewPager2Land;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPaperDatas = getDatForaRecyclerView();
        viewPager2Land = findViewById(R.id.vp2Land);
        landScapeAdapter = new LandScapeAdapter(this, viewPaperDatas);
        viewPager2Land.setAdapter(landScapeAdapter);
        viewPager2Land.registerOnPageChangeCallback( new ViewPager2.OnPageChangeCallback(){
            @Override
            public void onPageSelected(int position){
                super.onPageSelected(position);

            }
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels){
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }
            @Override
            public void onPageScrollStateChanged(int state){
                super.onPageScrollStateChanged(state);
            }
        });
        }
    ArrayList<LandScape> getDatForaRecyclerView(){
        ArrayList<LandScape> lstData = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("rose", "Rose1");
        lstData.add(landScape1);
        lstData.add(new LandScape("rose1", "Rose2"));
        lstData.add(new LandScape("rose2", "Rose3"));
        lstData.add(new LandScape("rose3", "Rose4"));

        return lstData;
    }

}