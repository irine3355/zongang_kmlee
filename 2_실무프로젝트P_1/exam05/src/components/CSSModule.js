import styles from './CSSModule.module.scss'
import { useState } from 'react';
import classnames from 'classnames';
const CSSMoudule = () => {
    const [visible, setVisible] = useState(false);

  return (
    <> 
  <div className={styles.wrapper}>안녕하세요, <span className={styles.highlight}>반갑습니다.
  </div>;

  <div className={{on: visibles } }메뉴</div>

  <button type='button' onClick={() => setVisible(!visible)}>클릭</button>
  </>
  )
};


export default CSSMoudule;
