package org.example.superheroes.data.superheroemodel

import java.io.Serializable

data class SuperHeroe(
    val superheroe: String,
    val publisher: String,
    val origen: String,
    val realName: String,
    val photo: String,
    val tb: String
): Serializable