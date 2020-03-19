package com.rodolfofigueroa.wallet.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator

import com.rodolfofigueroa.wallet.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        circularProgress.setProgressWithAnimation(50f, 1000, AccelerateDecelerateInterpolator(), 500)
        Picasso
            .get()
            .load("https://pbs.twimg.com/profile_images/625753908082642944/FlXPNd-9_400x400.jpg")
            .into(circleImageView)
    }




}
