package lt.trains.project.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.trains.project.model.Trains;
import lt.trains.project.model.Wagons;

import lt.trains.project.repository.WagonsRepository; 


@Service
public class WagonsServiceImpl implements WagonsService {
	@Autowired
	private WagonsRepository repo;
	
	
	@Transactional
	@Override
	public void addWagonstoTrain (Wagons wagon, Trains train) {
		train.addWagon(wagon);		
	}
	
	@Transactional
	@Override
	public void addWagons(Wagons wagon) {
		repo.save(wagon);		
	}
	@Transactional(readOnly = true)
	@Override
	public List<Wagons> getWagons() {
		
		return repo.findAll();
	}

}
