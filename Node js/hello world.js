console.log('Hello World'); 
function add(a,b){
    return a+b;
}
console.log(add(2,8));
// now we want to passout any arguements with the file what we can do is access it in a global variable , global object i would say which is process. it looks over whatever is running on node js
console.log(process.argv);

var args = process.argv.slice(2);

console.log("adding the numbers : ",add(parseInt(args[0]),parseInt(args[1])));