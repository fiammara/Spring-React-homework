import React, { Component } from 'react';
import axios from 'axios';
import InvoiceListElement from './InvoiceListElement';
class Invoice extends Component{
    constructor(props){
    super(props);
    this.state = {invoice:[]};
  
  }
  deleteInvoice(event) {
    this.props.actions.deleteInvoice(this.state.invoice)
  }

       
  componentDidMount(){
    axios.get('http://localhost:8080/api/invoice')
    .then(response=>{this.setState({invoice:response.data})})

    axios.delete('http://localhost:8080/api/invoice/${this.state.id}')
  .then(response=>{this.setState({invoice:response.data})})
  }
  
  render(){
    const invoiceList = this.state.invoice.map(invoice=>{
      return <InvoiceListElement key={invoice.id} invoice = {invoice}/>
    })
    return<table>
      <thead>
        <tr>
        <th> Company </th>
        <th> Receiver </th>
        
        </tr>
        </thead>
        <tbody>
          {invoiceList}
           
          </tbody>
          </table>
  }
  }
  export default Invoice;