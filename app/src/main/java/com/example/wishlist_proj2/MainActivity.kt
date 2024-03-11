package com.example.wishlist_proj2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var lists: MutableList<Item>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rvLists =  findViewById<RecyclerView>(R.id.wishlistRv)
        
        lists = mutableListOf()

        val adapter = ListAdapter(lists)

        rvLists.adapter = adapter
        rvLists.layoutManager = LinearLayoutManager(this)
        
        var submit = findViewById<Button>(R.id.button)
        var name = findViewById<EditText>(R.id.nameEdit)
        var price = findViewById<EditText>(R.id.priceEdit)
        var url = findViewById<EditText>(R.id.urlEdit)

        submit.setOnClickListener{
             lists.add(Item(name.text.toString(), price.text.toString(),url.text.toString()))
        }



    }
}