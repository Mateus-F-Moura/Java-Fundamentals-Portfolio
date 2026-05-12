package br.com.mfmoura.fundamentals.lists.todo.model.entities;

import br.com.mfmoura.fundamentals.lists.todo.model.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasksByStatus(Status status) {
        return tasks.stream().filter(t -> t.getStatus() == status).toList();
    }
}
