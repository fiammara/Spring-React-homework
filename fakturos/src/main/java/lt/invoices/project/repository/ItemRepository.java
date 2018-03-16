package lt.invoices.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.invoices.project.model.Item;



public interface ItemRepository extends JpaRepository<Item, Long>{

}
