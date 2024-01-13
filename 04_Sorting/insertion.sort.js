let arr = [5,4,3,2,1]
let temp = 0;

for(let i = 1 ; i < arr.length ; i++){
    temp = arr[i]
    for(let j = i-1 ; j >= 0 ; j-- ){
        if (arr[j+1] < arr[j]) {
            arr[j+1] = arr[j]
            arr[j] = temp
        }
    }
}
console.log(arr);