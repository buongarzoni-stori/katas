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
        SUT = DeliveryCompany(locationMock)
    }

    @Test
    fun `delivery company with zipcode length different to 5 returns error`() {
        val zipCode = "" // Arrange

        val result = SUT.execute(zipCode) // Act

        assertEquals("INVALID LENGTH", result) // Assert
    }

    @Test
    fun `delivery company with zipcode from CDMX returns DHL`() {
        val cdmxZipCode = "11111" // Arrange

        val result = SUT.execute(cdmxZipCode) // Act

        assertEquals("DHL", result) // Assert
    }

    @Test
    fun `delivery company with zipcode from JALISCO returns RED PACK`() {
        val jaliscoZipCode = "22222" // Arrange

        val result = SUT.execute(jaliscoZipCode) // Act

        assertEquals("RED PACK", result) // Assert
    }

    @Test
    fun `delivery company with zipcode from COLIMA returns NO DELIVERY`() {
        val colimaZipCode = "55555" // Arrange

        val result = SUT.execute(colimaZipCode) // Act

        assertEquals("NO DELIVERY", result) // Assert
    }
}
