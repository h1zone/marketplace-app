import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router } from 'react-router-dom'; // Для маршрутизации
import App from './App'; // Основной компонент приложения

// Импорт стилей (если используются)
import './styles/index.css';

ReactDOM.render(
  <React.StrictMode>
    <Router>
      <App />
    </Router>
  </React.StrictMode>,
  document.getElementById('root') // Рендеринг в элемент с id="root"
);