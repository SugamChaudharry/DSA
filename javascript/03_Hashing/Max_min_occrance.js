let arr = [10, 5, 10, 15,  5, 5];
let fq = [];
arr.sort((a, b) => a - b);
let max = arr[arr.length - 1];
for (let i = 0; i <= max; i++) {
  fq[i] = 0;
}
arr.forEach((e) => {
  fq[e]++;
});

max = [0,0];
arr = [0,Number.MAX_VALUE]; // re-using arr array as min array

for (let i = 0; i < fq.length; i++) {
  if (fq[i] !== 0) {

    if (fq[i] > max[1]) {
      max = [i , fq[i]]
    }else if (fq[i] === max[1]) {
      max[0] = [max[0],i];
    }

    if(fq[i] < arr[1]){
      arr = [i , fq[i]]
    }else if (fq[i] === arr[1]){
      arr[0] = [arr[0] , i]
    }
  }
}
console.log(max);
arr = arr[1] === Number.MAX_VALUE ? [0,0] : arr;
console.log(arr);
