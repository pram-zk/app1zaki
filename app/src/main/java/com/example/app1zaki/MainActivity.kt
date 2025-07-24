package com.example.app1zaki

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app1zaki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnInstagram.setOnClickListener{
            val instagramIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/pram.zk/"))
            startActivity(instagramIntent)
        }

        binding.btnwa.setOnClickListener{
            val Nohp = "62895426693500"
            val waIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://$Nohp"))
            startActivity(waIntent)
        }

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}