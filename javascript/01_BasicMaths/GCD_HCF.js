
((a, b) => {
  let divisors = [];
  let num = a < b ? a : b;
  for (let i = 1; i * i <= num; i++) {
    if (num % i === 0) {
      divisors.push(i);

      if (i !== num / i) {
        divisors.push(num / i);
      }
    }
  }
  divisors
    .sort((a, b) => a - b)
    .forEach((e) => {
      let f = a > b ? a : b;
      if (f % e === 0) {
        divisors = e;
      }
    });
  console.log("By my mathord",divisors);
})(
  5,
  2
);
// O(sqrt(min(a,b)))

let gg = (
    (a, b) => {
    while(a>0 && b>0){
        if (a>b) {
            a=a%b
        }else{
            b=b%a
        }
    }
    if(a==0) return b
    return a
  }
  )(5, 2);
  console.log("By Euclidean Algorithem",gg);

  //O(log(min(a, b)))