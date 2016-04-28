package controller;

import domain.facade.VideoBeheer;
import domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by filip on 28/04/2016.
 */
@RestController
@RequestMapping("/videos")
public class VideoBeheerRestController {

    @Autowired
    VideoBeheer vdb;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addSpecialty(@RequestBody Movie movie){
        vdb.addMovie(movie);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Movie> getMovies(){
        return vdb.getAllMovies();
    }


}
