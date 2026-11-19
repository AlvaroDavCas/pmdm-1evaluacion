package edu.iesam.teslaapp.feature.carslist.domain

interface CarRepository {
    fun save(car: List<Car>)
    fun findAll(): List<Car>
    fun findById(id: String): Car?
}