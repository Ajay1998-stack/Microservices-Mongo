//package com.stackRoute.MongoDB.seeds;
//
//import com.stackRoute.MongoDB.domain.Track;
//import com.stackRoute.MongoDB.exceptions.TrackAlreadyExistsException;
//import com.stackRoute.MongoDB.service.TrackService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
////    @Autowired
//    //@Qualifier("trackServiceImpl")
//    @Autowired
//    private TrackService trackService ;
//
////    @Autowired
////    public MyApplicationListener(@Lazy TrackService  trackService){
////        this.trackService=trackService;
////    }
//
//    @Override
//    public void onApplicationEvent(ApplicationEvent applicationEvent) {
//        Track track1 = new Track();
//
//        track1.setId(1);
//        track1.setComments("lite");
//        track1.setTrackName("hello hello");
//        try {
//            trackService.saveTrack(track1);
//        } catch (TrackAlreadyExistsException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
