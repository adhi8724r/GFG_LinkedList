class Solution{
    public static Node reverse(Node head)
    {
        Stack<Integer> stack=new Stack<Integer>();
        Node current=head;
        while(current!=null)
        {
            stack.push(current.data);
            current=current.next;
        }
        current=head;
        while(current!=null)
        {
            current.data=stack.pop();
            current=current.next;
        }
        return head;
    }
   
    static Node addTwoLists(Node num1, Node num2){
        
        num1=reverse(num1);
        num2=reverse(num2);
        
        Node sum1=new Node(0);
        Node current=sum1;
        int carry=0;
        while(num1!=null || num2!=null ||carry!=0)
        {
            Node newNode;
            int sum=carry;
            if(num1!=null && num2!=null)
            {
                sum+=num1.data+num2.data;
                newNode=new Node(sum%10);
                carry=sum/10;
                num1=num1.next;
                num2=num2.next;
            }
            else if(num1!=null)
            {
                sum+=num1.data;
                newNode=new Node(sum%10);
                carry=sum/10;
                num1=num1.next;
            }
            else if(num2!=null)
            {
                sum+=num2.data;
                newNode=new Node(sum%10);
                carry=sum/10;
                num2=num2.next;
            }
            else
            {
                newNode=new Node(sum);
                carry=sum/10;
            }
            sum1.next=newNode;
            sum1=sum1.next;
        }
        current=reverse(current.next);
        while(current.data==0 && current.next!=null)
        {
            current=current.next;
        }
        return current;
    }
}