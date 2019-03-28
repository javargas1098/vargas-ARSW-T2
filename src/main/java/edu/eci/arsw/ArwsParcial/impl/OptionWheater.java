package edu.eci.arsw.ArwsParcial.impl;

import edu.eci.arsw.ArswParcial.bean.Wheather;
import edu.eci.arsw.ArwsParcial.model.*;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service("OpWeather")
public class OptionWheater implements Wheather {

	/**
	 * Cache implementation
	 */
	private ConcurrentHashMap<String, String> cachetime = new ConcurrentHashMap<String, String>();
	int min = 0;
	Date date = new Date();
	

	/**
	 * @param city Name of the city to consult.
	 * @throws IOException if the name is not valid.
	 */

	@Override
	public String Climate(String city) throws IOException {
		// TODO Auto-generated method stub
		String urlData;
		int time = date.getMinutes() - min;
		if (cachetime.containsKey(city) && time > 5) {
			urlData = HttpConnection.getUrlData("http://api.openweathermap.org/data/2.5/weather?q=" + city
					+ "&APPID=3a37ec60fabb53d8c05f7bbcf1d6d415");
			cachetime.put(city, urlData);
			min = date.getMinutes();
		} else {
			urlData = cachetime.get(city);
		}
		return urlData;
	}

}
