/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author notda
 */
public class subclass extends SuperClass {
    int ID;

    public subclass() {
    }

    public subclass(int ID, String name) {
        super(name);
        this.ID = ID;
    }

    @Override
    public String toString() {
        return super.toString()+"subclass{" + "ID=" + ID + '}';
    }
}
