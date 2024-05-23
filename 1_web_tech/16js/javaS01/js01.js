function add(num1) {
  return function (num2) {
    return num1 + num2;
  };
}

// 자바스크립트에서 클로저를 활용한 함수를

var addToFive = add(5); // 5는 num1
console.log(addToFive(3)); // addToFive 는 내부의 함수
//
// 1. function (num2) {return num1 + num2; }; 호출
// 2. num2 에 3이 전달
// 3. return num1 + num2; 실행
// 4. num1에 5 전달
