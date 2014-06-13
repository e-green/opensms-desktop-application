/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.User;

/**
 *
 * @author ChanakaDe
 */
public interface UserController extends RestController{
    public int changeUserName(User user);
    public int changePassword(User uSer);
    public int changeUserType(User user);
    public int changeUserStatus(User user);
}
