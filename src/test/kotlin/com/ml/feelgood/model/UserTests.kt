package com.ml.feelgood.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class UserTests {

    private lateinit var user : User

    @BeforeEach
    fun setUp() {
        user = User("User name", "username", "secret")
    }

    @Test
    fun user_has_name_username_and_password() {
        val expectedName = "User name"
        val expectedUsername = "username"
        val expectedPassword = "secret"
        assertEquals(expectedName, user.name)
        assertEquals(expectedUsername, user.username)
        assertEquals(expectedPassword, user.password)
    }

    @Test
    fun user_has_information() {
        val expectedInformation = Information("1132242112", "mail@mail.com")
        user.information = expectedInformation;
        assertEquals(expectedInformation, user.information)
    }

    @Test
    fun user_can_get_phone_email_and_social_networks(){
        val information = Information("123456", "mail@mail.com")
        val facebook = "facebookAccount"
        user.information = information
        user.addSocialNetwork(SocialNetwork.FACEBOOK, facebook)
        assertEquals(information.phone, user.getPhone())
        assertEquals(information.email, user.getEmail())
        assertEquals(facebook, user.getSocialNetwork(SocialNetwork.FACEBOOK))
    }

}
