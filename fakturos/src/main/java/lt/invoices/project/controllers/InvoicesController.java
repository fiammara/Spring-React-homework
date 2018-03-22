package lt.invoices.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lt.invoices.project.model.Invoice;
import lt.invoices.project.service.InvoiceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@CrossOrigin
@RestController
@Api(value = "invoice")
@RequestMapping(value = "api/invoices")
public class InvoicesController {
private InvoiceService service;
	
	
	@Autowired
	public InvoicesController(InvoiceService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Add invoice", notes = "Adds new invoice to the Repository")
	public void addInvoice(@ApiParam @RequestBody Invoice invoice) {
		service.addInvoice(invoice);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get invoices", notes = "Returns all invoices in the Repository")
	public List<Invoice> getInvoices(){
		return service.getInvoices();
	}

}
