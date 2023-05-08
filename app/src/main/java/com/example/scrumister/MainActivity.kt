package com.example.scrumister

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data=ArrayList<DailyScrum>()
        val list1=ArrayList<String>()
        list1.add("Salman")
        list1.add("Ali")
        data.add(DailyScrum("Devops",list1,3,Color.GREEN))
        data.add(DailyScrum("Testing",list1,6,Color.YELLOW,))
        data.add(DailyScrum("Design",list1,3,Color.MAGENTA,))
        data.add(DailyScrum("Development",list1,3,Color.RED,))


        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView1)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter







    }
}