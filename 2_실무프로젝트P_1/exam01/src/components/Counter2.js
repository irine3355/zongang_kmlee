import React, { Component } from 'react';

class Counter2 extends Component {
  state = {
    Number: 0,
  };

  render() {
    const { Number } = this.state;
    const plus = () => this.setState({ Number: Number + 1 });
    const minus = () => this.setState({ Number: Number - 1 });

    return (
      <>
        <h1>{Number}</h1>
        <button type="button" onClick={plus}>
          +1
        </button>
        <button type="button" onClick={minus}>
          -1
        </button>
      </>
    );
  }
}

export default Counter2;

/*
import { Component } from 'react'; */
