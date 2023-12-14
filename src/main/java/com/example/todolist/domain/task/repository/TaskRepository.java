package com.example.todolist.domain.task.repository;

import com.example.todolist.domain.task.entity.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class TaskRepository implements JpaTaskRepository {

    private final EntityManager em;

    @Override
    public Task save(Task task) {
        em.persist(task);
        return task;
    }

    @Override
    public List<Task> findById(int id) {
        List<Task> result = Collections.singletonList(em.find(Task.class, id));
        return result;
    }

    @Override
    public Optional<Task> findByTitle(String title) {
        List<Task> result = em.createQuery("select t from Task t where t.title", Task.class)
                .setParameter("title", title)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<Task> findAll() {
        return em.createQuery("select t from Task t", Task.class)
                .getResultList();
    }
}
