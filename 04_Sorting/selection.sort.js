let arr = [5, 3, 1, 2, 4];

 (
    function selectionSort(arr){
        let min = 0 
        for(let i = 0 ; i < arr.length ; i++){
            min = i
            for(let j = i ; j < arr.length ; j++){

                if(arr[j]<arr[min]){
                    min = j
                }

            }

            let temp = arr[i]
            arr[i] = arr[min]
            arr[min] = temp

        }
    }
 )(arr)

 console.log(arr);