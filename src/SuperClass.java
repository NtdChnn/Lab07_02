/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author notda
 */
public class SuperClass {
    String name;

    public SuperClass() {
    }

    public SuperClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SuperClass{" + "name=" + name + '}';
    }
    
}
