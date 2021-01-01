package com.example.recyclerviewtutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NamesAdapter extends RecyclerView.Adapter<NamesAdapter.NamesHolder> {
    ArrayList<Model> list;
    Context context;

    public NamesAdapter(ArrayList<Model> list, Context context){
        this.list = list;
        this.context = context;
    }

    public class NamesHolder extends RecyclerView.ViewHolder{

        ImageView mImageView;
        TextView mName,mDescription;

        public NamesHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.name_imageView);
            mName = itemView.findViewById(R.id.name_textView);
            mDescription = itemView.findViewById(R.id.description_textView);
        }
    }

    @NonNull
    @Override
    public NamesAdapter.NamesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.names_list,parent,false);
        return new NamesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NamesAdapter.NamesHolder holder, int position) {
        Model model = list.get(position);
        holder.mImageView.setImageResource(model.getImage());
        holder.mName.setText(model.getName());
        holder.mDescription.setText(model.getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
