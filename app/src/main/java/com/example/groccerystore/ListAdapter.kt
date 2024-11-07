package com.example.groccerystore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter (context: Context, productList: MutableList<Product>):
    ArrayAdapter<Product>(context, R.layout.list_item, productList){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val product = getItem(position)
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent,false)
        }

        val imageViewTV = view?.findViewById<ImageView>(R.id.imageViewIV)
        val personNameTV = view?.findViewById<TextView>(R.id.productNameTV)
        val personAgeTV = view?.findViewById<TextView>(R.id.productPriceTV)
        val phoneTV = view?.findViewById<TextView>(R.id.productCodeTV)

        imageViewTV?.setImageBitmap(product?.image)
        personNameTV?.text = product?.name
        personAgeTV?.text = product?.price
        phoneTV?.text = product?.code

        return view!!
    }
}