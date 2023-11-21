package com.example.authenticationapp

import com.example.authenticationapp.validation.UsernameValidation
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

/**
 * Tests for the UsernameValidation object.
 */
class UsernameValidationTest {

    /**
     * Valid username should return true.
     */
    @Test
    fun `valid username should return true`() {
        val validUsername = "MairaSohail.10"
        assertTrue(UsernameValidation(validUsername))
    }

    /**
     * Another valid username should return true.
     */
    @Test
    fun `valid username with numbers`() {
        val validUsername = "maira123"
        assertTrue(UsernameValidation(validUsername))
    }

    /**
     * Invalid username with special characters should return false.
     */
    @Test
    fun `invalid username with special characters should return false`() {
        val invalidUsername = "Maira@123"
        assertFalse(UsernameValidation(invalidUsername))
    }

    /**
     * Too short username should return false.
     */
    @Test
    fun `too short username should return false`() {
        val shortUsername = "MSB"
        assertFalse(UsernameValidation(shortUsername))
    }

    /**
     * Too long username should return false.
     */
    @Test
    fun `too long username should return false`() {
        val longUsername = "MairaSohailButt12345678"
        assertFalse(UsernameValidation(longUsername))
    }

    /**
     * Empty username should return false.
     */
    @Test
    fun `empty username should return false`() {
        val emptyUsername = ""
        assertFalse(UsernameValidation(emptyUsername))
    }

    /**
     * Null username should return false.
     */
    @Test
    fun `null username should return false`() {
        val nullUsername: String? = null
        assertFalse(UsernameValidation(nullUsername))
    }
}