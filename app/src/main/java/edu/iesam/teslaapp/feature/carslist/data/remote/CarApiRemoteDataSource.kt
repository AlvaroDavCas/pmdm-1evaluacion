package edu.iesam.teslaapp.feature.carslist.data.remote

import edu.iesam.teslaapp.feature.carslist.domain.Car

class CarApiRemoteDataSource {


    fun getAll(): List<Car> {
        return listOf(
            Car("1", "Opel", "Corsa", "1234MLÑ"),
            Car("2", "Toyota", "yaris", "45678FÑA"),
            Car("3", "Seat", "Ibiza", "55555LPS"),
            Car("4", "Dacia", "Sandero", "22222KLP"),
            Car("5", "Seat", "Leon", "11111GRO"),
            Car("6","Citroen", "c4", "44444HJO"),
        )
    }

}