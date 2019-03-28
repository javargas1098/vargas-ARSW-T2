package edu.eci.arsw.ArswParcial.service;


import java.io.IOException;

public interface WheatherServices {

    /**
     *
     * @param city Name of the city to consult
     * @return String, json with the city information.
     * @throws IOException if the name is not valid
     */
    public String  citywheather(String city) throws IOException;
}
