let arr = [5,4,3,2,1]
let temp = 0
let repetition = 1

function insertionSort(arr,temp){
    if (repetition < arr.length) {
        temp = arr[repetition]
        for(let j = repetition-1 ; j >= 0 && arr[j+1] < arr[j] ; j-- ){
                arr[j+1] = arr[j]
                arr[j] = temp
        }
        repetition++
        insertionSort(arr,temp)
    }
    return

}

insertionSort(arr,temp)
console.log(arr)
