package com.javaee9.javaee9finalproject.converter;

import com.javaee9.javaee9finalproject.dto.PostDto;
import com.javaee9.javaee9finalproject.entity.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostConverterTest {

    @Autowired
    PostConverter postConverter;

    @Test
    void fromDtoToEntity() {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Time now is: " + now);
        ZonedDateTime creationTimestamp = ZonedDateTime.now();
        ZonedDateTime updatetimeStamp = ZonedDateTime.now();
        PostDto dto = new PostDto(1L, "my header",
                "content", "just me",
                creationTimestamp.toString(), updatetimeStamp.toString());
        Post entity = postConverter.fromDtoToEntity(dto);

        Assertions.assertEquals(dto.header(), entity.getHeader());
        Assertions.assertEquals(creationTimestamp, entity.getCreationTimestamp());
    }

    @Test
    void fromEntityToDto() {
    }
}