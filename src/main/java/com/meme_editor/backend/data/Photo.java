package com.meme_editor.backend.data;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
public class Photo {
    @Id
    private String id;
    private final LocalDate date;
    private final byte[] image;
}
