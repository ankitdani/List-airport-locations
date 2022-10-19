package com.project.spring_project;

import java.util.List;

public interface LocationService {
    public List<Location> retrieveLocations();
    public Location retrieveLocation(long id);
}
