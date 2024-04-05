import { MdCheckBox, MdCheckBoxOutlineBlank } from 'react-icons/md';
import { FaRegTrashAlt } from 'react-icons/fa';

const TodoList = ({ items, onToggle, onRemove }) => {
  return (
    <ul>
      {items.map(({ id, title, done }) => (
        <li key={id}>
          <span onClick={() => onToggle(id)}>
            {done ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}
            {title}
          </span>
          <button type="button" onClick={() => onRemove(id)}>
            <FaRegTrashAlt />
          </button>
        </li>
      ))}
    </ul>
  );
};

export default TodoList;
