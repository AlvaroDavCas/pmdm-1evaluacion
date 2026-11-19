package edu.iesam.teslaapp.feature.carslist.data.remote

import edu.iesam.teslaapp.feature.carslist.domain.Car

class CarApiRemoteDataSource {


    fun getAll(): List<Car> {
        return listOf(
            Car("1"),
            Car("2"),
            Car("3"),
            Car("4"),
            Car("5"),
            Car("6"),
        )
    }

}