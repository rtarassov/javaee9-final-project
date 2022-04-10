package com.javaee9.javaee9finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
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
     @NotEmpty
     @Size(min = 3, message = "You're post is too short:)")
     String content;

     @Size(min = 3, message = "Author name is too short:)")
     @NotEmpty
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
