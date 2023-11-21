package com.example.authenticationapp.validation


/**
 * Object for validating password.
 */
object PasswordValidation {
    /**
     * Validates a password based on specific criteria.
     *
     * @param password The password to be validated.
     * @return `true` if the password is valid, `false` otherwise.
     */
    operator fun invoke(password: String): Boolean
    {
        // Check if the password is not empty
        // Check if the password has at least 8 characters
        // Check if the password contains at least one character that is not an alphanumeric character
        return password.isNotEmpty()
                && password.length >= 8
                && password.contains(Regex("[^A-Za-z0-9]"))
    }
}