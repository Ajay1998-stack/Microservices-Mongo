package com.stackRoute.MongoDB.service;

import com.stackRoute.MongoDB.domain.Track;
import com.stackRoute.MongoDB.exceptions.TrackAlreadyExistsException;
import com.stackRoute.MongoDB.exceptions.TrackNotFoundException;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface TrackService {
    public Track saveTrack(Track track) throws TrackAlreadyExistsException;

    public List getAllTracks();

    public Track updateTrack(int id,Track track);

    public List updatedTracks(Track track,int id);

    public List<Track> findByTrackName(String trackName) throws TrackNotFoundException;
}
