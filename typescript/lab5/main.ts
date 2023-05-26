const DEFAULT_COUNTRY_CODE = 'NL';
const DEFAULT_BANK_CODE = 'TYPE';

function formatName(firstName: string, lastName: string, insertion?: string = ''): string {
    if (insertion) {
        return firstName + ' ' + insertion + ' ' + lastName;
    } else {
        return firstName + ' ' + lastName;
    }
}

console.log(formatName('Pascalle', 'Vries', 'de'));
console.log(formatName('Foo', 'Bar'))

function generateIban(bankCode?: string = DEFAULT_BANK_CODE, countryCode?: string = DEFAULT_COUNTRY_CODE) {
    // TODO: implement
    return {
        countryCode: countryCode,
        bankCode: bankCode,
        accountNumber: Math.floor(Math.random() * 10000000000).toString(),
        controlNumber: 0
    };
}

type Iban = { countryCode: string, bankCode: string, accountNumber: string, controlNumber: string };

function formatIban(iban: Iban) {
    console.log(iban.countryCode + ' ' + iban.bankCode + ' ' + iban.accountNumber.substring(0, 4) + ' ' + iban.accountNumber.substring(4, 8) + ' ' + iban.accountNumber.substring(8, 10));
}

console.log(generateIban())

const ibanTypedBank = generateIban();
const ibanIng = generateIban('INGB', 'NL');
const ibanDeutscheBank = generateIban('DEUT', 'DE');
console.log(formatIban(ibanTypedBank));
console.log(formatIban(ibanIng));
console.log(formatIban(ibanDeutscheBank));

function checkIban(iban: Iban) {

}