package Tasks;

import org.junit.Test;
import org.testng.Assert;

import java.time.LocalDate;

public class TestAPI {


    @Test
    public void testGetAllTasks() {

        String taskList = TasksAPI.getAllTasks();
        Assert.assertEquals(taskList, "12 14 23 112 452 ");

    }

    @Test
    public void testGetTasksByStatus() {

        String taskList = TasksAPI.getTasksByStatus(Status.CREATED);
        Assert.assertEquals(taskList, "12 ");

    }

    @Test
    public void testGetTasksByStatusNeverUsed() {

        String taskList = TasksAPI.getTasksByStatus(Status.ON_HOLD);
        Assert.assertEquals(taskList, "");

    }

    @Test
    public void getTasksByAssigned() {

        String taskList = TasksAPI.getTasksByAssigned("Astghik Petrosyan");
        Assert.assertEquals(taskList, "12 452 ");

    }

    @Test
    public void getTasksByAssignedUserWithoutTasks() {

        String taskList = TasksAPI.getTasksByAssigned("David");
        Assert.assertEquals(taskList, "");

    }

    @Test
    public void getTasksByEndDate() {

        String taskList = TasksAPI.getTasksByEndDate(LocalDate.of(2020, 7, 6));
        Assert.assertEquals(taskList, "452 ");

    }

    @Test
    public void getTasksByEndDateNotContains() {

        String taskList = TasksAPI.getTasksByEndDate(LocalDate.of(2020, 5, 12));
        Assert.assertEquals(taskList, "");


    }

    @Test
    public void getTasksByEndDateNull() {

        String taskList = TasksAPI.getTasksByEndDate(null);
        Assert.assertEquals(taskList, "Date is wrong");

    }

    @Test
    public void deleteDoneTasksl() {

        boolean tasksDeleted = TasksAPI.deleteDoneTasks();
        Assert.assertTrue(tasksDeleted);

    }
}
