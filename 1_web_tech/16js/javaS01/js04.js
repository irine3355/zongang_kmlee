function add(num1, num2) {
  return num1 + num2;
}

const add10 = add.bind(this, 10);
