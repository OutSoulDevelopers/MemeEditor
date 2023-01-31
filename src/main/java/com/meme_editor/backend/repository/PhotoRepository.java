package com.meme_editor.backend.repository;


import java.util.List;

import com.meme_editor.backend.data.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "photo", path = "photo")
public interface PhotoRepository extends MongoRepository<Photo, String> {

}