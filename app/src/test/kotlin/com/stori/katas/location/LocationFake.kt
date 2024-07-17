package com.stori.katas.location

/**
 * Created by Alan Meana on 17/07/2024
 */
class LocationFake: ILocation {

    override fun getStateByZipcode(zipcode: String): String {
        return when (zipcode) {
            "11111" -> "CDMX"
            "22222" -> "JALISCO"
            "33333" -> "SINALOA"
            "44444" -> "YUCATAN"
            else -> "ERROR"
        }
    }
}

