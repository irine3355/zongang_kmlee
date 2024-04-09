import { Routes, Route } from 'react-router-dom';
import loadable from '@loadable/component';

const Home = loadable(() => import('./Pages/Home'));
const About = loadable(() => import('./Pages/About'));
const BoardList = loadable(() => import('./Pages/BoardList'));
const MainLayout = loadable(() => import('./layouts/MainLayout'));
const NotFound = loadable(() => import('./Pages/NotFound'));

/*
import Home from './Pages/Home';
import About from './Pages/About';
import Board from './Pages/Board';
import BoardList from './Pages/BoardList';
import MainLayout from './layouts/MainLayout';
import NotFound from './Pages/NotFound';
*/
const App = () => {
  return (
    <Routes>
      <Route element={<MainLayout />}>
        <Route index element={<Home />} />
        <Route path="about" element={<About />} />
        {/*/about */}
        <Route path="board" element={<BoardList />} />
        <Route path="*" element={<NotFound />} />
      </Route>
    </Routes>
    /* index 같음 path="/" */
  );
};

export default App;
