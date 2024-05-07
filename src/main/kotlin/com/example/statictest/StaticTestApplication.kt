package com.example.statictest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StaticTestApplication

fun main(args: Array<String>) {
    runApplication<StaticTestApplication>(*args)
}
