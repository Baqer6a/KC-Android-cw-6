package com.example.cw6a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> studentsArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Student student1 = new Student("عبدالمحسن",  16,  11, R.drawable.ic_launcher_foreground);
        Student student2 = new Student("محمد",  40,  11, R.drawable.ic_launcher_foreground);
        Student student3 = new Student("مصطفى",  80,  12, R.drawable.ic_launcher_foreground);
        Student student4 = new Student("حسين",  51,  12, R.drawable.ic_launcher_foreground);

        studentsArrayList.add(student1);
        studentsArrayList.add(student2);
        studentsArrayList.add(student3);
        studentsArrayList.add(student4);

    }
}