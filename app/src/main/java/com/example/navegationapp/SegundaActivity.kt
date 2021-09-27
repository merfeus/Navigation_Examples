package com.example.navegationapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navegationapp.databinding.SegundaActivityBinding
import com.example.navegationapp.ui.main.SegundaFragment

class SegundaActivity : AppCompatActivity() {

    private lateinit var binding: SegundaActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segunda_activity)

        binding = SegundaActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setSupportActionBar(binding.appBarMain.toolbar)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SegundaFragment.newInstance())
                .commitNow()
        }

    }
}


