function formatName(firstName: string, lastName: string, insertion?:
    string): string {
    if (insertion) {
        return firstName + ' ' + insertion + ' ' + lastName;
    } else {
        return firstName + ' ' + lastName;
    }
}

console.log(formatName('Pascalle', 'Vries', 'de'));
console.log(formatName('Foo',, 'Bar'))