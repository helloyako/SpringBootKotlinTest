package com.linecorp.bank.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class TestApplication : SpringBootServletInitializer() {
    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder =
            application.sources(TestApplication::class.java)

}

fun main(args: Array<String>) {
    runApplication<TestApplication>(*args)
}