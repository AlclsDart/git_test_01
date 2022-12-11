package com.codingpark.test01

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import java.util.*

@Controller
class TestController {

    @GetMapping(value = ["/health", "/"])
    fun healthCheck2(): ResponseEntity<*> {
        return ResponseEntity("Hello! 장호! : " + Date().toString(), HttpStatus.OK)
    }
}