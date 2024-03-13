let arr = [ 1, 2, 3, 4, 5 ]
const len = arr.length
let repetition = 0

function bubbleSort(arr, len){
    let deswap = 0
    if (repetition < arr.length - 1){
        for (let compression = 0; compression < len - 1 - repetition ; compression++) {
            if(arr[compression] > arr[compression+1]){
                let temp = arr[compression]
                arr[compression] = arr[compression+1]
                arr[compression+1] = temp
                deswap = 1
            }
        }
        if (deswap == 0) return
        repetition++
        bubbleSort(arr , len)
    }
    return
}

bubbleSort(arr, len)
console.log(arr)