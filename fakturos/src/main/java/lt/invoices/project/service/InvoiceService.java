package lt.invoices.project.service;

import java.util.List;

import lt.invoices.project.model.Invoice;

public interface InvoiceService {
	void addInvoice(Invoice invoice);
	List<Invoice> getInvoices();
}
