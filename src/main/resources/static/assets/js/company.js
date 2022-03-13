let messArr = ['Msg A', 'Msg B', 'Msg C', 'Msg D'];

function createRandomMessage(){
    let randomNumber = Math.floor(Math.random()* 100);
    let chosenNumber = messArr.length-1 % randomNumber;
    console.log(randomNumber);
    console.log(chosenNumber);
    console.log(messArr[chosenNumber]);
    document.getElementById("random-msg").innerText = messArr[chosenNumber];
}

createRandomMessage();
