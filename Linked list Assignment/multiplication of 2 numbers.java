import java.util.*;
class Node 
{
    int data;
    Node next;
}
public class Main
{
    public static Node append(int data,Node head)
    {
        Node nn = new Node();
        nn.data = data;
        nn.next = null;
        Node temp = head;
        if(head==null)
        {
            return nn;
        }
        else
        {
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = nn;
            return head;
        }
    }
    public static void display(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void multiplyTwoNumbers(Node l1,Node l2)
    {
        int n1=0,n2=0,mul=0;
        while(l1!=null)
        {
            n1 = (n1*10)+l1.data;
            l1 = l1.next;
        }
        while(l2!=null)
        {
            n2 = (n2*10)+l2.data;
            l2 = l2.next;
        }
        mul = n1*n2;
        Node ans = null;
        while(mul>0)
        {
            Node nn = new Node();
            nn.data = mul%10;
            nn.next = null;
            mul/=10;
            if(ans==null)
                ans=nn;
            else
            {
                nn.next = ans;
                ans = nn;
            }
        }
        display(ans);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		Node l1=null,l2=null;
		for(int i=0;i<n1;i++)
		{
		    int data = sc.nextInt();
		    l1=append(data,l1);
		}
		int n2 = sc.nextInt();
		for(int i=0;i<n2;i++)
		{
		    int data = sc.nextInt();
		    l2=append(data,l2);
		}
		multiplyTwoNumbers(l1,l2);
	}
}
