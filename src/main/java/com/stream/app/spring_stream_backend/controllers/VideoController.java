package com.stream.app.spring_stream_backend.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.stream.app.spring_stream_backend.entity.Video;
import com.stream.app.spring_stream_backend.payload.CustomMessage;
import com.stream.app.spring_stream_backend.services.VideoService;

@RestController
@RequestMapping("/api/v1/videos")
public class VideoController {

    private VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    public ResponseEntity<CustomMessage> create(
            @RequestParam("file") MultipartFile file,
            @RequestParam("title") String title,
            @RequestParam("description") String description) {
        Video video = new Video();
        video.setDescription(description);
        video.setTitle(title);
        video.setVideoId(UUID.randomUUID().toString());
        videoService.saveVideo(video, file);

        return null;
    }
}
