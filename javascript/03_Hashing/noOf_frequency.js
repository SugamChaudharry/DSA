let arr = [10,5,10,15,10,5,5];
let fq = [];
arr.sort((a,b)=>a-b)
let max = arr[arr.length-1];
for (let i = 0; i <= max; i++) {
    fq[i] = 0;    
}
arr.forEach(e => {
    fq[e]++;
});
let i =0
max = 0
min = 0
fq.forEach(e => {
    if (e>0) {
        if(min = 0) min = i
        max = i
        console.log([i,e]);
        // console.log(`${i} ouccers ${e} times`);
    }
    i++;
})
