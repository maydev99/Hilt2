package com.bombadu.hilt2

import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import javax.inject.Inject

class Jobs @Inject constructor() {

    fun multiplyByThree(num: Int) : Int {
        return num * 3
    }

    fun loadImageIntoImageView(url : String, imageView: ImageView){
        Picasso.get().load(url).into(imageView)

    }

    fun placeTextIntoTextView(text: String, textView: TextView) {
        textView.text = text
    }

    fun showAName(textView: TextView) {
        val myList = listOf("Michael", "Steve", "Mary", "Cate", "Gwen", "Carla", "Charlie")
        textView.text = myList.random()

    }
}