package com.artistasamerica.artistasamerica

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class ArtistasamericaApplication {

	@GetMapping
	fun helloWorld() = "Hola Cristhian"
}

fun main(args: Array<String>) {
	runApplication<ArtistasamericaApplication>(*args)
}
