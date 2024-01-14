let arr = [9,8,7,6,5,4,3,2,1,0];
console.log("befour : ", arr +  "");
function merge_sort(arr) {
  if (arr.length <= 1) return;

  const mid = Math.floor(arr.length / 2);
  const leftarr = arr.slice(0, mid);
  const rightarr = arr.slice(mid);

  merge_sort(leftarr);
  merge_sort(rightarr);
  merge(leftarr, rightarr, arr);
}

function merge(leftarr, rightarr, arr) {
  let l = 0,
    r = 0,
    i = 0;

  while (l < leftarr.length && r < rightarr.length) {
    if (leftarr[l] < rightarr[r]) {
      arr[i++] = leftarr[l++];
    } else {
      arr[i++] = rightarr[r++];
    }
  }

  while (l < leftarr.length) {
    arr[i++] = leftarr[l++];
  }

  while (r < rightarr.length) {
    arr[i++] = rightarr[r++];
  }
}

merge_sort(arr);
console.log("after  : ",arr + "")
