function chunck(arr, size){
  let res = []
  let apparr = []
  let temsize = size;
  for(let i = 0; i < arr.length; i++){
    if (temsize) {
      apparr.push(arr[i])
      temsize--
    }else{
      i--
      res.push(apparr)
      temsize = size
      apparr = []
    }
  }
  res.push(apparr)
  return res;
}

console.log(chunck([1,2,3,4,5] , 3))
