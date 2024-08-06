package com.stream.app.spring_stream_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stream.app.spring_stream_backend.entity.Video;

import java.util.Optional;

@Repository
public interface VideoRepository extends JpaRepository<Video,String>
{
    Optional<Video> findByTitle(String title);

    //query methods

    //native

    //criteria api

}