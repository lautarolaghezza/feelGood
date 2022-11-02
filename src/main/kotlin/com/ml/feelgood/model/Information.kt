package com.ml.feelgood.model

class Information(var phone: String, var email: String) {

    private var socialNetworks : MutableMap<String,String> = mutableMapOf()

    private lateinit var location : Location

    fun addSocialNetwork(socialNetwork: SocialNetwork, account: String) {
        socialNetworks[socialNetwork.name] = account
    }

    fun getSocialNetwork(socialNetwork: SocialNetwork): String? {
        return socialNetworks[socialNetwork.name]
    }

}
