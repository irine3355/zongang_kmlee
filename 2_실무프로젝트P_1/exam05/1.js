//tagged

function tagged(...params) {
  console.log(params);
}

tagged`텍스ㅡㅌ...`;

//

function tagged(...params) {
  console.log(params);
}

const a = 10,
  b = 'abc';

tagged`출력 : ${a}, ${b}`;
