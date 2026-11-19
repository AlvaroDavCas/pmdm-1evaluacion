package edu.iesam.teslaapp.feature.carslist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import edu.iesam.teslaapp.feature.carslist.domain.Car
import edu.iesam.teslaapp.feature.carslist.domain.FindByIdCarUseCase

class CarListViewModel(
    private val findByIdCarUseCase: FindByIdCarUseCase
) : ViewModel() {

    data class UiState(
        val isLoading: Boolean = false,
        val hasError: Boolean = false,
        val listCar: List<Car> = emptyList()
    )

    private val _uiState = MutableLiveData<UiState>()
    val uiState = _uiState.value



    companion object {

        fun factory(
            findByIdCarUseCase: FindByIdCarUseCase
        ) = viewModelFactory {
            initializer { CarListViewModel(findByIdCarUseCase) }
        }
    }
}