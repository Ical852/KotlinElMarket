package com.example.bluecalmmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail_sp_product.*

class DetailSpProductActivity : AppCompatActivity() {
    companion object {
        const val extra_index = "extra index"
        const val extra_name = "extra name"
    }

    private var spdata : SpData = SpData()
    private var tabdata : TabData = TabData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sp_product)

        btn_back.setOnClickListener {
            finish()
        }

        btn_checkout.setOnClickListener {
            Toast.makeText(this, "Succeed Checkout The Product", Toast.LENGTH_SHORT).show()
        }

        btn_addcart.setOnClickListener {
            Toast.makeText(this,"Succeed Add Product to Cart", Toast.LENGTH_SHORT).show()
        }

        btn_wishlist.setOnClickListener {
            Toast.makeText(this, "Succeed Add Product to Wishlist", Toast.LENGTH_SHORT).show()
        }

        val getter = intent.getStringExtra(extra_index)
        val iname = intent.getStringExtra(extra_name)

        if (iname.equals("smartphone")) {
            val index = getter?.toInt()
            val name = index?.let { spdata.getName(it) }
            val price = index?.let { spdata.getPrice(it) }
            val description = index?.let { spdata.getDetail(it) }
            val img: Int? = index?.let { spdata.getImg(it) }

            img?.let { product_images.setImageResource(it) }
            detail_decription.setText(description)
            detail_price.setText(price)
            product_detail_name.setText(name)
        } else if (iname.equals("tab")) {
            val index = getter?.toInt()
            val name = index?.let { tabdata.getName(it) }
            val price = index?.let { tabdata.getPrice(it) }
            val description = index?.let { tabdata.getDetail(it) }
            val img: Int? = index?.let { tabdata.getImg(it) }

            img?.let { product_images.setImageResource(it) }
            detail_decription.setText(description)
            detail_price.setText(price)
            product_detail_name.setText(name)
        }

    }
}