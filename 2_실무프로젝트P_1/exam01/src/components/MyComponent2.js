import { Component } from 'react';

class MyComponent extends Component {
  render() {
    console.log(this.props);

    return (
      <>
        <div>안녕하세요! 제 이름은 이이름입니다.</div>
        <div>좋아하는 숫자는 입니다.</div>
      </>
    );
  }
}

export default MyComponent;
