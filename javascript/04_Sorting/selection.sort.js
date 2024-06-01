let arr = [5, 3, 1, 2, 4];

 (
    function selectionSort_MIN(arr){
        let min;
        console.log(min);
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

 arr = [5, 3, 1, 2, 4];

(function selectionSort_MAX(arr) {
  let max;
  for (let i = 0; i < arr.length; i++) {
    max = i;
    for (let j = arr.length - i - 1; j < arr.length; j++) {
      if (arr[j] > arr[max]) {
        max = j;
      }
    }

    let temp = arr[i];
    arr[i] = arr[max];
    arr[max] = temp;
  }
})(arr);

console.log(arr);