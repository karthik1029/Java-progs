package Stringoperations;



public class BST {
	
public class node{
		
		public node left,right;
		int value;
		
		public node(int v)
		{
			this.value=v;
			left=null;
			right=null;
		}
		
		public void insert(node n,int v)
		{
			if(v<n.value)
			{
				if(n.left!=null)
				{
					insert(n.left,v);
				}
				else
				{
					n.left=new node(v);
				}
			}
			else if(v>n.value)
			{
				if(n.right!=null)
				{
					insert(n.right,v);
				}
				else
				{
					n.right=new node(v);
				}
			}
		}
		
		
		public void disp(node n)
		{
			
			
			while(n!=null)
			{
				disp(n.left);
				System.out.println(n.value);
				disp(n.right);
			}
			
			
		}
		
		public void search(node n,int v)
		{
			try {
				if(n==null || v==n.value)
				{
					System.out.println(n.value);
				}
				else if(v<n.value)
				{
					search(n.left,v);
				}
				else
				{
					search(n.right,v);
				}
			} catch (NullPointerException e) {
				System.out.println("No such element");
				
			}
		}
		
		public int min(node n)
		{
			while(n.left!=null)
			{
				n=n.left;
			}
			return n.value;
		}
		
		public int max(node n)
		{
			while(n.right!=null)
			{
				n=n.right;
			}
			return n.value;
		}
		
	}

	public static void main(String[] args)  {
		BST s=new BST();
		node n=s.new node(10);
		n.insert(n, 11);
		n.insert(n, 12);
		System.out.println("Max: "+n.max(n));
		System.out.println("Min: "+n.min(n));
		n.insert(n, 9);
		System.out.println("Min: "+n.min(n));
		n.search(n, 13);

	}
}
