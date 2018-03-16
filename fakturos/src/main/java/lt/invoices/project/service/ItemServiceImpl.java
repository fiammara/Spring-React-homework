package lt.invoices.project.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.invoices.project.model.Item;
import lt.invoices.project.repository.ItemRepository;



@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemRepository repo;
	@Transactional
	@Override
	public void addItem(Item item) {
		repo.save(item);
		
	}
	@Transactional
	@Override
	public List<Item> getItems() {
		
		return repo.findAll();
	}

}
