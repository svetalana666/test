/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.MessageService;

/**
 *
 * @author Света
 */
public class MessageController extends SimpleFormController {
    
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
    
    public MessageController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(User.class);
        setCommandName("user");
        setSuccessView("messageView");
        setFormView("userView");
    }
    
    @Override
    protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
    @Override
    protected ModelAndView onSubmit(Object command) throws Exception {
        User user = (User) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("newMessage", messageService.printMessage(user.getName(), user.getSurname(), user.getEmail()));
        return mv;
    }
    /*    //Do something...
        
    }
     */
}
