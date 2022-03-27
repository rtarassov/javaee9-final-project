package com.javaee9.javaee9finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;

     String header;
     String content;
     String author;
     ZonedDateTime creationTimestamp;
     ZonedDateTime updateTimestamp;

     @PrePersist
     private void setInitialTimestamp() {
          ZonedDateTime timeStamp = ZonedDateTime.now();
          creationTimestamp = timeStamp;
          updateTimestamp = timeStamp;
     }

     @PreUpdate
     private void setUpdateTimestamp() {
          updateTimestamp = ZonedDateTime.now();
     }
}
