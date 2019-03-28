package edu.eci.arsw.ArswParcial.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.ArswParcial.service.WheatherServices;


/**
 * ApiRest que permite acceder a un conjunto de datos por medio del protocolo
 * http, usando los verbos del mismo.
 *
 */
@RestController
@RequestMapping("/wheather")
public class WheatherApiController {

    @Autowired
    private WheatherServices ws;

    @RequestMapping(method = RequestMethod.GET, path = "/{city}")
    public ResponseEntity<?> getAcciones(@PathVariable("city") String city) {
        try {
            return new ResponseEntity<>(ws.citywheather(city), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error when obtaining the state of the climate of: " + city, HttpStatus.NOT_FOUND);
        }
    }
}

