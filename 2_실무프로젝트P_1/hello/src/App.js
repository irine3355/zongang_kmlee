const App = () => {
  const name = 'js';

  const style = {
    color: ;white',
    height: '100px',
  };

  return (
    <>
    <div style={style}첫번째></div>
    <div style={{color:'blue'}}>신나는,{name && name}공부 </div>
    {name === 'react' && <h1>아! 재미있다!</h1>}
    </>
  );
};

export default App;
