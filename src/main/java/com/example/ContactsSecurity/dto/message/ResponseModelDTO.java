package com.example.ContactsSecurity.dto.message;

import lombok.Data;

@Data
public class ResponseModelDTO<T> {
    private boolean requestOk;
    private T result;
}
