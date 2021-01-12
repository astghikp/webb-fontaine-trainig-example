package Tasks;

import java.time.LocalDate;

public class TasksAPI {
    private TasksAPI() {
    }

    public static String getAllTasks() {
        // is this right way?
        try {
            DataProviderTasks.getInstance();
        } catch (NullPointerException instanceIsNull) {
            System.out.println("No tasks are found");
        }

        StringBuilder taskList = new StringBuilder();

        for (int i = 0; i < DataProviderTasks.getTasks().length; i++) {

            taskList.append(DataProviderTasks.getTasks()[i].getTaskID()).append(" ");
        }
        return taskList.toString();
    }

    public static String getTasksByStatus(Status status) {
        try {
            DataProviderTasks.getInstance();
        } catch (NullPointerException instanceIsNull) {
            System.out.println("No tasks are found");
        }
        StringBuilder taskList = new StringBuilder();
        for (int i = 0; i < DataProviderTasks.getTasks().length; i++) {
            if (DataProviderTasks.getTasks()[i].getTaskStatus() == status) {

                taskList.append(DataProviderTasks.getTasks()[i].getTaskID()).append(" ");
            }
        }
        return taskList.toString();

    }

    public static String getTasksByAssigned(String userName) {
        try {
            DataProviderTasks.getInstance();
        } catch (NullPointerException instanceIsNull) {
            System.out.println("No tasks are found");
        }
        //sra masin kkardam vonc anem :)
        try {
            userName.isEmpty();
        } catch (NullPointerException userIsNull) {
            System.out.println("Provide correct user");
        }
        StringBuilder taskList = new StringBuilder();
        for (int i = 0; i < DataProviderTasks.getTasks().length; i++) {
            if (DataProviderTasks.getTasks()[i].getTaskAssignedTo().getUserName().contains(userName)) {

                taskList.append(DataProviderTasks.getTasks()[i].getTaskID()).append(" ");
            }
        }
        return taskList.toString();

    }

    public static String getTasksByEndDate(LocalDate date) {
        try {
            DataProviderTasks.getInstance();
        } catch (NullPointerException instanceIsNull) {
            System.out.println("No tasks are found");
        }

        // same here
        try {
            date.equals(null);
        } catch (NullPointerException instanceIsNul) {
            System.out.println("Date is wrong");
        }
        StringBuilder taskList = new StringBuilder();
        for (int i = 0; i < DataProviderTasks.getTasks().length; i++) {
            //urish dzev ka toString chanelov hamematem? vonc pordzeci chexav :(
            if (DataProviderTasks.getTasks()[i].getTaskEndDate().toString().equals(date.toString())) {

                taskList.append(DataProviderTasks.getTasks()[i].getTaskID()).append(" ");
            }
        }
        return taskList.toString();

    }

    public static boolean deleteDoneTasks() {
        try {
            DataProviderTasks.getInstance();
        } catch (NullPointerException instanceIsNull) {
            System.out.println("No tasks are found");
        }
        for (int i = 0; i < DataProviderTasks.getTasks().length - 1; i++) {
            if (DataProviderTasks.getTasks()[i].getTaskStatus() == Status.DONE && DataProviderTasks.getTasks()[i + 1].getTaskStatus() == Status.DONE) {

                DataProviderTasks.getTasks()[i] = DataProviderTasks.getTasks()[i + 1];
            }
        }
        return true;
    }

}
