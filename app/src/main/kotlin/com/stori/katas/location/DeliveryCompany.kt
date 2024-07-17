package com.stori.katas.location

private const val ZIPCODE_LENGTH = 5
class DeliveryCompany (
    private val location: ILocation
) {
    fun execute(zipCode: String ): String {
        if (zipCode.length != ZIPCODE_LENGTH)
            return "INVALID LENGTH"

        val state = location.getStateByZipcode(zipCode)
        return if (state == "CDMX") {
            "DHL"
        } else {
            "RED PACK"
        }
    }
}
