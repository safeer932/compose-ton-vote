const express = require('express');
const app = express();

app.get('/', (req, res) => {
  res.send('Result app is running!');
});

app.listen(80, '0.0.0.0', () => {
  console.log('Result app on port 80');
});
