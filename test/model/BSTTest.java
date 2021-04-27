package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BSTTest {

	BST<Integer, Integer> bst;
	ArrayList <Integer> indices;
	
	public void setup1() {
		bst = new BST<>();
		indices=new ArrayList <Integer>();
	}
	public void setup2() {
		bst = new BST<>();
		bst.insertE(20, 2);
		bst.insertE(15, 3);
		bst.insertE(22, 1);
	}
	public void setup3() {
		setup1();
		bst.insertE(20, 1);
		bst.insertE(20, 2);
		bst.insertE(20, 3);
		bst.insertE(20, 4);
		bst.insertE(20, 5);
	}
	@Test
	void test() {
		setup1();
		int key = 20;
		int value = 1;
		bst.insertE(key, value);
		
		assertNotNull(bst.getRoot(),"It is null");
	}
	
	@Test
	void test2() {
		setup2();
		assertNotNull(bst.getRoot().getLeft(),"It is null");
		assertNotNull(bst.getRoot().getRight(),"It is null");
		
		assertEquals(22,bst.getRoot().getRight().getKey(),"It is null");
		assertEquals(15,bst.getRoot().getLeft().getKey(),"It is null");
		
		assertEquals(1,bst.getRoot().getRight().getValue().get(0),"It is null");
		assertEquals(3,bst.getRoot().getLeft().getValue().get(0),"It is null");
		
		bst.inOrderLess(bst.getRoot(),10);
		indices=bst.indices();
		assertEquals(3,indices.get(0),"It is null");
		assertEquals(2,indices.get(1),"It is null");
		assertEquals(1,indices.get(2),"It is null");
	}
	@Test
	void test3() {
		setup3();
		assertNotNull(bst.getRoot(),"It is null");
		
		assertEquals(1,bst.getRoot().getValue().get(0),"It is null");
		assertEquals(2,bst.getRoot().getValue().get(1),"It is null");
		assertEquals(3,bst.getRoot().getValue().get(2),"It is null");
		assertEquals(4,bst.getRoot().getValue().get(3),"It is null");
		
		bst.inOrderLess(bst.getRoot(),10);
		indices=bst.indices();
		assertEquals(1,indices.get(0),"It is null");
		assertEquals(2,indices.get(1),"It is null");
		assertEquals(3,indices.get(2),"It is null");
	}
}
