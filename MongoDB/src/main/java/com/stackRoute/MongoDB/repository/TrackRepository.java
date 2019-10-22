package com.stackRoute.MongoDB.repository;

import com.stackRoute.MongoDB.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends MongoRepository<Track, Integer> {
    //@Query("SELECT t FROM Track t where t.trackName = ?1")
    List<Track> findByTrackName(String trackName);
}
