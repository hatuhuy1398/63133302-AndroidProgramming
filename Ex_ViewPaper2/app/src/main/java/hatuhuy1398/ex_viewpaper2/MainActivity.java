package hatuhuy1398.ex_viewpaper2;

import android.os.Bundle;
import java.util.ArrayList;


import androidx.viewpager2.widget.ViewPager2;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager2;
    ArrayList<ViewPaperItem> viewPaperItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2= findViewById(R.id.viewpaper);
        int[] images = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e};
        String[] headings = {"Bake", "Grilled", " Dessert ", "Italian", "Shakes"};
        String[] desc = {
                getString(R.string.a_desc),
                getString(R.string.b_desc),
                getString(R.string.c_desc),
                getString(R.string.d_desc),
                getString(R.string.e_desc)
        };
        viewPaperItemArrayList = new ArrayList<>();
        for (int i = 0; i < images.length; ++i) {
            ViewPaperItem viewPaperItem = new ViewPaperItem(images[i], headings[i], desc[i]);
            viewPaperItemArrayList.add(viewPaperItem);
        }
        VPAdapter vpAdapter = new VPAdapter(viewPaperItemArrayList);
        viewPager2.setAdapter(vpAdapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

    }
}