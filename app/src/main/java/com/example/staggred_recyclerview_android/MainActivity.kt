package com.example.staggred_recyclerview_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.staggred_recyclerview_android.Adapter.AvengersAdapter
import com.example.staggred_recyclerview_android.Model.AvengersModel
import com.example.staggred_recyclerview_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: AvengersAdapter
    private var avengersList = ArrayList<AvengersModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rvAvengers.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        adapter = AvengersAdapter(this, avengersList)
        binding.rvAvengers.adapter = adapter
        avengersShow()

    }

    private fun avengersShow() {
        val avenger1 = AvengersModel("Avenger1", R.drawable.wallpaper1)
        avengersList.add(avenger1)

        val avenger2 = AvengersModel("Avenger2", R.drawable.wallpaper2)
        avengersList.add(avenger2)

        val avenger3 = AvengersModel("Avenger3", R.drawable.wallpaper3)
        avengersList.add(avenger3)

        val avenger4 = AvengersModel("Avenger4", R.drawable.wallpaper4)
        avengersList.add(avenger4)

        val avenger5 = AvengersModel("Avenger5", R.drawable.wallpaper5)
        avengersList.add(avenger5)

        val avenger6 = AvengersModel("Avenger6", R.drawable.wallpaper6)
        avengersList.add(avenger6)

        val avenger7 = AvengersModel("Avenger7", R.drawable.wallpaper7)
        avengersList.add(avenger7)

        val avenger8 = AvengersModel("Avenger8", R.drawable.wallpaper8)
        avengersList.add(avenger8)


    }
}