package edu.iesam.teslaapp.feature.carslist.domain

class SaveCarUseCase(private val carRepository: CarRepository) {

    operator fun invoke(car: List<Car>) {
        return carRepository.save(car)
    }
}