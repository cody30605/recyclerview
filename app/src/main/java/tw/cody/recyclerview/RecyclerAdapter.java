package tw.cody.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context context;
    String [] language;
    String [] ld;
    int [] images;
    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title,message;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView1);
            title = itemView.findViewById(R.id.title1);
            message = itemView.findViewById(R.id.message1);
        }
    }

    public RecyclerAdapter (Context context, String [] language, String [] ld, int [] images) {
        this.context = context;
        this.language = language;
        this.ld = ld;
        this.images = images;
    }


    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.image,parent,false);
//        ViewHolder viewHolder = new ViewHolder(view);
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.image,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
//        return null;
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        holder.title.setText(language [position]);
        holder.message.setText(ld [position]);
        holder.imageView.setImageResource(images [position]);
    }

    @Override
    public int getItemCount() {
//        return 0;
        return language.length;
    }
}
