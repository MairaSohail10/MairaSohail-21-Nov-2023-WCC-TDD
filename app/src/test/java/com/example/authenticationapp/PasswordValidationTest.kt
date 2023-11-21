package com.example.authenticationapp

import com.example.authenticationapp.validation.PasswordValidation
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

/**
 * Tests for the PasswordValidation class.
 */
class PasswordValidationTest {

    /**
     * Valid password should return true.
     */
    @Test
    fun `valid password should return true`() {
        val validPassword = "Maira_123"
        assertTrue(PasswordValidation(validPassword))
    }

    /**
     * Password less than 8 characters should return false.
     */
    @Test
    fun `password less than 8 characters should return false`() {
        val shortPassword = "msb1"
        assertFalse(PasswordValidation(shortPassword))
    }

    /**
     * Password without a special character should return false.
     */
    @Test
    fun `password without special character should return false`() {
        val noSpecialCharPassword = "Maira1234"
        assertFalse(PasswordValidation(noSpecialCharPassword))
    }

    /**
     * Empty password should return false.
     */
    @Test
    fun `empty password should return false`() {
        val emptyPassword = ""
        assertFalse(PasswordValidation(emptyPassword))
    }

    /**
     * Null password should return false.
     */

    @Test
    fun `null password should return false`() {
        val nullPassword: String? = null
        assertFalse(PasswordValidation(nullPassword.toString()))
    }

}