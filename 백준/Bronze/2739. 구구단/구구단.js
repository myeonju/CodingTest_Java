const fs = require('fs');
const inputData = fs.readFileSync('/dev/stdin').toString();
const N = Number(inputData);

for(let i = 1; i < 10; i++){
	console.log(N, "*", i, "=", N*i); 
}