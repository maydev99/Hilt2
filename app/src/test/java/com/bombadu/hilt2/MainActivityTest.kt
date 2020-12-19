package com.bombadu.hilt2

import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert.*
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class MainActivityTestUnit{

    @Inject var jobs: Jobs = Jobs()

    @Test
    fun testMultiplyBtThreeUnit(){
        val results = jobs.multiplyByThree(3)
        assertEquals(9, results)
    }


}