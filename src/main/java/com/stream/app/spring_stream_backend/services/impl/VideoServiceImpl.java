package com.stream.app.spring_stream_backend.services.impl;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.stream.app.spring_stream_backend.entity.Video;
import com.stream.app.spring_stream_backend.services.VideoService;

@Service
public class VideoServiceImpl implements VideoService {

    @Value("${file.video}")
    String DIR;

    @Override
    public Video saveVideo(Video video, MultipartFile file) {

        try {
            // Original file name
            String fileName = file.getOriginalFilename();
            String contentType = file.getContentType();
            InputStream stream = file.getInputStream();

            // create folder path
            String cleanFileName = StringUtils.cleanPath(fileName);
            String cleanFolder = StringUtils.cleanPath(DIR);
            Path path = Paths.get(cleanFolder, cleanFileName);
            System.out.println(path);
            // create folderpath with filename
    
            // copy file to folder
    
            // create video metadata
    
            // save metadata
    
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Video getVideoByTitle(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVideoByTitle'");
    }

    @Override
    public Video getVideoById(String videoId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVideoById'");
    }

    @Override
    public List<Video> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

}
