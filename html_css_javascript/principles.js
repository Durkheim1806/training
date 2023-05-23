var array = [
    {
        title: "The \"Peter Principle\"",
        text: "\"In a hierarchy, every employee tends to rise to his level of incompetence.\"",
        link: "https://en.wikipedia.org/wiki/Peter_principle",
        picture: "peter.jpeg"
    },
    {
        title: "Goodhart's law",
        text: "Any observed statistical regularity will tend to collapse once pressure is placed upon it for control purposes. \n" +
            "\tWhen a measure becomes a target, it ceases to be a good measure.",
        link: "https://en.wikipedia.org/wiki/Goodhart%27s_law",
        picture: "goodhart.jpeg"

    },
    {
        title: "Parkinson's law",
        text: "Work expands so as to fill the time available for its completion.\"",
        link: "https://en.wikipedia.org/wiki/Parkinson%27s_law",
        picture: "parkinson.jpeg"
    }
]


var iteratie = 0;

function switchPrinciple() {
    let index = iteratie % array.length;
    document.getElementById("title").innerHTML = array[index].title;
    document.getElementById("text").innerHTML = array[index].text;
    document.getElementById("link").innerHTML = array[index].link;
    document.getElementById("picture").src = array[index].picture;
    iteratie++;
}


