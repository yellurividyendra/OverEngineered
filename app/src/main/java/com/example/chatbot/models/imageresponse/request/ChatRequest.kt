package com.example.chatbot.models.imageresponse.request

data class ChatRequest(
    val max_tokens: Int,
    val model: String,
    val prompt: String,
    val temperature: Double
)