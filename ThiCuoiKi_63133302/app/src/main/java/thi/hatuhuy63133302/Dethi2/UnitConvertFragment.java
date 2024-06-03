package thi.hatuhuy63133302.Dethi2;


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



public class UnitConvertFragment extends Fragment {

    EditText et_so1;
    EditText et_so2;
    EditText et_so3;
    EditText et_kqg;
    EditText et_kqm;
    EditText et_kqbit;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_unit_convert_fragment, container, false);

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
        et_so3 = view.findViewById(R.id.et_so3);

        et_kqg = view.findViewById(R.id.et_kqg);
        et_kqm = view.findViewById(R.id.et_kqm);
        et_kqbit = view.findViewById(R.id.et_kqbit);




        // Set up buttons
        view.findViewById(R.id.btn_tinh).setOnClickListener(this::ram);
        view.findViewById(R.id.btn_tinh).setOnClickListener(this::rag);
        view.findViewById(R.id.btn_tinh).setOnClickListener(this::rabit);


        return view;
    }

    public void ram(View v) {
        double so1 = Double.parseDouble(et_so1.getText().toString());
        double kq = so1 *1000;
        et_kqm.setText(String.valueOf(kq));
    }
    public void rag(View v) {
        double so2 = Double.parseDouble(et_so2.getText().toString());
        double kg = so2 *1000;
        et_kqg.setText(String.valueOf(et_kqg));
    }
    public void rabit(View v) {
        double so3 = Double.parseDouble(et_so3.getText().toString());
        double kg = so3 *1000;
        et_kqbit.setText(String.valueOf(et_kqbit));
    }


}