/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minitwitter;

/**
 *
 * @author erichuang
 */
public class User 
{
    private String userID;
    private String groupID;
    
    User(String inputUserID , String inputGroupID)
    {
        userID = inputUserID;
        groupID = inputGroupID;
    }
    
    public static void startUserUI()
    {
        AddUser newUser = new AddUser();
        newUser.setVisible(true);
    }
}