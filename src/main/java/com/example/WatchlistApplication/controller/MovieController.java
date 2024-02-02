package com.example.WatchlistApplication.controller;

import com.example.WatchlistApplication.entity.Movie;
import com.example.WatchlistApplication.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MovieController {
    @Autowired
    DatabaseService databaseService;
    @GetMapping("/watchlistItemForm")
    public ModelAndView showWatchListForm()
    { String viewName="watchlistItemForm";
        Map<String,Object> model=new HashMap<>();
        model.put("watchlistItem",new Movie());
        return new ModelAndView(viewName,model);


    }
    @PostMapping("/watchlistItemForm")
    public ModelAndView submitWatchListForm(Movie movie)
    {
databaseService.create(movie);
    }


}

