package lt.trains.project.service;

import java.util.List;

import lt.trains.project.model.Trains;


public interface TrainsService {
	void addTrains(Trains train);
	List<Trains> getTrains();
}
