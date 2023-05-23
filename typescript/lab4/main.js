"use strict";
const DEFAULT_COUNTRY_CODE = 'NL';
const DEFAULT_BANK_CODE = 'TYPE';
console.log(typeof DEFAULT_COUNTRY_CODE);
console.log(typeof DEFAULT_BANK_CODE);
for (var i = 0; i < 2; i++) {
    let j = i;
    setTimeout(function () {
        console.log(i, j);
    }, 0);
}
//# sourceMappingURL=main.js.map