package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    private final String MILK = "Milk";
    private final String CHEESE = "Cheese";
    private final String BREAD = "Bread";

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("2018/02/05");
        Product product1 = new Product(MILK);
        Product product2 = new Product(CHEESE);
        Product product3 = new Product(BREAD);

        Item item1 = new Item(new BigDecimal(2.5), 25);
        Item item2 = new Item(new BigDecimal(13.5), 40);
        Item item3 = new Item(new BigDecimal(3.5), 25);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int product1Id = product1.getId();
        int product2Id = product2.getId();
        int product3Id = product3.getId();
        int numberOfItems = invoice.getItems().size();


        //Then
        assertNotEquals(0, product1Id);
        assertNotEquals(0, product2Id);
        assertNotEquals(0, product3Id);
        assertEquals(3, numberOfItems);

        //CleanUp
        try {
            invoiceDao.deleteById(invoice.getId());
            productDao.deleteById(product1Id);
            productDao.deleteById(product2Id);
            productDao.deleteById(product3Id);

        } catch (Exception e) {
            //do nothing
        }
    }
}
