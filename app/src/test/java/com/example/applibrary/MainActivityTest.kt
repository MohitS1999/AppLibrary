package com.example.applibrary

import android.content.Context
import org.junit.Assert.*
import org.junit.Test

import androidx.test.core.app.ApplicationProvider.getApplicationContext
import com.example.doublefloatarray.GetDouble

class MainActivityTest{
    private val context: Context = getApplicationContext()
    val inputArray = floatArrayOf(1.0f, 2.0f, 3.0f)

    @Test
    fun `simpleNativeLib should return expected output`() {
        // Arrange
        val expectedOutput = floatArrayOf(2.0f, 3.0f, 4.0f)

        // Act
        val actualOutput = GetDouble.simpleNativeLib(context, inputArray)

        // Assert
        assertArrayEquals(expectedOutput, actualOutput, 0.001f)
    }
}