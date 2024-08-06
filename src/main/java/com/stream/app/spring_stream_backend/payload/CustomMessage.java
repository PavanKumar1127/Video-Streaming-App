package com.stream.app.spring_stream_backend.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class CustomMessage {

    private String message;
    private boolean success;

}
