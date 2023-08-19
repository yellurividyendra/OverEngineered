package com.example.chatbot.models.imageresponse.request

data class MessageModel(
    var isUser : Boolean,
    var isImage : Boolean,
    var message : String
)
