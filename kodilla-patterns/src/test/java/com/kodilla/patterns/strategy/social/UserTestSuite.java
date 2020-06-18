package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User sebastian = new Millenials("Seb M");
        User kate = new YGeneration("Kate B");
        User mat = new ZGeneration("Mat R");

        //When
        String socialMediaChosenBySeb = sebastian.sharePost();
        System.out.println("Seb chose " + socialMediaChosenBySeb);
        String socialMediaChosenByKate = kate.sharePost();
        System.out.println("Kate chose " + socialMediaChosenByKate);
        String socialMediaChosenByMat = mat.sharePost();
        System.out.println("Mat chose " + socialMediaChosenByMat);

        //Then
        Assert.assertEquals("[Facebook publisher] ", socialMediaChosenBySeb);
        Assert.assertEquals("[Twitter Publisher] ", socialMediaChosenByKate);
        Assert.assertEquals("[Snapchat Publisher] ", socialMediaChosenByMat);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User sebastian = new Millenials("Seb M");

        //When
        String socialMediaChosenBySeb = sebastian.sharePost();
        System.out.println("Seb chose " + socialMediaChosenBySeb);
        sebastian.setChoosingStrategy(new TwitterPublisher());
        socialMediaChosenBySeb = sebastian.sharePost();
        System.out.println("Seb chose " + socialMediaChosenBySeb);

        //Then
        Assert.assertEquals("[Twitter Publisher] " , socialMediaChosenBySeb);
    }
}
