package Tasks;

import java.time.LocalDate;

public class Task {

    //  title, description, start and end dates, priority (this is a enum), Assignee (note that this is also class - with name, etc..), status (this is also enum).
    private int taskID;
    private String taskTitle;
    private String taskDescription;
    private LocalDate taskStartDate;
    private LocalDate taskEndDate;
    private Priority taskPriority;
    private Assignee taskAssignedTo;
    private Status taskStatus;

    private Task() {
    }

    public int getTaskID() {
        return taskID;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public LocalDate getTaskStartDate() {
        return taskStartDate;
    }

    public LocalDate getTaskEndDate() {
        return taskEndDate;
    }

    public Priority getTaskPriority() {
        return taskPriority;
    }

    public Assignee getTaskAssignedTo() {
        return taskAssignedTo;
    }

    public Status getTaskStatus() {
        return taskStatus;
    }

    public static class Builder {
        private final int taskID;
        private String taskTitle;
        private String taskDescription;
        private LocalDate taskStartDate;
        private LocalDate taskEndDate;
        private Priority taskPriority;
        private Assignee taskAssignedTo;
        private Status taskStatus;

        Builder(int taskID) {
            this.taskID = taskID;
        }


        public Builder setTaskTitle(String taskTitle) {
            this.taskTitle = taskTitle;
            return this;
        }

        public Builder setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }

        public Builder setTaskStartDate(LocalDate taskStartDate) {
            this.taskStartDate = taskStartDate;
            return this;
        }

        public Builder setTaskEndDate(LocalDate taskEndDate) {
            this.taskEndDate = taskEndDate;
            return this;
        }

        public Builder setTaskPriority(Priority taskPriority) {
            this.taskPriority = taskPriority;
            return this;
        }

        public Builder setTaskAssignedTo(Assignee taskAssignedTo) {
            this.taskAssignedTo = taskAssignedTo;
            return this;
        }

        public Builder setTaskStatus(Status taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public Task build() {
            Task task = new Task();
            task.taskTitle = taskTitle;
            task.taskDescription = taskDescription;
            task.taskAssignedTo = taskAssignedTo;
            task.taskStartDate = taskStartDate;
            task.taskPriority = taskPriority;
            task.taskStatus = taskStatus;
            task.taskEndDate = taskEndDate;
            task.taskID = taskID;
            return task;
        }
    }

}
