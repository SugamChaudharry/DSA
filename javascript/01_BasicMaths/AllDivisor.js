



(function AllDivisor(num) {
  let divisors = [];

  for (let i = 1; i*i <= num; i++) {
    if (num % i === 0) {
      divisors.push(i)

      if (i !== num / i) {
        divisors.push(num / i);
      }
    }
  }
  console.log(divisors.sort((a,b)=> a-b));
})(36);
