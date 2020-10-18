package com.bombadu.hilt2

import android.os.SystemClock
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import dagger.hilt.android.testing.HiltAndroidTest
import org.hamcrest.CoreMatchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
@HiltAndroidTest

class MainActivityTest {

    /*@get:Rule
    var hiltRule = HiltAndroidRule(this)*/

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkIfMainActivityIsPresent() {
        onView(withId(R.id.main_activity)).check(matches(isDisplayed()))
    }

    @Test
    fun isNameButtonVisible() {
        onView(withId(R.id.button)).check(matches(isDisplayed()))
    }

    @Test
    fun isTextViewVisible() {
        onView(withId(R.id.my_text_view)).check(matches(isDisplayed()))
    }

    @Test
    fun isTextMichael() {
        onView(withId(R.id.my_text_view)).check(matches(withText("Michael")))
    }

    @Test
    fun isDataDisplayed(){
        onView(withId(R.id.button2)).perform(click())
        SystemClock.sleep(1000)
        onView(withId(R.id.dataTextView)).check(matches(not(withText(""))))
    }

}