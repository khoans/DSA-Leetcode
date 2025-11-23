package com.nskhoa.designpattern.BEHAVIORAL.iterator.example6;

public class TodoListDemo {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.addTask(new TodoTask("Write blog post"));
        todoList.addTask(new TodoTask("Submit report"));

        MyIterator<TodoTask> it = todoList.createIterator();
        while (it.hasNext()) {
            TodoTask task = it.next();
            System.out.println("Task: " + task.getDescription());
        }
    }
}
