package com.meme_editor.backend.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Photo {
    @Id private String id;
    private final Date date;
    private final byte[] image;

    public Photo(Date date,byte[] image){
        this.date = date;
        this.image = image;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, Arrays.hashCode(image));
    }
    public Date get_date(){
        return this.date;
    }
    public byte[] get_image(){
        return this.image;
    }
    @Override
    public String toString() {
        return "Image{" +
                "id=" + this.id +
                ", date='" + this.date + '\'' +
                ", lastName='" + Arrays.toString(this.image) + '\'' +
                '}';
    }

}
