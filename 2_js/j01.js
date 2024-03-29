function add(...params) {
    console.log(add=0, add+=1)
}


//fgrt

class Ellipse {
    constructor (a, b) {
        this. a=a;
        this. b= b;

    }
    area () {
        console.log ("면적:", this.a * this.b * Math. PI);
    }
}


//

function person {
    
}

person.prototype.showinfo = function (){
    console.log (this. name, this. age);
};

// 프로토타입 오브젝트 어레이 

var num1= 10;
    function outer () {
    var num2 =20;

        function inner () {
        var num3 =30;

        return num1+ num2 + num3;
    }
        var result = inner();
        console.log(result);
        console.dir(inner);
}

// 내장 생성자 date 

const date = new Date();

const strTime = `${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}`;

strTime;

// 내장 생성자 date 달력
const date = new Date();
const firstDate = new Date (date.getFullYear(), date.getMonth(),1);

const nextMonth = new Date(date.getFullYear(), date.getMonth(), 1);

nextMonth.setMonth(nextMonth.getMonth() +1);

nextMonth.setDate(nextMonth.getDate()-1);

nextMonth;

// function bind

function add(num1, num2) {
    return num1 + num2;
}
const add10= add.bind(this, 10);

add10(20);

//

const person = {
    name: "이이름",
    age: 40
};

function showinfo() {
    console.log(this.name, this.age);
}

    showinfo = showinfo.bind(person);

    showinfo();
