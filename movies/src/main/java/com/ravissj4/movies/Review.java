package com.ravissj4.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "review")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Review {
    @Id
    private ObjectId id; // ids are auto-generated -> cannot pass id to create a Review object -> need to have a constructor that only takes body

    private String body;

    public Review(String body) {
        this.body = body;
    }
    
}
