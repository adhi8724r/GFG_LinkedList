class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        Node head=new Node(0);
        Node current=head;
        Node list1=arr[0];
        if(K==1)
        {
            return arr[0];
        }
        for(int i=1;i<K;i++)
        {
            Node list2=arr[i];
            while(list1!=null && list2!=null)
            {
                if(list1.data<list2.data)
                {
                    current.next=list1;
                    list1=list1.next;
                }
                else
                {
                    current.next=list2;
                    list2=list2.next;
                }
                current=current.next;
            }
            if(list1!=null)
                current.next=list1;

            if(list2!=null)
                current.next=list2;
                
            while(current.next!=null)
            {
                current=current.next;
            }
            
            list1=head.next;
            current=head;
        }
        return head.next;
    }
}