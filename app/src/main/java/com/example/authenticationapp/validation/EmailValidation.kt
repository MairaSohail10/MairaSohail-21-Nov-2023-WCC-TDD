package com.example.authenticationapp.validation

import java.util.regex.Pattern

/**
 * Object for validating email addresses using a regular expression pattern.
 */
object EmailValidation {

    // Regular expression pattern for validating email addresses
    private const val EMAIL_PATTERN =
        "(?i)^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"

    private val pattern = Pattern.compile(EMAIL_PATTERN)

    /**
     * Validates an email address.
     *
     * @param email The email address to be validated.
     * @return `true` if the email is valid, `false` otherwise.
     */
    operator fun invoke(email: String?): Boolean {
        // Check if the email is not null or blank, and matches the pattern
        return !email.isNullOrBlank() && pattern.matcher(email).matches()
    }
}