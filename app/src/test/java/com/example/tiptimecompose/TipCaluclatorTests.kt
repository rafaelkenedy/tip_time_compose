package com.example.tiptimecompose

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCaluclatorTests {
    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.00
        val tipPercent =  20.0
        val expectedTip = NumberFormat.getCurrencyInstance().format(2.0)

        val actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}