function Armstrong(num) {
  let len = (num + "").length;

  const copy = num;
  let rem = 0;
  let sum = 0;
  while (num !== 0) {
    rem = num % 10;
    sum += rem ** len;
    num = parseInt(num / 10);
  }
  return sum === copy
    ? [true, "Befour: " + copy, "After: " + sum]
    : [false, "Befour: " + copy, "After: " + sum];
}

console.log(Armstrong(37164356));
