class HelloWorld {
    static sayHello(m: string): void {
        console.log('Hello world');
    }
}

HelloWorld.sayHello();
const pi = 3.14;
const str = "a string using 'double quotes'";
const str2 = 'a string using "single quotes"';
const str3 = `a string using back ticks
can be multi line
pi is: ${pi}, or (${Math.floor(pi)})`;
console.log(str3);