package com.java.mavenproject.mavenproject;

public class Java_project {

	public static void main(String[] args) {
		 
        System.out.println("Code added from master");
        System.out.println("Code added from Branch1");
        System.out.println("Code added from Branch1");
        
        UpdateFromClone1 abc = new UpdateFromClone2();
        System.out.println("Code added from Branch1");
        UpdateFromClone1 abc = new UpdateFromClone1();

        abc.getval1();
        abc.getval2();
        abc.revert1();

        
        
        UpdateFromClone2 abcd = new UpdateFromClone2();
        abcd.getval1();
        abcd.getval2();

        UpdateFromClone2 test = new UpdateFromClone2();
        test.getval1();
        
        Dev1_funtionality dev1= new Dev1_funtionality();
        dev1.getval_dev1();
        Dev1_funtionality2 dev2= new Dev1_funtionality2();
        dev2.getval_dev2();
        dev2.getval_dev3();
	}

}
