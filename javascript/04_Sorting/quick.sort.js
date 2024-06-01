let arr = [8,2,1,3,9,4,7,6,5]
console.log("[" + arr + "]")
function QuickSort(arr ,start ,end){
    if (end <= start) return
    let pivot = partition(arr , start , end)
    QuickSort(arr , start , pivot - 1 ) 
    QuickSort(arr , pivot + 1 , end ) 
}
function partition (arr , start , end) {
    let p = arr[end]
    let i = start - 1
    let j = start
    while (j <= end - 1) {
        if (arr[j] < p ){
            i++
            let temp = arr[j]
            arr[j] = arr[i]
            arr[i] = temp
        }
        j++
    }
    i++
    let temp = arr[i]
    arr[i] = arr[end]
    arr[end] = temp
    return i
}
QuickSort(arr, 0 , arr.length - 1)
console.log("[" + arr + "]")