package lt.trains.project.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.trains.project.model.Train;
import lt.trains.project.model.Wagons;
import lt.trains.project.repository.TrainsRepository;
import lt.trains.project.repository.WagonsRepository; 


@Service
public class WagonsServiceImpl implements WagonsService {
	@Autowired
	private WagonsRepository repo;
	@Autowired
	private TrainsRepository repo1;
	
		
	@Transactional(readOnly = true)
	@Override
	public List<Wagons> getWagons() {
		
		return repo.findAll();
	}
	@Override
	public void addWagons(Wagons wagon) {
		repo.save(wagon);
		
	}
	@Transactional
	@Override
	public void addWagonstoTrain(Long wagonId, Long trainId) {
		Train train= repo1.findById(trainId).get();
		Wagons wagon= repo.findById(wagonId).get();
		train.addWagon(wagon);
		
	}
	
	
	
	

}
