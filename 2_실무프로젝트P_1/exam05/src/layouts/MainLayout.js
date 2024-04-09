import React from 'react';
import { Outlet, NavLink } from 'react-router-dom';
import classnames from 'classnames';
const MainLayout = () => {
  return (
    <>
      <header>
        <h1>해더 영역</h1>
        <div>
          <NavLink
            to="/about"
            className={({ isActive }) => classnames('menus', { on: isActive })}
          >
            ABOUT
          </NavLink>
          <NavLink
            to="/board"
            className={({ isActive }) => classnames('menus', { on: isActive })}
          >
            BOARD
          </NavLink>
        </div>
      </header>
      <main>
        <Outlet />
      </main>
      <footer>
        <h1>푸터 영역</h1>
      </footer>
    </>
  );
};

export default React.memo(MainLayout);
