package thi.hatuhuy63133302.Dethi2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemHolder>{
    Context context;
    ArrayList<LandScape> dataSource;
    public LandScapeAdapter(Context context,ArrayList<LandScape> dataSource) {
        this.context = context;
        this.dataSource = dataSource;
    }
    class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvNameLand;
        TextView tvAddLand;
        ImageView ivLand;
        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            tvNameLand = itemView.findViewById(R.id.tv_name_land);
            tvAddLand = itemView.findViewById(R.id.tv_address_land);
            ivLand = itemView.findViewById(R.id.iv_land);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Lấy phần tử được click
            int positionClicked = getAdapterPosition();
            LandScape itemClicked = dataSource.get(positionClicked);
            // Bóc thông tin
            String name = itemClicked.getLandName();
            String img = itemClicked.getLandImg();
            String address = itemClicked.getLandAdd();
            Toast.makeText(context, name, Toast.LENGTH_SHORT).show();

        }
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_land, parent, false);
        return new ItemHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        // Lấy đối tượng hiển thị
        LandScape landScape = dataSource.get(position);
        // Trích thông tin
        String name = landScape.getLandName();
        String img = landScape.getLandImg();
        String address = landScape.getLandAdd();
        // Đặt dữ liệu
        holder.tvNameLand.setText(name);
        holder.tvAddLand.setText(address);
        // Đặt ảnh
        String packageName = holder.itemView.getContext().getPackageName();
        String packageAdd = holder.itemView.getContext().getPackageName();
        int imgId = holder.itemView.getResources().getIdentifier(img,"mipmap",packageName);
        holder.ivLand.setImageResource(imgId);
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }
}

