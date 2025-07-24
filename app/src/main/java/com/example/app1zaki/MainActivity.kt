package com.example.app1zaki

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Button
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app1zaki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnig = findViewById<Button>(R.id.btnInstagram)
        btnig.setOnClickListener {
            val instagramintent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/pram.zk/"))
            startActivity(instagramintent)
        }

        val btnwa = findViewById<Button>(R.id.btnwa)
        btnwa.setOnClickListener {
            val phone = "62895426693500"
            val waintent = Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/$phone"))
            startActivity(waintent)
        }


    }
}