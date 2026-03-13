package com.bibek.labmp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bibek.labmp.Model.Student;
import com.bibek.labmp.R;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    List<Student> list;

    public StudentAdapter(List<Student> list) {
        this.list = list;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt;

        public ViewHolder(View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.txtData);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lab14_item_student, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Student s = list.get(position);

        holder.txt.setText(
                "Roll: " + s.roll +
                        "\nName: " + s.name +
                        "\nBatch: " + s.batch +
                        "\nCourse: " + s.course
        );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}