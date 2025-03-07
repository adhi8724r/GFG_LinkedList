public static ArrayList<Integer> displayList(Node head)
{
    ArrayList<Integer> a = new ArrayList<Integer>();
    while(head != null)
    {
        a.add(head.data);
        head=head.next;
    }
    return a;
}