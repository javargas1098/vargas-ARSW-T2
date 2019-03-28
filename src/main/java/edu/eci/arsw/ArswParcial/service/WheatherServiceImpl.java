package edu.eci.arsw.ArswParcial.service;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.eci.arsw.ArswParcial.bean.Wheather;


/**
 * Service Implementation
 *
 */
@Service
public class WheatherServiceImpl implements WheatherServices {

    /**
     * Implementation for use by other Apis.
     */
    @Autowired
    @Qualifier("OpWeather")
    Wheather wheather;

    /**
     *
     * @param city Name of the city to consult
     * @throws IOException if the name is not valid
     */
	@Override
	public String citywheather(String city) throws IOException {
		// TODO Auto-generated method stub
		return wheather.Climate(city);
	}
}

