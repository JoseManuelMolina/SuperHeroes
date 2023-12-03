package org.example.superheroes.data.model

data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<HeroeDb>,
    val total: Int
)