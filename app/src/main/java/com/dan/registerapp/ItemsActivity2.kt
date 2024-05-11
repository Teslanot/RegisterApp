package com.dan.registerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_items2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val itemsList:RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()


        items.add(Item(1, "sofa","Sofa","descr,descr,descr,descr,descr,descr,descr",",text,texttext,text,texttexttext,texttexttexttexttexttexttext",122))
        items.add(Item(2, "bed","Bed","descr,descr,descr,descr,descr,descr,descr",",text,texttext,text,texttexttext,texttexttexttexttexttexttext",122))
        items.add(Item(3, "chair","Chair","descr,descr,descr,descr,descr,descr,descr",",text,texttext,text,texttexttext,texttexttexttexttexttexttext",122))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items,this)
    }
}