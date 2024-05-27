package com.stori.katas.fizzBuzz.feature.presentation

import androidx.lifecycle.ViewModel
import com.stori.katas.fizzBuzz.feature.presentation.list.ListPresenter
import com.stori.katas.fizzBuzz.feature.presentation.list.ListViewModel
import com.stori.katas.fizzBuzz.feature.presentation.main.MainPresenter
import com.stori.katas.fizzBuzz.feature.presentation.main.MainViewModel
import com.stori.katas.fizzBuzz.feature.presentation.navigation.NavigationImpl
import com.stori.katas.fizzBuzz.feature.presentation.navigation.NavigationPresenter

class FizzBuzzViewModel(
    navigationPresenter: NavigationPresenter = NavigationImpl(),
    mainPresenter: MainPresenter = MainViewModel(),
    listPresenter: ListPresenter = ListViewModel(),
) : FizzBuzzPresenter,
    NavigationPresenter by navigationPresenter,
    MainPresenter by mainPresenter,
    ListPresenter by listPresenter,
    ViewModel()
