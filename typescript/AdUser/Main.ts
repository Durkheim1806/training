import {AdDto} from "./AdDto";

const ad1 = {
    title: 'Hitchhikers',
    price: 42,
    User: {
        email: 'abc@bde.nl',
        password: 'welkom'
    }
}

function markAdAsWold(ad: AdDto) {
    ad.sold = true;
}

console.log(ad1);
markAdAsWold(ad1);
console.log(ad1);