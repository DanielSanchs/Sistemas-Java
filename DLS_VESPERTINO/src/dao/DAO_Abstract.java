/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author Daniel Lopes
 */
public abstract class DAO_Abstract {
    public abstract void insert(Object object);
    public abstract void delete(Object object);
    public abstract void update(Object object);
    public abstract Object list(int codigo);
    public abstract ArrayList listAll();
}
