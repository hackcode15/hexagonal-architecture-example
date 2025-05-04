package com.app.example1hexagonal.infrastructure.entities;

import com.app.example1hexagonal.domain.models.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_task")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDateTime creationDate;
    private boolean completed;

    // se podria hacer con un mapper
    public static TaskEntity fromDomainModel(Task task) {
        return new TaskEntity(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getCreationDate(),
                task.isCompleted()
        );
    }

    public Task toDomainModel() {
        return new Task(
                this.id,
                this.title,
                this.description,
                this.creationDate,
                this.completed
        );
    }

}
