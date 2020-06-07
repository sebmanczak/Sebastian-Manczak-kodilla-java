package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                            .bun("Sesame")
                            .burgers(3)
                            .sauce("Barbecue")
                            .ingredient("Lettuce")
                            .ingredient("Onion")
                            .ingredient("Chili peppers")
                            .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();

        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(3, howManyBurgers);
    }
}
