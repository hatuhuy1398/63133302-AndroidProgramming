package thi.hatuhuy63133302.Dethi2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SubAdapter extends ArrayAdapter<Subjects> {
    private Context mContext;
    private ArrayList<Subjects> mBooks;

    public SubAdapter(Context context, ArrayList<Subjects>  books) {
        super(context, 0, books);
        mContext = context;
        mBooks = books;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null) {
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item_book, parent, false);
        }

         Subjects currentBook = mBooks.get(position);

        TextView bookName = listItem.findViewById(R.id.textViewBookName);
        bookName.setText(currentBook.getBookName());

        TextView bookPage = listItem.findViewById(R.id.textViewPage);
        bookPage.setText(String.valueOf(currentBook.getPage()));


            @Override
            public void onClick(View v) {
                mBooks.remove(position);
                notifyDataSetChanged();
            }
        });

        return listItem;
    }
