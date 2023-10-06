const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [N, M] = input[0].split(" ").map(Number);
const arr = new Array(N).fill(0);

for (let l = 1; l <= M; l++) {
    const [i, j, k] = input[l].split(" ").map(Number);
    for (let m = i - 1; m < j; m++)
        arr[m] = k;
}

console.log(arr.join(" "));