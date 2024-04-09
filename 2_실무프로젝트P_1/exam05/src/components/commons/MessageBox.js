import React from 'react';

const MessageBox = ({ className, children }) => {
  <div className={className}>{children}</div>;
};

export default React.memo(MessageBox);
