package cn.baiyu.test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
@author baiyu
@data 2019-10-28 14:52
 */
@SpringBootApplication
class SpringBootKotlinIntegration

fun main(args: Array<String>) {
    runApplication<SpringBootKotlinIntegration>(*args)
}