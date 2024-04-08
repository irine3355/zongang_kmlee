import React, { useState, useCallback, useMemo } from 'react';

function getAverage(nums) {
  //합계 / 갯수

  const total = nums.reduce((acc, num) => {
    acc += num;

    return acc;
  });

  let avg = total / nums.length;
  avg = Math.round(avg * 100) / 100; //소수점 첫째 자리까지 표기 ( 반올림)

  return avg;
}

const Average = () => {
  const [nums, setNums] = useState([]);
  const [num, setNum] = useState('');

  const onchange = useCallback((e) => setNum(e.currentTarget.value || 0), []);
  const onsubmit = useCallback(
    (e) => {
      e.preventDefault();
      setNums((nums) => nums.concat(num));
    },
    [num],
  );
  // const avg = getAverage(nums);
  const avg = useMemo(() => getAverage);
  return (
    <>
      <form autoComplete="off" onSubmit={onsubmit}>
        <input type="number" value={num} onChange={onchange} />
        <button type="submit">등록</button>
      </form>
      <ul>
        {nums.map((num, i) => (
          <li key={1}>{num}</li>
        ))}
      </ul>
      평균: {avg}
    </>
  );
};

export default React.memo(Average);
