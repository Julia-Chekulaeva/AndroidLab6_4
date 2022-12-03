package com.example.task2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    var pictureUrl: String =
        "https://www.sunhome.ru/i/wallpapers/190/igri-dlya-koshek-na-kompyutere.xxl.jpg"

    lateinit var button: Button

    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        image = findViewById(R.id.imageView)
        button.setOnClickListener {
            Picasso.get()
                .load(pictureUrl)
                .into(image)
        }
    }
}
