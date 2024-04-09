import styled, { css } from 'styled-components';

export const BigButton = styled.button`
  width: 100%;
  height: 45px;
  border: 0;
  font-size: 1.5rem;
  font-weight: bold;
  background: ${({ bgcolor }) => bgcolor ?? 'orange'};
  border-radius: 5px;
  ${({ selected, bgcolor }) =>
    selected &&
    css`
      border: 1px solid ${bgcolor ?? 'orange'};
      background: #fff;
    `}
`;
