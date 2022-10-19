package com.project.spring_project;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.config.RepositoryNameSpaceHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@ApiResponses(value = {
        @ApiResponse(code=400, message = "bad request. check doc."),
        @ApiResponse(code=401, message = "access denied"),
        @ApiResponse(code=500, message = "server down, check if microservice is running.")
})
public class LocationController {
    private LocationService locationService;

    @Autowired
    public void setLocationService(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/location")
    public ResponseEntity<List<Location>> getAllLocations() {
        List<Location> list = locationService.retrieveLocations();
        return new ResponseEntity<List<Location>>(list, HttpStatus.OK);
    }

    @GetMapping("/location/{id}")
    public ResponseEntity<Location> getLocation(@PathVariable("id") long id) {
        return new ResponseEntity<Location>(locationService.retrieveLocation(id), HttpStatus.OK);
    }

}
