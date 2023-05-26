"use strict";
const DEFAULT_COUNTRY_CODE = 'NL';
const DEFAULT_BANK_CODE = 'TYPE';
function formatName(firstName, lastName, insertion = '') {
    if (insertion) {
        return firstName + ' ' + insertion + ' ' + lastName;
    }
    else {
        return firstName + ' ' + lastName;
    }
}
console.log(formatName('Pascalle', 'Vries', 'de'));
console.log(formatName('Foo', 'Bar'));
function generateIban(bankCode = DEFAULT_BANK_CODE, countryCode = DEFAULT_COUNTRY_CODE) {
    // TODO: implement
    return {
        countryCode: countryCode,
        bankCode: bankCode,
        accountNumber: Math.floor(Math.random() * 10000000000).toString(),
        controlNumber: 0
    };
}
function formatIban(iban) {
    console.log(iban.countryCode + ' ' + iban.bankCode + ' ' + iban.accountNumber.substring(0, 4) + ' ' + iban.accountNumber.substring(4, 8) + ' ' + iban.accountNumber.substring(8, 10));
}
console.log(generateIban());
const ibanTypedBank = generateIban();
const ibanIng = generateIban('INGB', 'NL');
const ibanDeutscheBank = generateIban('DEUT', 'DE');
console.log(formatIban(ibanTypedBank));
console.log(formatIban(ibanIng));
console.log(formatIban(ibanDeutscheBank));
function checkIban(iban) {
}
//# sourceMappingURL=main.js.map