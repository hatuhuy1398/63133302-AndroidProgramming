package hatuhuy1398.ex_viewpaper2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VPAdapter extends RecyclerView.Adapter<VPAdapter.VPViewHolder> {
    ArrayList<ViewPaperItem> viewPaperItemArrayList;

    public VPAdapter(ArrayList<ViewPaperItem> viewPaperItemArrayList) {
        this.viewPaperItemArrayList = viewPaperItemArrayList;
    }

    @NonNull
    @Override
    public VPViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewpaper_item, parent, false);
        return new VPViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VPViewHolder holder, int position) {
        ViewPaperItem viewPaperItem = viewPaperItemArrayList.get(position);
        holder.imageView.setImageResource(viewPaperItem.imageID);
        holder.tcHeading.setText(viewPaperItem.heading);
        holder.tvDesc.setText(viewPaperItem.description);
    }

    @Override
    public int getItemCount() {
        return viewPaperItemArrayList.size();
    }

    public class VPViewHolder extends RecyclerView.ViewHolder {

       ImageView imageView;
       TextView tcHeading, tvDesc;

        public VPViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ivimage);
            tcHeading = itemView.findViewById(R.id.tvHeading);
            tvDesc = itemView.findViewById(R.id.tvDesc);
        }
    }
}
