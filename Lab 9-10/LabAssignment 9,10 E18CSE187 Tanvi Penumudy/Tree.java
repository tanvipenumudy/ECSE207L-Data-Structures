package E18CSE187lab9;
public class Tree {
	
	CustomerTree root;
	
	public void insert (String name,int age) {
		
		root = insert(root,name,age);
		
	}
	
	public CustomerTree insert(CustomerTree root,String name,int age) {
		
		CustomerTree tree = new CustomerTree(name,age);
		
		if(root==null) {
			root = tree;
			return root;
		}else {
			if((root.name).compareToIgnoreCase(name)>0) {
				root.left = insert(root.left,name,age);
			}else {
				root.right = insert(root.right,name,age);
			}
		}return root;
		
	}
	
	public void inorder() {
		
		inorder(root);
		
	}
	
	public void inorder(CustomerTree rootnode) {
		
		if(rootnode != null) {
			inorder(rootnode.left);
			System.out.println(rootnode.name+" "+rootnode.age);
			inorder(rootnode.right);
		}
		
	}

}
