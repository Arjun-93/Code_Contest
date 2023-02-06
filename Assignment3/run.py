
def getNthNodeFromEnd(head, n):
    #write your code here
    if head is None:
        return None
    temp = head
    length = 0
    while temp is not None:
        length += 1
        temp = temp.next
    if n > length:
        return None
    temp = head
    for i in range(0, length - n):
        temp = temp.next
    return temp.data

def main():
    t = int(input())
    while(t > 0):
        n = int(input())
        arr = [int(x) for x in input().strip().split()]
        head = None
        for i in arr:
            if head is None:
                head = Node(i)
            else:
                head.insert(i)
        n = int(input())
        print(getNthNodeFromEnd(head, n))
        t -= 1

#create class Node

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
    def insert(self, data):
        if self.next is None:
            self.next = Node(data)
        else:
            self.next.insert(data)
            
    def printList(self):
        print(self.data)
        if self.next is not None:
            self.next.printList()
