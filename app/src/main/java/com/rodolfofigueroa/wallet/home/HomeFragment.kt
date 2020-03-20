package com.rodolfofigueroa.wallet.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.rodolfofigueroa.wallet.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    val favoriteTransferAdapter = FavoriteTransferAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        circularProgress.setProgressWithAnimation(50f, 1000, AccelerateDecelerateInterpolator(), 500)
        Picasso
            .get()
            .load("https://pbs.twimg.com/profile_images/625753908082642944/FlXPNd-9_400x400.jpg")
            .into(circleImageView)
    }

    fun initRecycler(){
        favoriteTransfersRecyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        favoriteTransfersRecyclerView.adapter = favoriteTransferAdapter

        val items = ArrayList<FavoriteTransfer>()
        items.add(
            FavoriteTransfer(
                1,
                "Freddy Vega",
                456.000,
                "Hace 2h",
                "https://media.licdn.com/dms/image/C4E03AQGlqpsnWjB6Yg/profile-displayphoto-shrink_200_200/0?e=1582761600&v=beta&t=dYj3_HcoKdR66KpEup0FPBTziu8xiF2I2snqJbf4DGM"
            )
        )
        items.add(
            FavoriteTransfer(
                1,
                "Nestor Villamil",
                210.900,
                "Ayer",
                "https://krausefx.com/assets/posts/profilePictures/FelixKrause2016.jpg"
            )
        )
        items.add(
            FavoriteTransfer(
                1,
                "Fernando Ávila",
                456.000,
                "Hace 2h",
                "https://www.oliverwyman.com/content/dam/oliver-wyman/v2/careers/profiles/scottbk-profile-460x460.jpg"
            )
        )
        items.add(
            FavoriteTransfer(
                1,
                "Cristian Villamil",
                456.000,
                "Hace 2h",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTw8mKnjVErhmhl5S_aUZfvf86vwZOMJBqbUqM-guT-kv6K4xu&s"
            )
        )
        items.add(
            FavoriteTransfer(
                1,
                "Cristian Villamil",
                456.000,
                "Hace 2h",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVSEHZQ2HJu9FEzFLU4yEAUv46sfRQjxUYkiVv7IEFxNndQ_7C&s"
            )
        )
        favoriteTransferAdapter.setData(items)
    }




}
