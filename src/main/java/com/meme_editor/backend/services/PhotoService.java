package com.meme_editor.backend.services;

import com.meme_editor.backend.data.Photo;
import com.meme_editor.backend.repository.PhotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PhotoService {
    private final PhotoRepository photoRepository;
    public List<Photo> getAllPhotos() {
        return photoRepository.findAll();
    }
}
