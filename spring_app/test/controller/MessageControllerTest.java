/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.servlet.ModelAndView;
import service.MessageService;

/**
 *
 * @author Света
 */
public class MessageControllerTest {
    
    public MessageControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* MessageControllerTest: @BeforeClass method");

    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* MessageControllerTest: @AfterClass method");

    }
    
    @Before
    public void setUp() {
        System.out.println("* MessageControllerTest: @Before method");

    }
    
    @After
    public void tearDown() {
        System.out.println("* MessageControllerTest: @After method");
    }

    /**
     * Test of onSubmit method, of class MessageController.
     */
    @Test
    public void testOnSubmit() throws Exception {
        System.out.println("* MessageControllerTest: onSubmit");
        MessageService messageService = new MessageService();
        String name = "Ivan";
        String surname = "Ivanov";
        String email = "ivan@gmail.com";
        assertEquals("Dear Ivan Ivanov. In your email ivan@gmail.com poisoned letter of confirmation of registration.", 
                messageService.printMessage(name, surname, email));
    }
    
}
