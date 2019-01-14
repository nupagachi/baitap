/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.dao;

import java.util.List;

/**
 *
 * @author pc
 */
public interface IDAO<T> {
    T Insert(T t);
    void UpdateID(long id);
    List<T> SetlectAll();
    void DeleteTen(String ten);
}
