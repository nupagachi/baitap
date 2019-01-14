/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.Controller;

import java.util.List;

/**
 *
 * @author pc
 */
public interface IController<T> {
    T Insert(T t);
    List<T> SetlectAll();
    void UpdateID(long id);
    void DeleteTen(String ten);
}
