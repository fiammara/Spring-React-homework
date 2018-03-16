package lt.invoices.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import lt.invoices.project.model.Item;

import lt.invoices.project.service.ItemService;


public class ItemController {
private ItemService service;
	
	
	@Autowired
	public ItemController(ItemService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Add item", notes = "Adds new item to the Invoice")
	public void addItem(@ApiParam @RequestBody Item item) {
		service.addItem(item);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get items", notes = "Returns all items in the Invoice")
	public List<Item> getItems(){
		return service.getItems();
	}

}
