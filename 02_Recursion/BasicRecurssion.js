let c = 0;
(function N_time(value, times) {
  if (c >= times) return;
  console.log(value);
  c++;
  N_time(value, times);
})("Sugam", 10);

console.log("---------------------------------------");

c = 1;
(function one_TO_n(n) {
  if (c > n) return;
  console.log(c);
  c++;
  one_TO_n(n);
})(10);

console.log("---------------------------------------");

(function n_TO_one(n) {
  if (n <= 0) return;
  console.log(n);
  n_TO_one(n - 1);
})(10);

console.log("---------------------------------------");
let sum = 0;
(function SumFirstN(n) {
  if (n <= 0) return;
  sum = sum + n;
  SumFirstN(n - 1);
})(10);
console.log("sum: ", sum);

console.log("---------------------------------------");
let factroial = 1;
(function Factroial_N(n) {
  if (n <= 0) return;
  factroial *= n;
  Factroial_N(n - 1);
})(10);
console.log("factroial: ", factroial);

console.log("---------------------------------------");
let i = 0;
let a = [1, 2, 3, 4, 5, 6, 7];
console.table(a);
function reverseArray(a) {
  if (i >= a.length / 2) return a;
  let t = a[i];
  a[i] = a[a.length - 1 - i];
  a[a.length - 1 - i] = t;
  i++;
  reverseArray(a);
}
reverseArray(a);

console.table(a);

console.log("---------------------------------------");

i = 0;
let copy = [..."sugam"];

(function reverseString(a) {
  if (i >= a.length / 2) {
    console.table([copy.join(""), copy.join("") === a.join(""), a.join("")]);
    return;
  }
  let t = a[i];
  a[i] = a[a.length - 1 - i];
  a[a.length - 1 - i] = t;
  i++;
  reverseString(a);
})([..."sugam"]);

console.log("---------------------------------------");

 let s = "A man, a plan, a canal: Panama";
 let ArrayStr = [...s.toUpperCase()].filter((c) => (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')); 
  i = 0
  copy = [...ArrayStr];
 
 (function reverseStringg(a) {
   if (i >= a.length / 2) {
     console.table([copy.join(""), copy.join("") === a.join(""), a.join("")]);
     return;
   }
   let t = a[i];
   a[i] = a[a.length - 1 - i];
   a[a.length - 1 - i] = t;
   i++;
   reverseStringg(a);
 })(ArrayStr) 

