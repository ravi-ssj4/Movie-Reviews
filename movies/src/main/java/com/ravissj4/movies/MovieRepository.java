package com.ravissj4.movies;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{
    // creation of dynamic automatic queries - special feature provided by SpringBoot
    Optional<Movie> findMovieByImdbId(String imdbId);
}
