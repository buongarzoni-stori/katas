package com.stori.katas.fizzBuzz.feature.domain

sealed interface View

data object MainView: View
data object ListView: View
