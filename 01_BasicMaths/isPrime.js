



((num) => {
    let divisors = 0
    for (let i = 1; i * i <= num; i++) {
      if (num % i === 0) {
            divisors++
        if (i !== num / i) {
          divisors++
        }
      }
    }
    if (divisors <= 2) {
        console.log(true);
    }else
    console.log(false);
})(77)
