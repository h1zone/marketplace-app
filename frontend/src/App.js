import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import LoginPage from './pages/LoginPage';

const App = () => {
    return (
        <Router>
            <Switch>
                <Route path="/login" component={LoginPage} />
                <Route path="/" exact>
                    <h1>Welcome to Marketplace App</h1>
                </Route>
            </Switch>
        </Router>
    );
};

export default App;