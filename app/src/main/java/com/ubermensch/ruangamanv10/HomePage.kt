package com.ubermensch.ruangamanv10

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.card.MaterialCardView

class HomePage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val drawerLayout = view.findViewById<DrawerLayout>(R.id.drawer_layout)
        val btnHamburger = view.findViewById<ImageView>(R.id.btn_hamburger)
        val cardLapor = view.findViewById<MaterialCardView>(R.id.card_lapor_bully)
        val tvSeeAll = view.findViewById<TextView>(R.id.tv_see_all)

        btnHamburger.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        cardLapor.setOnClickListener {
            findNavController().navigate(R.id.nav_report)
        }

        tvSeeAll.setOnClickListener {
            findNavController().navigate(R.id.nav_education)
        }
    }
}
