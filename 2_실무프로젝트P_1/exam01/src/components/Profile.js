import { useState } from 'react';

const Profile = () => {
  const [data, setData] = useState({
    name: '김이름',
    age: 40,
  });

  const handleDataChange = () => {
    setData((prevState) => {
      console.log('이전 상태값:', prevState);
      return { ...prevState, name: '김이름' };
    });
  };
  const { name, age } = data;
  return (
    <>
      <h1>{name}</h1>
      <h2>{age}</h2>
      <button type="button" onclick={handleDataChange}>
        변경
      </button>
    </>
  );
};

export default Profile;
