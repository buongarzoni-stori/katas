package com.stori.katas.location

private const val ZIPCODE_LENGHT = 5
class DeliveryCompany(
    private val location: ILocation
) {
    fun execute(zipCode: String ): String {
        if (zipCode.length != ZIPCODE_LENGHT)
            return "INVALID LENGTH"

        val state = location.getStateByZipcode(zipCode)

        return if (state == "CDMX")
            "DHL"
        else ""

    }
}
