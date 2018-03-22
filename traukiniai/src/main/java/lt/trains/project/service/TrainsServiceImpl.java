package lt.trains.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import lt.trains.project.model.Trains;
import lt.trains.project.repository.TrainsRepository;

@Service
public class TrainsServiceImpl implements TrainsService{
	@Autowired
	private TrainsRepository repo;
	
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
