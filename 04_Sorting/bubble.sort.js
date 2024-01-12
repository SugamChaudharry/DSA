let arr = [5,4,3,2,1]

let len = arr.length

for(let p = 0 ; p < arr.length - 1 ; p++){
    for (let j = 0; j < len - 1 - p ; j++) {
        if(arr[j] > arr[j+1]){
            let temp = arr[j]
            arr[j] = arr[j+1]
            arr[j+1] = temp
        }
        
    }
}

console.log(arr);