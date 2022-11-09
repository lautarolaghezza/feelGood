package com.ml.feelgood.controller

import com.ml.feelgood.model.User
import com.ml.feelgood.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @PostMapping("/create")
    fun create(@RequestBody user:User) : ResponseEntity<User>{
        return ResponseEntity.ok(userService.create(user))
    }

    @GetMapping("/getUser/{id}")
    fun get(@PathVariable("id") id: String) : ResponseEntity<User>{
        return ResponseEntity.ok(userService.get(id))
    }

}
