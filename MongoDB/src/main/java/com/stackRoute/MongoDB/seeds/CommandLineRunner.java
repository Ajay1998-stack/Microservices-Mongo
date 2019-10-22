package com.stackRoute.MongoDB.seeds;

import com.stackRoute.MongoDB.domain.Track;
import com.stackRoute.MongoDB.exceptions.TrackAlreadyExistsException;
import com.stackRoute.MongoDB.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {


    @Autowired
    //@Qualifier("trackServiceImpl")
    private TrackService trackService;
//    public CommandLineRunner()
    @Value("${track.trackName}")
    private String trackName;

    @Value("${track.comments}")
    private String comments;

    @Value("${track.id}")
    private int id;

    @Override
    public void run(String... args) throws Exception {
        Track track= new Track(id,trackName,comments);
        try{
        trackService.saveTrack(track);
        }
        catch (TrackAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
    }
}
