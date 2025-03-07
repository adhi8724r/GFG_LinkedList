class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        long n1=0,n2=0;
        long mod=1000000007;
        
        Node num1=first;
        Node num2=second;
        
        while(num1!=null)
        {
            n1 = ((n1*10) + num1.data)%mod;
            num1=num1.next;
        }
        while(num2!=null)
        {
            n2 = (n2*10 + num2.data)%mod;
            num2=num2.next;
        }
        return (n1*n2)%mod;
    }
}