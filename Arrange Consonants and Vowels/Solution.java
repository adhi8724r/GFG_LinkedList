class Solution {
    
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        Node vowel=new Node('a');
        Node consonant=new Node('b');
        
        Node v1=vowel;
        Node c1=consonant;
        
        Node current=head;
        while(current!=null)
        {
            switch(current.data)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowel.next=current;
                    vowel=vowel.next;
                    break;
                default:
                    consonant.next=current;
                    consonant=consonant.next;
            }
            current=current.next;
        }
        vowel.next=null;
        consonant.next=null;
        
        vowel.next=c1.next;
        return v1.next;
    }
}