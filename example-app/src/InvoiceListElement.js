
import React, { Component } from 'react';

class InvoiceListElement extends Component{
  constructor(props){
  super(props);
  this.state = {display: true};
  this.deleteInvoice = this.deleteInvoice.bind(this);

}

render(){
  return(
  <tr>
  <td>{this.props.invoice.company}</td>
  <td>{this.props.invoice.receiver}</td>
  <button 
           onClick={this.deleteInvoice} 
           className="btn btn-default">
           delete
        </button>
  </tr>
  );
}
}
export default InvoiceListElement;