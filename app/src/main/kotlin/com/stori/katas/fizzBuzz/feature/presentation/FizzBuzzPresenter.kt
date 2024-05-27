package com.stori.katas.fizzBuzz.feature.presentation

import com.stori.katas.fizzBuzz.feature.presentation.list.ListPresenter
import com.stori.katas.fizzBuzz.feature.presentation.main.MainPresenter
import com.stori.katas.fizzBuzz.feature.presentation.navigation.NavigationPresenter

interface FizzBuzzPresenter: ListPresenter, NavigationPresenter, MainPresenter
