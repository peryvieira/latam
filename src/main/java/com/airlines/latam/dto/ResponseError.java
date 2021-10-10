package com.airlines.latam.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class ResponseError {

    @NotNull
    private LocalDateTime timestamp;

    @NotNull
    private String details;
}
