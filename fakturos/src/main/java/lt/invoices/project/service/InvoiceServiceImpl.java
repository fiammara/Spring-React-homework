package lt.invoices.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import lt.invoices.project.model.Invoice;
import lt.invoices.project.repository.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	@Autowired
	private InvoiceRepository repo;

	@Transactional
	@Override
	public void addInvoice(@RequestBody Invoice invoice) {
		repo.save(invoice);

	}

	@Transactional(readOnly = true)
	@Override
	public List<Invoice> getInvoices() {
		
		return repo.findAll();
	}

}
