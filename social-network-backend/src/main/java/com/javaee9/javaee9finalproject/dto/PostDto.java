package com.javaee9.javaee9finalproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;

public record PostDto(
        Long id,
        @NotEmpty
        String header,
        String content,
        String author,
        @JsonProperty("creation_timestamp")
        String creationTimestamp,
        @JsonProperty("update_timestamp")
        String updateTimestamp) {
}
