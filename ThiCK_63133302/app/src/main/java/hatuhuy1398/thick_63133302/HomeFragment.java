package hatuhuy1398.thick_63133302;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.fragment.app.Fragment;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    String userName;
    String password;
    int attempts = 0;
    EditText etUserName;
    EditText etPassword;
    TextView tvAttempts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);

        // Enable edge-to-edge content
        EdgeToEdge.enable(getActivity());
        ViewCompat.setOnApplyWindowInsetsListener(view, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        timDieuKhien(view);
        return view;
    }

    public void timDieuKhien(View view) {
        etUserName = view.findViewById(R.id.et_user_name);
        etPassword = view.findViewById(R.id.et_password);
        tvAttempts = view.findViewById(R.id.tv_attempts);
    }

    public void dangNhap(View v) {
        userName = etUserName.getText().toString();
        password = etPassword.getText().toString();
        attempts++;
        tvAttempts.setText("Attempts: " + attempts);
        if (userName.equals("hatuhuy") && password.equals("10diemnhethay")) {
            Toast.makeText(getActivity(), "User and Password is correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "User and Password is wrong", Toast.LENGTH_SHORT).show();
        }
    }
}



//import androidx.fragment.app.Fragment;
//
//        import android.content.DialogInterface;
//        import android.database.Cursor;
//        import android.database.sqlite.SQLiteDatabase;
//        import android.os.Bundle;
//        import android.view.View;
//        import android.widget.AdapterView;
//        import android.widget.ArrayAdapter;
//        import android.content.Context;
//        import android.view.LayoutInflater;
//        import android.view.ViewGroup;
//        import android.widget.ListView;
//
//        import java.util.ArrayList;
//
//public class HomeFragment extends Fragment {
//    ListView lv;
//    ArrayList<Book> books;
//    BookAdapter adapter;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.home_fragment, container, false);
//
//        lv = view.findViewById(R.id.lv);
//        books = new ArrayList<>();
//
//        SQLiteDatabase db = getActivity().openOrCreateDatabase("DBSach.db", Context.MODE_PRIVATE, null);
//        String sqlTaoBang = "CREATE TABLE IF NOT EXISTS Books( BookID integer PRIMARY KEY, " +
//                "BookName text, " +
//                "Page integer, " +
//                "Price Float, " +
//                "Description text);";
//        db.execSQL(sqlTaoBang);
//        insertSampleData(db);
//
//        retrieveData(db);
//
//        adapter = new BookAdapter(getActivity(), books);
//        lv.setAdapter(adapter);
//
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
//                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        switch (which) {
//                            case DialogInterface.BUTTON_POSITIVE:
//                                deleteBook(position, db);
//                                break;
//                            case DialogInterface.BUTTON_NEGATIVE:
//                                break;
//                        }
//                    }
//                };
//
//                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
//                builder.setMessage("Are you sure you want to delete this book?")
//                        .setPositiveButton("Yes", dialogClickListener)
//                        .setNegativeButton("No", dialogClickListener)
//                        .show();
//            }
//        });
//
//        return view;
//    }
//
//    private void insertSampleData(SQLiteDatabase db) {
//        db.execSQL("INSERT INTO Books VALUES(5, 'Android', 100, 20000, 'Sách học lập trình Android')");
//        db.execSQL("INSERT INTO Books VALUES(6, 'iOS', 200, 30000, 'Sách học lập trình iOS')");
//        db.execSQL("INSERT INTO Books VALUES(7, 'PHP', 300, 40000, 'Sách học lập trình PHP')");
//    }
//
//    private void retrieveData(SQLiteDatabase db) {
//        String sqlSelect = "SELECT * FROM Books";
//        Cursor cursor = db.rawQuery(sqlSelect, null);
//        while (cursor.moveToNext()) {
//            int bookID = cursor.getInt(0);
//            String bookName = cursor.getString(1);
//            int page = cursor.getInt(2);
//            float price = cursor.getFloat(3);
//            String description = cursor.getString(4);
//            Book book = new Book(bookID, bookName, page, price, description);
//            books.add(book);
//        }
//        cursor.close();
//    }
//
//    private void deleteBook(int position, SQLiteDatabase db) {
//        Book book = books.get(position);
//        db.delete("Books", "BookID=?", new String[]{String.valueOf(book.getBookID())});
//        books.remove(position);
//        adapter.notifyDataSetChanged();
//    }
//}
//
