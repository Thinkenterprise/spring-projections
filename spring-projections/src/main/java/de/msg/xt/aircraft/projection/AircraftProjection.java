package de.msg.xt.aircraft.projection;

import org.springframework.data.rest.core.config.Projection;

import de.msg.xt.aircraft.Aircraft;

@Projection(name="type", types = Aircraft.class)
public interface AircraftProjection {
	String getType();
}

