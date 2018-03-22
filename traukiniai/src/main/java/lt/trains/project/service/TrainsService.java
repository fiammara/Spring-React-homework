package lt.trains.project.service;

import java.util.List;

import lt.trains.project.model.Train;


public interface TrainsService {
	void addTrains(Train train);
	List<Train> getTrains();
	void addWagonstoTrain(Long wagonId, Long trainId);


}
