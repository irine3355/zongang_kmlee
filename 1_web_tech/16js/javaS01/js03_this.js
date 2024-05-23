//JavaScript에서 모든 함수는 객체에 속해 있습니다.
//그러나 모든 함수가 객체에 속해 있는 것은 아닙니다. 예를 들어, 내장 함수인 parseInt이나 setTimeout과 같은 함수는 객체에 직접 속해 있지 않습니다.
// 내장된 함수 객체들은 전역 객체인 window 객체나 global 객체의 메서드로서 동작합니다.
//또한, 화살표 함수(arrow function)도 객체에 속해 있는 것이 아닙니다. 화살표 함수는 함수 선언식이나 함수 표현식과는 달리 this를 바인딩하지 않습니다.
// 따라서 화살표 함수는 일반적인 객체가 아닌 함수로 취급되지만, 객체의 메서드로 사용되지는 않습니다.
//호출 컨텍스트란 ?

/**
 * 
 * 1.객체의 메서드 내부에서의 this:
객체의 메서드 내에서 this는 해당 메서드가 호출된 객체를 가리킵니다. 이 경우 this는 객체 자체를 가리키며, 메서드 내에서 객체의 속성에 접근하거나 다른 메서드를 호출하는 데 사용됩니다.
2. 일반 함수 내부에서의 this:
일반 함수 내부에서 this는 호출 방식에 따라 다르게 결정됩니다. 전역 컨텍스트에서 호출된 함수의 경우 this는 전역 객체를 가리키며, 객체의 메서드가 아닌 일반 함수 내에서 this를 사용하면 전역 객체를 참조합니다. 그러나 엄격 모드(strict mode)에서는 전역 컨텍스트에서 함수를 호출할 때 this는 undefined가 됩니다.
3.생성자 함수 내부에서의 this:
생성자 함수 내부에서 this는 새로운 인스턴스를 가리킵니다. 생성자 함수를 사용하여 객체를 생성할 때 new 키워드로 호출된 함수 내에서 this는 새로운 인스턴스를 가리킵니다.
4.화살표 함수 내부에서의 this:
*
화살표 함수 내부에서 this는 해당 화살표 함수가 정의된 시점의 바깥 범위에서의 this를 상속합니다. 따라서 화살표 함수 내부에서 this를 사용하면 그 함수가 선언된 곳에서의 this를 가리킵니다.
JavaScript에서 this가 가리키는 것을 알아내는 것은 때로 복잡할 수 있습니다. 하지만 일반적으로는 몇 가지 규칙을 따르면 this가 어떤 것을 가리키는지 유추할 수 있습니다.

호출 방식:
함수가 객체의 메서드로 호출될 때: this는 해당 객체를 가리킵니다.
일반 함수로 호출될 때: this는 전역 객체를 가리킵니다. 엄격 모드(strict mode)에서는 this는 undefined가 됩니다.
call, apply, bind 메서드:
이러한 메서드를 사용하여 함수를 호출할 때, 첫 번째 인자로 전달된 값이 this가 됩니다.
화살표 함수:
화살표 함수 내부에서 this는 해당 함수가 정의된 시점에서의 외부 스코프의 this를 상속합니다.
클로저:
함수가 클로저로 사용될 때, this는 호출 컨텍스트에 따라 결정됩니다. 클로저 내부에서 this를 사용할 때 주의가 필요합니다.
생성자 함수:
생성자 함수 내부에서 this는 새로운 인스턴스를 가리킵니다.


 */

const person = { name: "이이름", age: 40 };
//apply 메서드를 사용하여 함수를 호출하고, this가 가리키는 것을 보여주는 예시입니다.
function add(num1, num2) {
  console.log(this);
  return num1 + num2;
}

add.apply(person, [10, 20]); // aadd 함수를 호출하면서 this를 person 객체로 지정하고, [10, 20] 배열을 함수의 인자로 전달하고자 합니다.

// 호출 컨텍스트
//
//
//

//함수가 호출되는 경우를 몇개 예제를 만들어서 이해하게 해줘

//1. 전역 컨텍스트에서 함수 호출:

function greet() {
  console.log(this);
}
greet(); // 전역 객체를 가리킴 (브라우저에서는 window 객체)
//
//
//

//2. 객체의 메서드로 함수 호출:

const person2 = {
  // = 는 변수를 선언하고 값을 할당하는데 사용되는 대입 연산자
  name: "John",
  greet: function () {
    console.log(this.name);
  },
};
person2.greet(); // person 객체를 가리킴
//
//
//

//3. call 또는 apply 메서드로 함수 호출:
function greet() {
  console.log(this.name);
}
const person3 = { name: "John" };
greet.call(person3); // person 객체를 가리킴
//
//
//

//4. bind 메서드를 사용하여 함수 호출:
function greet() {
  console.log(this.name);
}
const person4 = { name: "John" };
const boundGreet = greet.bind(person4);
boundGreet(); // person 객체를 가리킴
//
//
//

//5. 화살표 함수에서의 this 사용:

const person5 = {
  name: "John",
  greet: () => {
    console.log(this.name);
  },
};
person5.greet(); // 전역 객체를 가리킴

// 6. 클로저
function outerFunction() {
  const name = "John";
  return function innerFunction() {
    console.log(this.name); // this는 outerFunction의 호출 컨텍스트에 따라 달라집니다.
  };
}

const innerFunc = outerFunction();
innerFunc(); // 호출 컨텍스트에 따라 this는 전역 객체를 가리키거나 undefined일 수 있습니다.
