package com.ml.feelgood.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class InformationTests {

    lateinit var information : Information

    @BeforeEach
    fun setup() {
        information = Information("1132242112", "mail@mail.com")
    }

    @Test
    fun information_has_phone_and_email(){
        val expectedPhone = "1132242112"
        val expectedEmail = "mail@mail.com"
        assertEquals(expectedPhone, information.phone)
        assertEquals(expectedEmail, information.email)
    }

    @Test
    fun information_can_change_phone(){
        val expectedPhone = "112233"
        information.phone = expectedPhone
        assertEquals(expectedPhone, information.phone)
    }

    @Test
    fun information_can_change_email(){
        val expectedEmail = "newEmail@mail.com"
        information.email = expectedEmail;
        assertEquals(expectedEmail, information.email)
    }

    @Test
    fun information_can_add_instagram_to_social_networks(){
        val expectedSocialNetwork = "instagramAccount"
        information.addSocialNetwork(SocialNetwork.INSTAGRAM, expectedSocialNetwork)
        assertEquals(expectedSocialNetwork, information.getSocialNetwork(SocialNetwork.INSTAGRAM))
    }

    @Test
    fun information_can_add_instagram_and_twitter_social_networks(){
        val instagram = "instagramAccount"
        val twitter = "twitterAccount"
        information.addSocialNetwork(SocialNetwork.INSTAGRAM, instagram)
        information.addSocialNetwork(SocialNetwork.TWITTER, twitter)
        assertEquals(instagram, information.getSocialNetwork(SocialNetwork.INSTAGRAM))
        assertEquals(twitter, information.getSocialNetwork(SocialNetwork.TWITTER))
    }

    @Test
    fun information_can_change_instagram_to_social_networks(){
        val instagramFst = "instagramFst"
        val instagramSnd = "instagramSnd"
        information.addSocialNetwork(SocialNetwork.INSTAGRAM, instagramFst)
        information.addSocialNetwork(SocialNetwork.INSTAGRAM, instagramSnd)
        assertEquals(instagramSnd, information.getSocialNetwork(SocialNetwork.INSTAGRAM))
    }


}
