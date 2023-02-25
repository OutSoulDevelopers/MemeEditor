package com.meme_editor.backend.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class Photo {
    @Id
    private String id;
    private final LocalDate date;
    private final byte[] image;
}
