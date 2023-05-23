"use strict";
console.log(null === null); // true
console.log(true || false); // true
console.log(2 === "2"); // false. This comparison appears to be unintentional because the types 'number' and 'string' have no overlap.
console.log(true === false); // false. This comparison appears to be unintentional because the types 'false' and 'true' have no overlap.
console.log(null === undefined); // false
console.log(2 + "2"); // 22
console.log(2 * "2"); // 4. The right-hand side of an arithmetic operation must be of type 'any', 'number', 'bigint' or an enum type.
var a;
console.log(typeof a); // undefined
var b;
console.log(typeof b); // undefined
var c = 'test';
console.log(typeof c); // string
var d = true; /*console.log(d.charAt(1));*/ // charAt bestaat niet op type true
var e = true;
/*console.log(e.charAt(1));*/ // error: charAt is geen functie van Object
//# sourceMappingURL=TypeQuiz.js.map