const express = require('express');
const path = require('path');

const app = express();
const PORT = 3000;

// Ykazivaet chto ststicheskie faili nahodiatsa v public
app.use(express.static(path.join(__dirname, 'public')));

// Obrabotka POST-zaprosov (dlia formi vhoda)
app.use(express.urlencoded({ extended: true }));

// Marsryt dlia glavnoi stranici
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'public', 'index.html'));
});

// Marshryt dlia obrabotki vhoda
app.post('/login', (req, res) => {
    const { username, password } = req.body;
    console.log(`Login: ${username}, Password: ${password}`);
    // Zdes mozno dobavit logoky dlia vvoda login-parol
    res.send('Вход выполнен!');
});

// Zapusk servera
app.listen(PORT, () => {
    console.log(`Server zapushen na http://localhost:${PORT}`);
});