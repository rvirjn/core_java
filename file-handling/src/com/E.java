package com;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class E implements Externalizable
{
public static void main(String[] args)
{
	E e1=new E();
	
}

@Override
public void readExternal(ObjectInput in) throws IOException,
		ClassNotFoundException
{
	// TODO Auto-generated method stub
	
}

@Override
public void writeExternal(ObjectOutput out) throws IOException
{
	// TODO Auto-generated method stub
	
}
}
