const DEFAULT_COUNTRY_CODE: string = 'NL';
const DEFAULT_BANK_CODE: string = 'TYPE';
console.log(typeof DEFAULT_COUNTRY_CODE);
console.log(typeof DEFAULT_BANK_CODE);

for (var i = 0; i < 2; i++) {
    let j = i;
    setTimeout(function () {
        console.log(i, j);
    }, 0)
}