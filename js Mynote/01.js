// 빈 요소와 배열의 순회 p31

var arr1= [undefined, 1];
var arr2 = [] ;
arr2[1] = 1;

arr1.forEach (function (v,i) {console.log(v,i);});
arr2.forEach (function (v,i) {console.log(v,i);});

arr1.map (function (v,i) {console.log(v,i);});
arr2.map (function (v,i) {console.log(v,i);});

arr1.filter (function (v,i) {console.log(v,i);});
arr2.filter (function (v,i) {console.log(v,i);});

arr1.reduce (function (v,i) {console.log(v,i);});
arr2.reduce (function (v,i) {console.log(v,i);});

//

var a =1;
function outer() {
    function inner() {
        console.log(a);
        var a =3;
    } 

    inner();
    console.log(a);  
}



outer();
console.log(a);


// 스코프체인 p57

var a =1;
var outer = function () {
    var inner = function () {
        console.log(a);
        var a =3;
    } 

    inner();
    console.log(a);  
}



outer();
console.log(a);


// 매개변수 화이스팅 p44

function a(x) {
    var x;
    var x;
    var x;

    x = 1;
    console.log(x);
    console.log(x);
var x =2;
    console.log(x);
}

a(1)

//

function a() {
    var x = 1;
    console.log(x);
    var x;
    console.log(x);
var x =2;
    console.log(x);
}

a();

//

function a() {
    var x;
    var x;
    var x;
    x =1;
    console.log(x);
    
    console.log(x);
 x =2;
    console.log(x);
}

a(1);

//

function a () {
    console.log(b);
    var b ='bbb';
    console.log(b);
    function b () {}
    console.log(b);

}

a();


//

console.log(sum(3,4));

function sum(x,y) {
    return x+y;

}

var a = sum (x,y);

function sum (x, y) {
    return x + '+' + y + '=' + (x+y);
   
}

var c= sum(1,2);
console.log(c);

// 내부함수 this p72

var obj1 = {
    outer:function() {
        console.log(this);
        var innerFunc = function () {
            console.log(this);

        }
        innerFunc();

        var obj2 = {
            innerMethod: innerFunc

        };
        obj2.innerMethod();
    }
};

obj1.outer();

//

var obj1 = {
    outer:function() {
        console.log(this);
        var innerFunc = () => {
            console.log(this);

        }
        innerFunc();

        
    }
};

obj1.outer();



// 콜백함수  this ? p77

setTimeout (function () {console.log(this);}, 300);

[1,2,3,4,5] .forEach (function (x) {
    console.log(this, x);

});

document.body.innerHTML += '<button id="a">클릭</button>';
document.body.querySelector('#a')
.addEventListener('click', function (e) {
    console.log(this,e);
});


// 생성자 this ?

var Cat = function (name, age) {
    this.bark = '야옹';
    this.name = name;
    this.age = age;

};

var choco = new Cat ('초코', 7);
var nabi = new Cat ('나비', 7);

console.log(choco, nabi);


// call  메서드 1 ?

var func =function (a,b,c) {
    console.log(this, a,b,c);

};

func(1,2,3);
func.call({x:1},4,5,6);

// call  메서드 2 ?

var obj = {
    a:1,
    method: function (x,y) {
        console.log(this.a, x,y);
    }
};

obj.method(2,3);
obj.method.call({a:4},5,6);

// json 활용한 깊은 복사 - 코드 p28

var copyObjectViaJSON = function (target) {
    return JSON.parse(JSON.stringify(target));
};
var obj = {
    a:1,
    b: {
        c: null,
        d: [1,2],
        func1: function () { console.log(3);}
    },
    func2: function () { console.log(4);}
};

var obj2 = copyObjectViaJSON(obj);

obj2.a =3;
obj2.b.c = 4;
obj.b.d[1] = 3;

console.log(obj);
console.log(obj2);

// call 메서드 p80

var func = function (a,b,c) {
    console.log(this, a, b, c);
};

func(1, 2, 3);
func.call({x:1}, 4, 5, 6);

//call 메서드 p81

var obj = {
a:1,
method: function (x, y) {
    console.log(this.a, x,y);
}  

}

obj.method(1, 2, 3);
obj.method.call({x:1}, 4, 5, 6); 

//프로토타입 맵 p99

var newArr2 = [10, 20, 30].map(function ( currentVaalue, index) {
    console.log(currentVaalue, index);
    return currentVaalue + 5;
});

console.log(newArr2);

