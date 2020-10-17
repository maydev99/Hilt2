package com.bombadu.hilt2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bombadu.hilt2.data.NetRequest
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val url = "https://www.bombadu.com/uploads/1/3/2/0/132090565/iphones_orig.jpg"


    @Inject lateinit var jobs: Jobs
    @Inject lateinit var netRequest: NetRequest

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val myTextView = findViewById<TextView>(R.id.my_text_view)
        val myButton = findViewById<Button>(R.id.button)
        val webDataButton = findViewById<Button>(R.id.button2)
        val dataTextView = findViewById<TextView>(R.id.dataTextView)
        val key = getString(R.string.api_key)


        jobs.loadImageIntoImageView(url, imageView)
        jobs.placeTextIntoTextView("Michael", myTextView)

        webDataButton.setOnClickListener {
            netRequest.makeTheCall(key, dataTextView)
        }




        myButton.setOnClickListener {
            jobs.showAName(myTextView)
        }


        val multipliedNumber = jobs.multiplyByThree(3)
        println(multipliedNumber)
    }

}