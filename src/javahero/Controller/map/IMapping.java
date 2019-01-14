/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.Controller.map;

/**
 *
 * @author pc
 */
public interface IMapping<E,D> {
    D toDTO(E e);
    E toEntity(D d);
}
