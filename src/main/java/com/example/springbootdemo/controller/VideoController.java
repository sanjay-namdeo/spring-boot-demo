package com.example.springbootdemo.controller;

import com.example.springbootdemo.record.Video;
import com.example.springbootdemo.service.VideoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoController {
    private final VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping(path = "/get-videos")
    public ResponseEntity<List<Video>> getVideos() {
        return new ResponseEntity<>(videoService.getVideos(), HttpStatus.OK);
    }
}
