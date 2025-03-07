class Solution {
    public boolean compute(Node root) {
        StringBuilder c1=new StringBuilder();
        StringBuilder c2=new StringBuilder();
        
        Node current=root;
        while(current!=null)
        {
            c1.append(current.data);
            current=current.next;
        }
        
        current=root;
        Node prev=null;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        current=prev;
        while(current!=null)
        {
            StringBuilder str=new StringBuilder(current.data);
            c2.append(str.reverse().toString());
            current=current.next;
        }
        
        if (c1.length() != c2.length())
        {
            return false;
        }
        for (int i = 0; i < c1.length(); i++) {
            if (c1.charAt(i) != c2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}