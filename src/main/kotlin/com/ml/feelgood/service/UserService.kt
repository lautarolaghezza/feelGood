package com.ml.feelgood.service

import com.ml.feelgood.exception.UserNotFoundException
import com.ml.feelgood.model.User
import com.ml.feelgood.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    private lateinit var userRepository : UserRepository

    fun get(id: String) : User {
        return userRepository.findById(id).orElseThrow{UserNotFoundException("User with id: $id not found")}

    }

    fun create(user: User): User? {
        return userRepository.save(user)
    }
}
