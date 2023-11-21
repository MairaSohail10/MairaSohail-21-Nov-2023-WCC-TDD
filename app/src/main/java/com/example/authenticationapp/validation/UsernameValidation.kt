package com.example.authenticationapp.validation

/**
 * Object for validating username using an expression pattern.
 */

object UsernameValidation {

    // Regular expression pattern for validating usernames
    private const val USERNAME_PATTERN = "^[a-zA-Z0-9_.]{5,15}$"

    // Compiled pattern for efficiency
    private val pattern = Regex(USERNAME_PATTERN)

    /**
     * Validates a username based on specific requirements.
     *
     * @param username The username to be validated.
     * @return `true` if the username is valid, `false` otherwise.
     */
    operator fun invoke(username: String?): Boolean {
        // Check if the username is not null or blank, and matches the pattern
        return !username.isNullOrBlank() && pattern.matches(username)
    }
}