class Node1
{
	public int data;
	public Node1 next;
}

class Node2
{
	public int data;
	public Node2 prev;
	public Node2 next;
}

class Node3
{
	public int data;
	public Node3 next;
}

class Node4
{
	public int data;
	public Node4 prev;
	public Node4 next;
}
////////////////////////////////////////////////////////////////////

class Singly_Linear_Linked_List_Methods
{
	Node1 first;
	int size;
	
	public Singly_Linear_Linked_List_Methods()
	{
		first = null;
		size = 0;
	}
	
	public void InsertFirst(int no)
	{
		Node1 newn = new Node1();
		newn.data = no;
		newn.next = null;
		if(first == null)
		{
			first = newn;
		}
		else
		{
			newn.next = first;
			first = newn;
		}
		size++;
	}
	public void InsertLast(int no)
	{
		
		Node1 newn = new Node1();
		newn.data = no;
		newn.next = null;
		if(first == null)
		{
			first = newn;
		}
		else
		{
			Node1 temp = first;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newn;
		}
		size++;
	}
	public void InsertAtPos(int ipos,int no)
	{
		Node1 newn = new Node1();
		newn.data = no;
		newn.next = null;
		
		if(ipos == 1)
		{
			InsertFirst(no);
		}
		else if(ipos == size+1)
		{
			InsertLast(no);
		}
		else
		{
			Node1 temp = first;
			for(int i = 1; i < ipos -1; i++)
			{
				temp = temp.next;
			}
			newn.next = temp.next;
			temp.next = newn;
			size++;
		}
	}
	public void DeleteFirst()
	{
		if(first == null)
		{
			return;
		}
		else if(first.next == null)
		{
			first = null;
		}
		else
		{
			Node1 temp = first;
			first = first.next;
			temp.next = null;
			temp = null;
		}
		size--;
	}
	public void DeleteLast()
	{
		if(first == null)
		{
			return;
		}
		else if(first.next == null)
		{
			first = null;
		}
		else
		{
			Node1 temp = first;
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next = null;
		}
		size--;
	}
	public void DeleteAtPos(int ipos)
	{
		if(ipos == 1)
		{
			DeleteFirst();
		}
		else if(ipos == size)
		{
			DeleteLast();
		}
		else
		{
			Node1 temp = first;
			for(int i =1; i < ipos -1;i++)
			{
				temp = temp.next;
			}
			Node1 temp1 = temp.next;
			temp.next = temp.next.next;
			temp1.next = null;
			temp1 = null;
			size--;
		}
	}
	public void Display()
	{
		Node1 temp = first;
		while(temp != null)
		{
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}
}
//////////////////////////////////////////////////////////////

class Doubly_Linear_Linked_List_Method
{
	Node2 first;
	int size;
	public Doubly_Linear_Linked_List_Method()
	{
		first = null;
		size=0;
	}
	
	void InsertFirst(int no)
	{
		Node2 newn = new Node2();
		newn.data = no;
		newn.prev = null;
		newn.next = null;
		if(first == null)
		{
			first = newn;
		}
		else
		{
			newn.next = first;
			newn.next.prev = newn;
			first = newn;
		}
		size++;
	}
	void InsertLast(int no)
	{
		Node2 newn = new Node2();
		newn.data = no;
		newn.prev = null;
		newn.next = null;
		if(first == null)
		{
			first = newn;
		}
		else
		{
			Node2 temp = first;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newn;
			newn.prev = temp;
		}
		size++;
	}
	void InsertAtPos(int ipos,int no)
	{
		if(ipos == 1)
		{
			InsertFirst(no);
		}
		else if(ipos == size+1)
		{
			InsertLast(no);
		}
		else
		{
			Node2 newn = new Node2();
			newn.data = no;
			newn.prev = null;
			newn.next = null;
			Node2 temp = first;
			
			for(int i = 0; i < ipos -1; i++)
			{
				temp = temp.next;
			}
			newn.next = temp.next;
			newn.prev = temp;
			temp.next = newn;
		}
		size++;
	}
	void DeleteFirst()
	{
		if(first == null)
		{
			return;
		}
		else if(first.next == null)
		{
			first = null;
		}
		else
		{
			first = first.next;
			first.prev.next = null;
			first.prev = null;
		}
	}
	void DeleteLast()
	{
		if(first == null)
		{
			return;
		}
		else if(first.next == null)
		{
			first = null;
		}
		else
		{
			Node2 temp = first;
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next.prev = null;
			temp.next = null;
		}
		size--;
	}
	void DeleteAtPos(int ipos)
	{
		if(ipos == 1)
		{
			DeleteFirst();
		}
		else if(ipos == size)
		{
			DeleteLast();
		}
		else
		{
			Node2 temp = first;
			for(int i = 1;i < ipos -1; i++)
			{
				temp = temp.next;
			}
			temp.next.prev = null;
			temp.next = temp.next.next;
			temp.next.prev.next = null;
			temp.next.prev = temp;
			size--;
		}
	}
	void Display()
	{
		Node2 temp = first;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
//////////////////////////////////////////////////////////
class Singly_Circular_Linked_List_Methods
{
	Node3 first;
	Node3 last;
	int size;
	public Singly_Circular_Linked_List_Methods()
	{
		first = null;
		last = null;
		size = 0;
	}
	void InsertFirst(int no)
	{
		Node3 newn = new Node3();
		newn.data = no;
		newn.next = null;
		
		if(first == null && last == null)
		{
			first = newn;
			last = newn;
		}
		else
		{
			newn.next = first;
			first = newn;
		}
		last.next = first;
		size++;
	}
	void InsertLast(int no)
	{
		Node3 newn = new Node3();
		newn.data = no;
		newn.next = null;
		
		if(first == null && last == null)
		{
			first = newn;
			last = newn;
		}
		else
		{
			last.next = newn;
			last = newn;
		}
		last.next = first;
		size++;
	}
	void InsertAtPos(int ipos,int no)
	{
		if(ipos == 1)
		{
			InsertFirst(no);
		}
		else if(ipos == size+1)
		{
			InsertLast(no);
		}
		else
		{
			Node3 newn = new Node3();
			newn.data = no;
			newn.next = null;
			Node3 temp = first;
			for(int i = 1; i < ipos - 1; i++)
			{
				temp = temp.next;
			}
			newn.next = temp.next;
			temp.next = newn;
			size++;
		}
	}
	void DeleteFirst()
	{
		if(first == null && last == null)
		{
			return;
		}
		else if(first == last)
		{
			first = null;
			last = null;
		}
		else
		{
			Node3 temp = first;
			first = first.next;
			temp.next = null;
		}
		size--;
	}
	void DeleteLast()
	{
		if(first == null && last == null)
		{
			return;
		}
		else if(first == last)
		{
			first = null;
			last = null;
		}
		else
		{
			Node3 temp = first;
			
			while(temp.next != last)
			{
				temp = temp.next;
			}
			last.next = null;
			last = temp;
		}
		last.next = first;
		size--;
	}
	void DeleteAtPos(int ipos)
	{
		if(ipos == 1)
		{
			DeleteFirst();
		}
		else if(ipos == size)
		{
			DeleteLast();
		}
		else
		{
			Node3 temp = first;
			for(int i = 1; i < ipos -1; i++)
			{
				temp = temp.next;
			}
			Node3 temp1 = temp.next;
			temp.next = temp.next.next;
			temp1.next = null;
			size--;
		}
	}
	void Display()
	{
		Node3 temp = first;
		do
		{
			System.out.println(temp.data);
			temp = temp.next;
		}while(temp != last.next);
	}
}

//////////////////////////////////////////////////////////////////////////////////////

class Doubly_Circular_Linked_List_Method
{
	Node4 first;
	Node4 last;
	int size;
	
	public Doubly_Circular_Linked_List_Method()
	{
		first = null;
		last = null;
		size = 0;
	}
	public void InsertFirst(int no)
	{
		Node4 newn = new Node4();
		newn.data = no;
		newn.prev = null;
		newn.next = null;
		
		if(first == null)
		{
			first = newn;
			last = newn;
		}
		else
		{
			newn.next = first;
			newn.next.prev = newn;
			first = newn;
		}
		first.prev = last;
		last.next = first;
		size++;
	}
	public void InsertLast(int no)
	{
		
		Node4 newn = new Node4();
		newn.data = no;
		newn.prev = null;
		newn.next = null;
		
		if(first == null)
		{
			first = newn;
			last = newn;
		}
		else
		{
			last.next = newn;
			last.next.prev = last; // newn.prev = last;
			last = newn;
		}
		last.next = first;
		first.prev = last;
		size++;
	}
	public void InsertAtPos(int ipos,int no)
	{
		if(ipos == 1)
		{
			InsertFirst(no);
		}
		else if(ipos == size+1)
		{
			InsertLast(no);
		}
		else
		{
			Node4 newn = new Node4();
			newn.data = no;
			newn.prev = null;
			newn.next = null;
			
			Node4 temp = first;
			for(int i = 1; i < ipos - 1; i++)
			{
				temp = temp.next;
			}
			newn.next = temp.next;
			newn.next.prev = newn;
			temp.next = newn;
			newn.prev = temp; // temp.next.prev = temp;
			size++;
		}
		last.next = first;
		first.prev = last;
	}
	public void DeleteFirst()
	{
		if(first == null && last == null)
		{
			return;
		}
		else if(first == last)
		{
			first = null;
			last = null;
		}
		else
		{
			first = first.next;
			last.next.prev = null;
			first.prev = null;
		}
		last.next = first;
		first.prev = last;
		size--;
	}
	public void DeleteLast()
	{
		if(first == null && last == null)
		{
			return;
		}
		else if(first == last)
		{
			first = null;
			last = null;
		}
		else
		{
			last.next = null;
			last = last.prev;
			last.next.prev = null;
		}
		last.next = first;
		first.prev = last;
		size--;
	}
	public void DeleteAtPos(int ipos)
	{
		if(ipos == 1)
		{
			DeleteFirst();
		}
		else if(ipos == size)
		{
			DeleteLast();
		}
		else
		{
			Node4 temp = first;
			for(int i = 1; i < ipos-1;i++)
			{
				temp = temp.next;
			}
			temp.next.prev = null;
			temp.next = temp.next.next;
			temp.next.prev.next = null;
			temp.next.prev = temp;
			size--;
		}
	}
	public void Display()
	{
		Node4 temp = first;
		do
		{
			System.out.println(temp.data+" ");
			temp = temp.next;
		}while(temp != last.next);
	}
}

class STL
{
	public static void main(String args[])
	{
		
		Singly_Linear_Linked_List_Methods mobj1 = new Singly_Linear_Linked_List_Methods();
		
		System.out.println("Singly_Linear_Linked_List");
		mobj1.InsertFirst(30);
		mobj1.InsertFirst(20);
		mobj1.InsertFirst(10);
		mobj1.InsertLast(40);
		mobj1.InsertLast(50);
		mobj1.InsertLast(70);
		mobj1.InsertAtPos(6,60);
	
		mobj1.Display();
		System.out.println();
		mobj1.DeleteAtPos(6);
		mobj1.DeleteFirst();
		mobj1.DeleteLast();
		mobj1.Display();
	/////////////////////////////////////////////////////

		Doubly_Linear_Linked_List_Method mobj2 = new Doubly_Linear_Linked_List_Method();
		
		System.out.println("Doubly_Linear_Linked_List");
		mobj2.InsertFirst(30);
		mobj2.InsertFirst(20);
		mobj2.InsertFirst(10);
		mobj2.InsertLast(40);
		mobj2.InsertLast(50);
		mobj2.InsertLast(70);
		mobj2.InsertLast(80);
		mobj2.InsertAtPos(6,60);
	
		mobj2.Display();
		System.out.println();
		mobj2.DeleteAtPos(6);
		mobj2.DeleteFirst();
		mobj2.DeleteLast();
		mobj2.Display();
	/////////////////////////////////////////////////////////

		Singly_Circular_Linked_List_Methods mobj3 = new Singly_Circular_Linked_List_Methods();
		
		System.out.println("Singly_Circular_Linked_List");		
		mobj3.InsertFirst(30);
		mobj3.InsertFirst(20);
		mobj3.InsertFirst(10);
		mobj3.InsertLast(40);
		mobj3.InsertLast(50);
		mobj3.InsertLast(70);
		mobj3.InsertAtPos(6,60);
	
		mobj3.Display();
		System.out.println();
		mobj3.DeleteAtPos(6);
		mobj3.DeleteFirst();
		mobj3.DeleteLast();
		mobj3.Display();
		
	///////////////////////////////////////////////////////////	
	
	Doubly_Circular_Linked_List_Method mobj4 = new Doubly_Circular_Linked_List_Method();
		
		System.out.println("Doubly_Circular_Linked_List");
		mobj4.InsertFirst(30);
		mobj4.InsertFirst(20);
		mobj4.InsertFirst(10);
		mobj4.InsertLast(40);
		mobj4.InsertLast(50);
		mobj4.InsertLast(70);
		mobj4.InsertAtPos(6,60);
	
		mobj4.Display();
		System.out.println();
		mobj4.DeleteAtPos(6);
		mobj4.DeleteFirst();
		mobj4.DeleteLast();
		mobj4.Display();
		
	}
}



