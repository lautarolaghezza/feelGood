package com.ml.feelgood.model.store

import com.ml.feelgood.model.User

class Store(name: String, username: String, password: String) : User(name, username, password) {

    lateinit var services: MutableList<Service>
    lateinit var reviews: MutableList<Review>
    lateinit var works: MutableList<Work>
}
