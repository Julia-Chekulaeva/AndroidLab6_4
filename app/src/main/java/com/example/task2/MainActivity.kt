package com.example.task2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var image: ImageView
    private val pictureUrl: String =
        "https://www.sunhome.ru/i/wallpapers/190/igri-dlya-koshek-na-kompyutere.xxl.jpg"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = MainActivityViewModel()
        button = findViewById(R.id.button)
        image = findViewById(R.id.imageView)
        button.setOnClickListener {
            viewModel.load(pictureUrl)
        }
        viewModel.bitmap.observe(this) {
            image.setImageBitmap(it)
        }
    }
}