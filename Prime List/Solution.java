class Solution {
    static boolean isPrime(int num)
    {
        if(num==1)
        {
            return false;
        }
        
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    
    Node primeList(Node head) {
        
        Node cur=head;
        while(cur!=null)
        {
            if(isPrime(cur.val))
            {
                cur=cur.next;
                continue;
            }
            if(cur.val==1)
            {
                cur.val=2;
                continue;
            }
            
            int num=cur.val;
            int num1=num-1,num2=num+1;
            
            while(!isPrime(num1))
            {
                num1--;
            }
            
            while(!isPrime(num2))
            {
                num2++;
            }
            
            if((num-num1) <= (num2-num))
            {
                cur.val=num1;                
            }
            else
            {
                cur.val=num2;
            }
            
            cur=cur.next;
        }
        
        return head;
    }
}