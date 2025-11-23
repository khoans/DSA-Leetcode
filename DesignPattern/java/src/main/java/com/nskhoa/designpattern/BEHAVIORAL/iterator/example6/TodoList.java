package com.nskhoa.designpattern.BEHAVIORAL.iterator.example6;

public class TodoList {
    private final TodoTask[] tasks = new TodoTask[10];
    private int count = 0;

    void addTask(TodoTask task) {
        if (count < tasks.length) {
            tasks[count++] = task;
        }
    }

    MyIterator<TodoTask> createIterator() {
        return new TodoListIterator();
    }

    private class TodoListIterator implements MyIterator<TodoTask> {
        private int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public TodoTask next() {
            return tasks[index++];
        }
    }
}
