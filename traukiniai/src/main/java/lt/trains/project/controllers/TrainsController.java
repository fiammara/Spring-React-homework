package lt.trains.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lt.trains.project.model.Trains;
import lt.trains.project.service.TrainsService;

@RestController
@Api(value = "train")
@RequestMapping(value = "api/trains")
public class TrainsController {
private TrainsService service;
	
	
	@Autowired
	public TrainsController(TrainsService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Add train", notes = "Adds new train to the Repository")
	public void addTrain(@ApiParam @RequestBody Trains train) {
		service.addTrains(train);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get trains", notes = "Returns all trains in the Repository")
	public List<Trains> getTrains(){
		return service.getTrains();
	}

}



