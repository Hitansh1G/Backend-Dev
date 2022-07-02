module.exports.add = function (a,b){
    return a+b;
}
/**
 * now what is module.exports
 * this whole file is a module
 * 
 * module.exports is an object and in this object i am giving add as a key that corresponds to the function similarly i can add more functions and all of themn will be key with value as the function 
 */
module.exports.multiply = function(a,b){
    return a*b;
}