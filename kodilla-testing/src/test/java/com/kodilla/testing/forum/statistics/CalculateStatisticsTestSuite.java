package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> userList = new ArrayList<>();
        for(int n = 1; n <= usersQuantity; n++) {
            String theUser = "User" + n;
            userList.add("User");
        }
        return userList;
    }
    @Test
    public void testCalculateAdvStatisticsWhenPostsCount0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(5));
        when(statisticsMock.commentsCount()).thenReturn(20);
        //When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);
        statisticsProcessor.showStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticsProcessor.getPostsCount());
        Assert.assertEquals(5, statisticsProcessor.getUsersCount());
        Assert.assertEquals(20, statisticsProcessor.getCommentsCount());
    }
    @Test
    public void testCalculateAdvStatisticsWhenPostsCount1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(233));
        when(statisticsMock.commentsCount()).thenReturn(1488);
        //When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);
        statisticsProcessor.showStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, statisticsProcessor.getPostsCount());
        Assert.assertEquals(233, statisticsProcessor.getUsersCount());
        Assert.assertEquals(1488, statisticsProcessor.getCommentsCount());
    }
    @Test
    public void testCalculateAdvStatisticsWhenCommentsCount0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(55));
        when(statisticsMock.postsCount()).thenReturn(4545);
        //When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);
        statisticsProcessor.showStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticsProcessor.getCommentsCount());
        Assert.assertEquals(55, statisticsProcessor.getUsersCount());
        Assert.assertEquals(4545, statisticsProcessor.getPostsCount());
    }
    @Test
    public void testCalculateAdvSettingsWhenCommentsCountLessThanPostsCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statisticsMock.commentsCount()).thenReturn(1245);
        when(statisticsMock.postsCount()).thenReturn(2564);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(159));
        //When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);
        statisticsProcessor.showStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1245, statisticsProcessor.getCommentsCount());
        Assert.assertEquals(2564, statisticsProcessor.getPostsCount());
        Assert.assertEquals(159, statisticsProcessor.getUsersCount());
    }
    @Test
    public void testCalculateAdvSettingsWhenCommentsCountGreaterThanPostsCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statisticsMock.commentsCount()).thenReturn(4445);
        when(statisticsMock.postsCount()).thenReturn(2564);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(199));
        //When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);
        statisticsProcessor.showStatistics(statisticsMock);
        //Then
        Assert.assertEquals(4445, statisticsProcessor.getCommentsCount());
        Assert.assertEquals(2564, statisticsProcessor.getPostsCount());
        Assert.assertEquals(199, statisticsProcessor.getUsersCount());
    }
    @Test
    public void testCalculateAdvSettingsWhenUsersCount0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(0));
        when(statisticsMock.postsCount()).thenReturn(32);
        when(statisticsMock.commentsCount()).thenReturn(40);
        //When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);
        statisticsProcessor.showStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticsProcessor.getUsersCount());
        Assert.assertEquals(32, statisticsProcessor.getPostsCount());
        Assert.assertEquals(40, statisticsProcessor.getCommentsCount());
    }
}
