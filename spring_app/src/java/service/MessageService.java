/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author Света
 */
public class MessageService {
    public String printMessage (String name, String surname,String email){
        return "Dear " + name + " " + surname + ". In your email " + email + " poisoned letter of confirmation of registration.";
    }
}
