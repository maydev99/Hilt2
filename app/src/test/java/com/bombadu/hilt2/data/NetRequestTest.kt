package com.bombadu.hilt2.data

import android.provider.Settings.Global.getString
import com.bombadu.hilt2.R
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class NetRequestTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

}

