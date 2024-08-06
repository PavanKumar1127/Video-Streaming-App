package com.stream.app.spring_stream_backend.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.stream.app.spring_stream_backend.entity.Video;

public interface VideoService {

    // save video
    Video saveVideo(Video video, MultipartFile file);
    

    // get video
    Video getVideoByTitle(String title);
    Video getVideoById(String videoId);
    List<Video> getAll();
    
    
    // edit video

    // delete video

}
