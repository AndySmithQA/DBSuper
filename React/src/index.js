import { BrowserRouter  } from 'react-router-dom';
import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

import Batman from "./components/images/1.jpeg";
import Superman from "./components/images/2.jpeg";
import GreenLantern from "./components/images/4.jpeg";
import TheHuntress from "./components/images/5.jpeg";
import TheFlash from "./components/images/3.jpeg";
import HarleyQuinn from "./components/images/6.jpeg";
import Deadshot from "./components/images/7.jpeg";
import CountVertigo from "./components/images/8.jpeg";
import Robin from "./components/images/9.jpeg";
import Nightwing from "./components/images/10.jpeg";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <BrowserRouter>
    <App />
    </BrowserRouter>
  </React.StrictMode>
);

const images = {
    Batman,
    Superman,
    GreenLantern,
    TheHuntress,
    TheFlash,
    HarleyQuinn,
    Deadshot,
    CountVertigo,
    Robin,
    Nightwing
}
export default images;

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
