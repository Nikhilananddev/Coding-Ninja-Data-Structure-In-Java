public static DoubleNode reverseLLBetter(Node<Integer> head){
if(head == null || head.next == null){
DoubleNode ans = new DoubleNode();
ans.head = head;
ans.tail = head;
return ans;

}

DoubleNode smallAns = reverselLBetter(head.next);
smallAns.tail.next = head;
head.next = null;

DoubleNode ans = new DoubleNode();
ans.head = smallAns.head;

ans.tail = head;

return ans;

}
