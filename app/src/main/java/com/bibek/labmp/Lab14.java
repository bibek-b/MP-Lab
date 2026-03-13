package com.bibek.labmp;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bibek.labmp.Adapter.StudentAdapter;
import com.bibek.labmp.Database.DBHelper;
import com.bibek.labmp.Model.Student;

import java.util.ArrayList;

public class Lab14 extends AppCompatActivity {

    EditText roll, name, batch, course;
    Button addBtn;
    RecyclerView recyclerView;

    DBHelper db;
    ArrayList<Student> list;
    StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab14);

        roll = findViewById(R.id.roll);
        name = findViewById(R.id.name);
        batch = findViewById(R.id.batch);
        course = findViewById(R.id.course);
        addBtn = findViewById(R.id.addBtn);
        recyclerView = findViewById(R.id.recyclerView);

        db = new DBHelper(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        addBtn.setOnClickListener(v -> {

            int r = Integer.parseInt(roll.getText().toString());
            String n = name.getText().toString();
            String b = batch.getText().toString();
            String c = course.getText().toString();

            db.insertData(r, n, b, c);

            loadData();
        });

        loadData();
    }

    private void loadData() {

        list = new ArrayList<>();

        Cursor cursor = db.getData();

        while (cursor.moveToNext()) {

            list.add(new Student(
                    cursor.getInt(0),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3)
            ));
        }

        adapter = new StudentAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}