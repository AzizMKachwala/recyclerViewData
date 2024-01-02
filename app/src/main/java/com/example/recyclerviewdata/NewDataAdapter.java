package com.example.recyclerviewdata;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewDataAdapter extends RecyclerView.Adapter<NewDataAdapter.DataViewHolder> {

    Context context;
    List<DataModel> dataModels;


    public NewDataAdapter(View.OnClickListener context, List<DataModel> dataModels) {
        this.context = (Context) context;
        this.dataModels = dataModels;
    }

    public NewDataAdapter(List<DataModel> dataModels) {
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_data, parent, false);
        return new DataViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, @SuppressLint("RecyclerView") int position) {
        DataModel student = dataModels.get(position);
        holder.nameTextView.setText(student.getName());
        holder.rollNoTextView.setText(student.getRollNo());

    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView rollNoTextView;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.editTextName);
            rollNoTextView = itemView.findViewById(R.id.editTextRollNo);
        }
    }
}
