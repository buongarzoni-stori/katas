package com.stori.katas.location

import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals

/**
 * Created by Alan Meana on 17/07/2024
 */
class LocationTest {

    private lateinit var locationMock: ILocation

    private lateinit var SUT: DeliveryCompany

    @Before
    fun setup() {
        locationMock = LocationFake()
        SUT = DeliveryCompany()
    }

    @Test
    fun `delivery company with zipcode length different to 5 returns error`() {
        val zipCode = "" // Arrange

        val result = SUT.execute(zipCode)// Act

        assertEquals("ERROR", result)// Assert
    }
}