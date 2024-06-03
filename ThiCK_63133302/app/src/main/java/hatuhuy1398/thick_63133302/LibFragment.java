package hatuhuy1398.thick_63133302;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;

import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;



public class LibFragment extends Fragment {

    EditText et_so1;
    EditText et_so2;
    EditText et_kq;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lib_fragment, container, false);

        // Enable edge-to-edge content
        EdgeToEdge.enable(getActivity());
        ViewCompat.setOnApplyWindowInsetsListener(view, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize the controls
        et_so1 = view.findViewById(R.id.et_so1);
        et_so2 = view.findViewById(R.id.et_so2);
        et_kq = view.findViewById(R.id.et_kq);


        // Set up buttons
        view.findViewById(R.id.btn_cong).setOnClickListener(this::cong);


        return view;
    }

    public void cong(View v) {
        double so1 = Double.parseDouble(et_so1.getText().toString());
        double so2 = Double.parseDouble(et_so2.getText().toString());
        double kq = so1 * so2;
        et_kq.setText(String.valueOf(kq));
    }

}
