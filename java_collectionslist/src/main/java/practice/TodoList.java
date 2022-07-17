package practice;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> myList = new ArrayList<>();

    public void add(String todo) {
        myList.add(todo);
        System.out.print(myList);
        // TODO: добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (index < myList.size()) {
            myList.add(index, todo);
            System.out.println("Добавлено дело " + todo);
        } else {
            myList.add(todo);
        }
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
    }

    public void edit(int index, String todo) {
        if (index < myList.size()) {
            myList.set(index, todo);
            System.out.println(todo);
        }
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (index < myList.size()) {
            myList.remove(index);
            System.out.println(myList);
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        int i = 0;
        while (i < myList.size()) {
            i++;
        }
        return new ArrayList<>(myList);
    }

}