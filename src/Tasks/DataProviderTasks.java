package Tasks;

import java.time.LocalDate;

public class DataProviderTasks {
    private static DataProviderTasks tasksData;
    private static final Task[] tasks = new Task[5];
    private static final Assignee[] users = new Assignee[4];

    private DataProviderTasks() {
        users[0] = new Assignee("Astghik Petrosyan", 1, Assignee.Position.QA);
        users[1] = new Assignee("Stephen King", 2, Assignee.Position.BACK_END_DEVELOPER);
        users[2] = new Assignee("John Smith", 3, Assignee.Position.BA);
        users[3] = new Assignee("Jane Daw", 4, Assignee.Position.PROJECT_MANAGER);

        tasks[0] = new Task.Builder(12)
                .setTaskTitle("New task 0")
                .setTaskAssignedTo(users[0])
                .setTaskDescription("lorem ipsum")
                .setTaskPriority(Priority.MEDIUM)
                .setTaskStartDate(LocalDate.of(2017, 12, 6))
                .setTaskEndDate(LocalDate.of(2018, 12, 6))
                .setTaskStatus(Status.CREATED)
                .build();
        tasks[1] = new Task.Builder(14)
                .setTaskTitle("New task 1")
                .setTaskAssignedTo(users[3])
                .setTaskDescription("lorem ipsum")
                .setTaskPriority(Priority.HIGH)
                .setTaskStartDate(LocalDate.of(2019, 12, 6))
                .setTaskEndDate(LocalDate.of(2019, 12, 12))
                .setTaskStatus(Status.IN_PROGRESS)
                .build();
        tasks[2] = new Task.Builder(23)
                .setTaskTitle("New task")
                .setTaskAssignedTo(users[2])
                .setTaskDescription("lorem ipsum")
                .setTaskPriority(Priority.LOW)
                .setTaskStartDate(LocalDate.of(2020, 12, 6))
                .setTaskEndDate(LocalDate.of(2020, 12, 31))
                .setTaskStatus(Status.ASSIGNED)
                .build();
        tasks[3] = new Task.Builder(112)
                .setTaskTitle("New task")
                .setTaskAssignedTo(users[1])
                .setTaskDescription("lorem ipsum")
                .setTaskPriority(Priority.MEDIUM)
                .setTaskStartDate(LocalDate.of(2020, 1, 6))
                .setTaskEndDate(LocalDate.of(2020, 2, 6))
                .setTaskStatus(Status.DONE)
                .build();
        tasks[4] = new Task.Builder(452)
                .setTaskTitle("New task")
                .setTaskAssignedTo(users[0])
                .setTaskDescription("lorem ipsum")
                .setTaskPriority(Priority.HIGH)
                .setTaskStartDate(LocalDate.of(2020, 5, 6))
                .setTaskEndDate(LocalDate.of(2020, 7, 6))
                .setTaskStatus(Status.DONE)
                .build();


    }

    public static DataProviderTasks getInstance() {
        if (tasksData == null) {
            tasksData = new DataProviderTasks();
        }
        return tasksData;
    }

    public static Task[] getTasks() {
        return tasks;
    }

    public static Assignee[] getUsers() {
        return users;
    }


}
