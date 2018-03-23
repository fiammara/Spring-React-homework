package lt.trains.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.trains.project.model.Train;
import lt.trains.project.model.Wagons;
import lt.trains.project.repository.TrainsRepository;
import lt.trains.project.repository.WagonsRepository;

@Service
public class TrainsServiceImpl implements TrainsService{
	@Autowired
	private TrainsRepository repo;
	@Autowired
	private WagonsRepository repo1;
	
	@Transactional
	@Override
	public void addTrains(Train train) {
		repo.save(train);
		
	}
	@Transactional(readOnly = true)
	@Override
	public List<Train> getTrains() {
		
		return repo.findAll();
	}
	@Transactional
	@Override
	public void addWagonstoTrain(Long wagonId, Long trainId) {
		Train train= repo.findById(trainId).get();
		Wagons wagon= repo1.findById(wagonId).get();
		train.addWagon(wagon);
		
	}


}
