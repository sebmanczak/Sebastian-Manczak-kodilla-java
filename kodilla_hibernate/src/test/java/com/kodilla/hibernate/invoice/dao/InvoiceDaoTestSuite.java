package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    private static final String NUMBER = "41258";

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Desk");

        Item item1 = new Item(new BigDecimal(600), 2, new BigDecimal(1200));
        Item item2 = new Item (new BigDecimal(300), 3, new BigDecimal(900));
        Item item3 = new Item(new BigDecimal(900), 4, new BigDecimal(3600));
        Item item4 = new Item(new BigDecimal(1100), 5, new BigDecimal(5500));
        item1.setProduct(product1);
        item2.setProduct(product1);

        Invoice invoice = new Invoice(NUMBER);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertEquals(4, invoice.getItems().size());

        //zobacz ile produktow
        //sprawdz rozmiar
        //CleanUp
        invoiceDao.deleteById(id);
    }
}
