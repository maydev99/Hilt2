package com.bombadu.hilt2

import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import org.junit.Assert.assertEquals
import org.junit.Test
import javax.inject.Inject

@HiltAndroidApp
@AndroidEntryPoint
class JobsTest  {

    @Inject var jobs: Jobs = Jobs()

    @Test
    fun testMultiplyByThree() {
        val result = jobs.multiplyByThree(3)
        assertEquals(9, result)
    }



}