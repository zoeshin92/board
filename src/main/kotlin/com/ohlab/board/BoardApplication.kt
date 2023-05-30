package com.ohlab.board

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class BoardApplication

fun main(args: Array<String>) {
	runApplication<BoardApplication>(*args)
}
