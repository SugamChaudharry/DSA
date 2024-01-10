/*
Recursion: When a function calls it self until a specifical condition is met
*/

// printing n number using recursion
let str = ''
function recursion(counter){
    if(counter > 10) return;
    str = str + counter + ' '
    recursion(counter + 1)
    str = str + counter + " ";
}

recursion(0)
console.log(str);
