package com.example.authenticationapp

import com.example.authenticationapp.validation.EmailValidation
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test


/**
 * Tests for the EmailValidation object.
 */
class EmailValidationTest {

    /**
     * Valid email should return true.
     */
    @Test
    fun `valid email should return true`() {
        val validEmail = "maira@gmail.com"
        assertTrue(EmailValidation(validEmail))
    }

    /**
     * Another valid email should return true.
     */
    @Test
    fun `valid email`() {
        val validEmail = "maira123@gmail.com"
        assertTrue(EmailValidation(validEmail))
    }

    /**
     * Invalid email should return false.
     */
    @Test
    fun `invalid email should return false`() {
        val invalidEmail = "maira@"
        assertFalse(EmailValidation(invalidEmail))
    }

    /**
     * Empty email should return false.
     */
    @Test
    fun `empty email should return false`() {
        val emptyEmail = ""
        assertFalse(EmailValidation(emptyEmail))
    }

    /**
     * Null email should return false.
     */
    @Test
    fun `null email should return false`() {
        val nullEmail: String? = null
        assertFalse(EmailValidation(nullEmail))
    }
}