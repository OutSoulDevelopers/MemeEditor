package com.meme_editor.backend.controllers;

import com.meme_editor.backend.data.Photo;
import com.meme_editor.backend.services.PhotoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/photos")
@AllArgsConstructor
public class PhotoController {
    private final PhotoService photoService;

    @GetMapping
    public List<Photo> fetchAllPhotos() {
        return photoService.getAllPhotos();
    }
}
