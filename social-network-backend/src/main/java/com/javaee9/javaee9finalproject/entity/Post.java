package com.javaee9.javaee9finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
     String header;
     String content;
     String author;
     ZonedDateTime creationTimestamp;
     ZonedDateTime updateTimestamp;
}
