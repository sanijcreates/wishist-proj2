package com.example.wishlist_proj2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val lists: List<Item>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var priceTextView: TextView = itemView.findViewById(R.id.price)
        var urlTextView: TextView = itemView.findViewById(R.id.url)
        var nameTextView: TextView = itemView.findViewById(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val listView = inflater.inflate(R.layout.item, parent, false)
        return ViewHolder(listView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val list = lists[position]

        holder.priceTextView.setText(list.price)
        holder.urlTextView.setText(list.url)
        holder.nameTextView.setText(list.name)

    }

    override fun getItemCount(): Int {
        return lists.size
    }

}