function add(num1, num2) {
  return num1 + num2;
}

add.apply;

add.apply(this, [10, 20]);
