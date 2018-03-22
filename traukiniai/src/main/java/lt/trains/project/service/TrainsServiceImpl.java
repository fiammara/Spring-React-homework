package lt.trains.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import lt.trains.project.model.Trains;
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
	public void addWagonstoTrain (Long wagonId, Long trainId) {
		Trains train= repo.findById(trainId);
		train.addWagon(repo1.findById(wagonId));		
	}
	@Transactional
	@Override
	public void addTrains(Trains train) {
		repo.save(train);
		
	}
	@Transactional(readOnly = true)
	@Override
	public List<Trains> getTrains() {
		
		return repo.findAll();
	}

}
