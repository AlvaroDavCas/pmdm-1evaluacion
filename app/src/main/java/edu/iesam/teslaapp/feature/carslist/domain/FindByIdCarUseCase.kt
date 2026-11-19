package edu.iesam.teslaapp.feature.carslist.domain

class FindByIdCarUseCase(private val carRepository: CarRepository) {

    operator fun invoke(id: String): Car? {
        return carRepository.findById(id)
    }
}