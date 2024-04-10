package hatuhuy1398.usingrecycleview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandScape;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3
        recyclerViewDatas = getDatForaRecyclerView();
        //4
        recyclerViewLandScape = findViewById(R.id.recycleLand);
//        //5 vertical
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerViewLandScape.setLayoutManager(layoutManager);
        //5 horizontal
        RecyclerView.LayoutManager layoutLinearHorizontal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewLandScape.setLayoutManager(layoutLinearHorizontal);
        //5 grid
         RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 2);
        recyclerViewLandScape.setLayoutManager(layoutGrid);
        //6
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewDatas);
        //7
        recyclerViewLandScape.setAdapter(landScapeAdapter);

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