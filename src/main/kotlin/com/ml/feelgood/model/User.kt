package com.ml.feelgood.model

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Getter
@Setter
@NoArgsConstructor
open class User(val name: String, val username: String, val password: String) {


    lateinit var id : String
    lateinit var information: Information
    lateinit var calendar: Calendar

    fun getPhone(): String {
        return information.phone
    }

    fun getEmail(): String {
        return information.email
    }

    fun getSocialNetwork(socialNetwork: SocialNetwork): String? {
        return information.getSocialNetwork(socialNetwork)
    }

    fun addSocialNetwork(socialNetwork: SocialNetwork, account: String){
        information.addSocialNetwork(socialNetwork, account)
    }

}
