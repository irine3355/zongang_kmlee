1. // 프로토타입

    function 기계(){
        this.q = 'strike';   // 자식도 'strike' 가짐
        this.w = 'snowball';  
    }
    var nunu = new 기계(); // 오브젝트 찍어내기

nunu 
//아래와 같이 출력
// 기계 {q: 'strike', w: 'snowball'}q: "strike"w: "snowball"[[Prototype]]: Object

//부모가 자식 객체에 물려주는 방식 두번째는 prototype , js만 있는 특별한 것

기계.prototype.name = 'kim'; // 부모만 name = 'kim' 가짐

//기계.prototype
// {name: 'kim'}name: "kim"constructor: ƒ 기계()[[Prototype]]: Object

nunu.name
//'kim'  이렇게 출력 부모는 그대로 변하지 않음.

// 2. 어레이

var 어레이 = [4, 2,1];
어레이.sort()
// (3) [1, 2, 4]  정열하여 출력

var 어레이 = new Array(4,2,1);
new object()