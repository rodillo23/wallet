package com.rodolfofigueroa.wallet.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rodolfofigueroa.wallet.R

class FavoriteTransferAdapter : RecyclerView.Adapter<FavoriteTransferViewHolder>() {

    private lateinit var favoriteTransferItems : List<FavoriteTransfer>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteTransferViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.favorite_transfer_row, parent, false)
        return FavoriteTransferViewHolder(view)
    }

    override fun getItemCount(): Int {
        return favoriteTransferItems.size
    }

    override fun onBindViewHolder(holder: FavoriteTransferViewHolder, position: Int) {
        holder.bind(favoriteTransferItems[position])
    }

    fun setData(favoriteTransferItems : List<FavoriteTransfer>){
        this.favoriteTransferItems = favoriteTransferItems
        notifyDataSetChanged()
    }
}