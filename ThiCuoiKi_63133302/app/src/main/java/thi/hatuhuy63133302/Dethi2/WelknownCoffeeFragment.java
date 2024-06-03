package thi.hatuhuy63133302.Dethi2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.activity.EdgeToEdge;

import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;


public class WelknownCoffeeFragment extends Fragment {
    LandScapeAdapter adapter;
    ArrayList<LandScape> dataSource;
    RecyclerView rv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_welknown_coffee_fragment, container, false);

        // Enable edge-to-edge content
        EdgeToEdge.enable(getActivity());
        ViewCompat.setOnApplyWindowInsetsListener(view, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize data source
        dataSource = getLandScapeArrayList();
        rv = view.findViewById(R.id.rv_land);

        // Set layout manager
        RecyclerView.LayoutManager layoutManager4 = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        rv.setLayoutManager(layoutManager4);

        // Set adapter
        adapter = new LandScapeAdapter(getContext(), dataSource);
        rv.setAdapter(adapter);

        return view;
    }

    public ArrayList<LandScape> getLandScapeArrayList() {
        ArrayList<LandScape> arrayList = new ArrayList<>();
        arrayList.add(new LandScape("mucangchai", "Cafe Hoang Tuan","Nha Trang"));
        arrayList.add(new LandScape("caonguyendadongvan", "Cafe High","Khanh Hoa"));
        arrayList.add(new LandScape("thacbandoc", "Cafe c","Campuchia"));
        arrayList.add(new LandScape("tranan", "Coffee Tràng An","Nha Trang"));
        return arrayList;
    }
}