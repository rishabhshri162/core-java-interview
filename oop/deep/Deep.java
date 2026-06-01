package oop.deep;

import oop.Account;

public class Deep implements Cloneable {

	public int balance;
    public Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Deep deep = (Deep) super.clone();

        deep.address = (Address) address.clone();

        return deep;
    }
}
