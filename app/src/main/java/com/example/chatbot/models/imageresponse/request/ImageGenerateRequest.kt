package com.example.chatbot.models.imageresponse.request

data class ImageGenerateRequest(
    val n: Int,
    val prompt: String,
    val size: String
)