package com.bombadu.hilt2.data

import android.util.Log
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


class NetRequest @Inject constructor() {

    private val request = ServiceBuilder.buildService(TmdbEndpoints::class.java)


    fun makeTheCall(apiKey: String, textView: TextView) {

        val call = request.getMovies(apiKey)

        call.enqueue(object : Callback<PopularMovies> {
            override fun onResponse(call: Call<PopularMovies>, response: Response<PopularMovies>) {
                if (response.isSuccessful) {
                    val theData = response.body()!!.results.toString()
                    textView.text = theData
                    Log.d("DATA", theData)


                }
            }

            override fun onFailure(call: Call<PopularMovies>, t: Throwable) {
                //  Toast.makeText(this@MainActivity, "${t.message}", Toast.LENGTH_SHORT).show()
            }
        })


    }
}