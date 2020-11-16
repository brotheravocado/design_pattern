/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch09.second;

/**
 *
 * @author dbswl
 */
public interface Iterator <T> {
    
    boolean hasNext();
    
    T next();
    
}
