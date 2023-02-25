package com.meme_editor.backend.repository;

import com.meme_editor.backend.data.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {

}