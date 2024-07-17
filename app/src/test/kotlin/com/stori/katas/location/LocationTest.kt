package com.stori.katas.location

import org.junit.Before
import org.junit.Test

/**
 * Created by Alan Meana on 17/07/2024
 */
class LocationTest {

    private lateinit var locationMock: ILocation

    private lateinit var SUT:

    @Before
    fun setup() {
        locationMock = LocationFake()
    }

}
