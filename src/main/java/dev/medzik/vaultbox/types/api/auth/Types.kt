package dev.medzik.vaultbox.types.api.auth

class RegisterRequest {
    lateinit var email: String
    lateinit var password: String
    var passwordHint: String? = null

    lateinit var encryptionKey: String
}

class LoginRequest {
    lateinit var email: String
    lateinit var password: String
}