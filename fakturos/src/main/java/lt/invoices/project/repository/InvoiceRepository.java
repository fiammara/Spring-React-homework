package lt.invoices.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.invoices.project.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
