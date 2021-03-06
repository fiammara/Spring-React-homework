package lt.trains.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lt.trains.project.model.Train;
import lt.trains.project.model.Wagons;
import lt.trains.project.service.WagonsService;

@RestController
@Api(value = "wagon")
@RequestMapping(value = "api/wagons")
public class WagonsController {
private WagonsService service;
	
	
	@Autowired
	public WagonsController(WagonsService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{id}/")
	@ApiOperation(value = "Add wagon", notes = "Adds new wagon to the train")
	public void addWagon(@PathVariable("id") Long id, @RequestBody Long wagonId) {
		service.addWagonstoTrain(wagonId, id);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get wagons", notes = "Returns all wagons")
	public List<Wagons> getWagons(){
		return service.getWagons();
		
	}
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Add wagon", notes = "Adds new wagon to the Repository")
	public void addWagon(@ApiParam @RequestBody  Wagons wagon) {
		service.addWagons(wagon);
		
	}

}


