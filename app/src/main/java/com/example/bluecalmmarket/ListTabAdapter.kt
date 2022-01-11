package com.example.bluecalmmarket

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListTabAdapter(val listTab: ArrayList<Tablet>) : RecyclerView.Adapter<ListTabAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview) {
        var tvName: TextView = itemview.findViewById(R.id.product_name)
        var tvPrice: TextView = itemview.findViewById(R.id.price)
        var img: ImageView = itemview.findViewById(R.id.img_item_photo)
        var cart : Button = itemview.findViewById(R.id.btn_cart)
        var detail : Button = itemview.findViewById(R.id.btn_detail)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.hcard, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val tab = listTab[position]
        Glide.with(holder.itemView.context)
                .load(tab.img)
                .apply(RequestOptions().override(55, 55))
                .into(holder.img)
        holder.tvName.text = tab.name
        holder.tvPrice.text = tab.price
        holder.cart.setOnClickListener{
            Toast.makeText(holder.itemView.context,"${tab.name} has been added to cart", Toast.LENGTH_SHORT).show()
        }
        holder.detail.setOnClickListener {
            val detailintent = Intent(holder.itemView.context, DetailSpProductActivity::class.java)
            detailintent.putExtra(DetailSpProductActivity.extra_index, position.toString())
            detailintent.putExtra(DetailSpProductActivity.extra_name, "tab")
            holder.itemView.context.startActivity(detailintent)
        }
    }

    override fun getItemCount(): Int {
        return listTab.size
    }

}
