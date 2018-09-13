package com.example.jiwen.arrayadaptertutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayList<User> userList;
    ArrayList<String> userNameList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.simpleListView);
        userList = FakeDatabase.getUserArrayList();
        userNameList = new ArrayList<>();

        for(int i = 0; i < userList.size(); i++){
            String name = userList.get(i).getName();
            userNameList.add(name);
        }


        //ArrayAdapter<User> arrayAdapter = new ArrayAdapter(this, R.layout.user_item, R.id.name, userList);
       // ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.user_item,R.id.name, userNameList);
        ArrayAdapter<User> arrayAdapter = new ArrayAdapter<>(this, R.layout.user_item,R.id.name, userList);
        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long rowId) {
               // String name = (String) adapterView.getItemAtPosition(position);

                //User u = FakeDatabase.getUserByName(name);
                User u = (User) adapterView.getItemAtPosition(position);
                String degree = u.getDegree();

                Toast.makeText(MainActivity.this, degree, Toast.LENGTH_LONG).show();
            }

        });
    }
}
