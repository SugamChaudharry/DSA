let toDArray = [
  [1, 2, 3],
  [7, 8, 9],
  [4, 5, 6],
];
let max = [];

for(let i = 0 ; i< toDArray.length ; i++ ){
    let sum = 0
    for (let j = 0; j < toDArray[0].length; j++) {
        sum = sum + toDArray[i][j]
    }
    max[i] = sum;
}
console.log((max));
max.sort((a,b) => a-b)

console.log(max[max.length-1])