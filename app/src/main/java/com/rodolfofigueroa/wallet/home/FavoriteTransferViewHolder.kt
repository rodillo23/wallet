package com.rodolfofigueroa.wallet.home

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.rodolfofigueroa.wallet.R
import com.squareup.picasso.Picasso

import kotlinx.android.synthetic.main.favorite_transfer_row.view.*

class FavoriteTransferViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
    fun bind(item:FavoriteTransfer){
        val photoImageView = view.findViewById<ImageView>(R.id.profilePhotoImageView)
        view.nameTextView.text = item.name
        Picasso.get().load(item.photoUrl).into(photoImageView)
    }
}