package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("Clean rooms");
        board.getToDoList().addTask("Set up the bar");
        board.getToDoList().addTask("Prepare the development plan");

        board.getInProgressList().addTask("Cook dinner for the group");
        board.getInProgressList().addTask("Remove the bad smell in the room");

        board.getDoneList().addTask("Staff training");
        System.out.println(board);
        //Then
        Assert.assertEquals(3, board.getToDoList().getTasks().size());
        Assert.assertEquals(2, board.getInProgressList().getTasks().size());
        Assert.assertEquals(1, board.getDoneList().getTasks().size());
    }
}
//Dlaczego wypisaly sie wszystkie mozliwe zadania po wykomentowaniu @Scope("prototype")?
//Po wykomentowaniu @Scope("prototype") wyswietlily sie wszystkie zadania poniewaz
// spring utworzyl beany sigletony czyli beany jednego typu