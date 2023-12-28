package br.edu.ies.tccauthenticator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TccAuthenticatorApplication

fun main(args: Array<String>) {
	runApplication<TccAuthenticatorApplication>(*args)
}
