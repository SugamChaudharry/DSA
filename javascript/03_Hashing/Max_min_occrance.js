let arr = [10, 5, 10, 15, 10, 5, 5,16];
let fq = [];
arr.sort((a, b) => a - b);
let max = arr[arr.length - 1];
let arrr = max;
for (let i = 0; i <= max; i++) {
  fq[i] = 0;
}
arr.forEach((e) => {
  fq[e]++;
});

let i = 0;
let f = 0;
max = [0,0];
let min = [0,0];

for (let i = 0; i < fq.length; i++) {
  if (fq[i] !== 0) {
    if (fq[i] > max[1]) {
      max[1] = fq[i];
      max[0] = i;
      if(f===0){
        min[1] = fq[i];
        min[0] = i;
        f = 1
      }
    }else if (fq[i] === max[1]) {
      max[0] = [max[0],i];
    }
    if(fq[i]<min[1]){
         min[1] = fq[i];
         min[0] = i;
    }else if(fq === min[1]){
        min[0] = [min[0], i];
    }
  }
}
console.log(max);
console.log(min);
