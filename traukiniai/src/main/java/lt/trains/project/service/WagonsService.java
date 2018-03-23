package lt.trains.project.service;

import java.util.List;

import lt.trains.project.model.Train;
import lt.trains.project.model.Wagons;

public interface WagonsService {
	void addWagons(Wagons wagon);
	List<Wagons> getWagons();
	void addWagonstoTrain(Long wagonId, Long trainId);
	
	
	
}
