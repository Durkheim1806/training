"use strict";
function formatName(firstName, lastName, insertion) {
    if (insertion) {
        return firstName + ' ' + insertion + ' ' + lastName;
    }
    else {
        return firstName + ' ' + lastName;
    }
}
console.log(formatName('Pascalle', 'Vries', 'de'));
console.log(formatName('Foo', 'Bar'));
//# sourceMappingURL=main.js.map