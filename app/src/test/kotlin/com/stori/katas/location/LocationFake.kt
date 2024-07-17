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
/*
0 -> "CDMX"
1 -> "JALISCO"
2 -> "SINALOA"
3 -> "YUCATAN"
4 -> "NUEVO LEON"
5 -> "GUANAJUATO"
6 -> "QUERETARO"
7 -> "MICHOACAN"
8 -> "PUEBLA"
9 -> "OAXACA"
10 -> "VERACRUZ"
11 -> "TABASCO"
12 -> "CHIAPAS"
13 -> "TAMAULIPAS"
14 -> "COAHUILA"
15 -> "SONORA"
16 -> "CHIHUAHUA"
17 -> "DURANGO"
18 -> "ZACATECAS"
19 -> "SAN LUIS POTOSI"
20 -> "NAYARIT"
21 -> "COLIMA"
22 -> "AGUASCALIENTES"
23 -> "MORELOS"
24 -> "TLAXCALA"
25 -> "HIDALGO"
26 -> "QUINTANA ROO"
27 -> "CAMPECHE"
28 -> "BAJA CALIFORNIA"
29 -> "BAJA CALIFORNIA SUR"
30 -> "GUERRERO"
31 -> "MEXICO"
else -> "ERROR"

        */