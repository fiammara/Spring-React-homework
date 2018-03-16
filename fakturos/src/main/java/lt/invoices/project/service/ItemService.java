package lt.invoices.project.service;

import java.util.List;

import lt.invoices.project.model.Item;

public interface ItemService {
	void addItem(Item item);
	List<Item> getItems();
}
