package javaDataStructures7BST;

public class Uygulama {

	public static void main(String[] args) {

		Bst agac=new Bst();
		
		agac.root=agac.insert(agac.root, 12);
		agac.root=agac.insert(agac.root,15);
		agac.root=agac.insert(agac.root,10);
		agac.root=agac.insert(agac.root,5);
		agac.root=agac.insert(agac.root,11);
		agac.root=agac.insert(agac.root,16);
		agac.root=agac.insert(agac.root,14);
//					12
//		  10				 15
//	5			11		14			16

		System.out.println(agac.root.left.right.data);
	}

}
