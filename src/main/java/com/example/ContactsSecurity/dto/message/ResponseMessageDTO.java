package com.example.ContactsSecurity.dto.message;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ResponseMessageDTO {
    private int messageId;
    private TransferUserDto from;
    private TransferUserDto to;
    private LocalDateTime date;
    private String text;
    private int replyTo;
}
