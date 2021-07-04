package tw.cody.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String [] language = {"C","C++","Java","python","Android","HTML",
                           "CSS","PHP","SQL","SWIFT","GITHUB","GIT"};
    String [] ld = {"C describe","C++ describe","Java describe","python describe","Android describe","HTML describe",
                    "CSS describe","PHP describe","SQL describe","SWIFT describe","GITHUB describe","GIT describe"};
    int [] image = {R.drawable.c,R.drawable.c1,R.drawable.java,R.drawable.python,R.drawable.android,R.drawable.html5,
                    R.drawable.css,R.drawable.php,R.drawable.sql,R.drawable.swift,R.drawable.github,R.drawable.git};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(this,language,ld,image);
        recyclerView.setAdapter(adapter);
    }
}