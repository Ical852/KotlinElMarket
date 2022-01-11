package com.example.bluecalmmarket

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListSpAdapter(val listSp: ArrayList<Smarthphone>) : RecyclerView.Adapter<ListSpAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview) {
        var tvName: TextView = itemview.findViewById(R.id.vproduct_name)
        var tvPrice: TextView = itemview.findViewById(R.id.vprice)
        var img: ImageView = itemview.findViewById(R.id.vimg_item_photo)
        var card: CardView = itemview.findViewById(R.id.vcard_view)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.vcard, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val sp = listSp[position]
        Glide.with(holder.itemView.context)
                .load(sp.img)
                .apply(RequestOptions().override(55, 55))
                .into(holder.img)
        holder.tvName.text = sp.name
        holder.tvPrice.text = sp.price
        holder.card.setOnClickListener {
            val detailintent = Intent(holder.itemView.context, DetailSpProductActivity::class.java)
            detailintent.putExtra(DetailSpProductActivity.extra_index, position.toString())
            detailintent.putExtra(DetailSpProductActivity.extra_name, "smartphone")
            holder.itemView.context.startActivity(detailintent)
        }
    }

    override fun getItemCount(): Int {
        return listSp.size
    }

}
