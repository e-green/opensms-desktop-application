/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.List;
import model.User;

/**
 *
 * @author ChanakaDe
 */
public interface RestController {
    public int save(User user);
    public int update(User user);
    public User read(String id);
    public int delete(User uSer);
    public List<User> search(User user);
}
