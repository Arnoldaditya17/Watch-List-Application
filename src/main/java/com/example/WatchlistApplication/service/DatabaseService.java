package com.example.WatchlistApplication.service;

import com.example.WatchlistApplication.entity.Movie;
import com.example.WatchlistApplication.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {
    @Autowired
    MovieRepo movieRepo;
    public  void create(Movie movie)
    {
        movieRepo.save(movie);
    }

}
