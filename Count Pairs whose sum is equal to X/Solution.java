class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        HashSet<Integer> h1 = new HashSet<>();
        
        int count=0;
        for(Integer i: head1)
        {
            h1.add(i);
        }
        
        for(Integer i: head2)
        {
            if(h1.contains(x-i))
            {
                count+=1;
            }
        }
        return count;
    }
}