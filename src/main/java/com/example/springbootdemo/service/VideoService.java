package com.example.springbootdemo.service;

import com.example.springbootdemo.record.Video;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {
    List<Video> videos = List.of(new Video("Introduction"), new Video("Interval"), new Video("End"));

    public List<Video> getVideos() {
        return videos;
    }

    public Video create(Video video) {
        List<Video> extend = new ArrayList<>(videos);
        extend.add(video);
        this.videos = List.copyOf(extend);
        return video;
    }
}
