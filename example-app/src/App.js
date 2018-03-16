import React, { Component } from 'react';
import axios from 'axios';
import Invoice from './Invoice'
import logo from './logo.svg';
import './App.css';

class App extends Component {

  render() {
   
      return (
        <div className="App">
        <Invoice/>
        </div>    
    )
  }
}

export default App;
