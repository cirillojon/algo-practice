class Node:
    def __init__(self, k ,v):
        self.key = k
        self.val = v
        self.next = None
        self.prev = None

class LRUCache(object):
    def __init__(self, capacity):
        self.cap = capacity
        self.map = {}
        self.head = Node(0,0)
        self.tail = Node(0,0)
        self.head.next = self.tail
        self.tail.prev = self.head
    
    def get(self, key):
        if key in self.map:
            temp = self.map[key]
            self.remove(temp)
            self.insert(temp)
            return temp.val
        return -1
    
    def put(self, key, value):
        if key in self.map:
            self.remove(self.map[key])
        if len(self.map) == self.cap:
            self.remove(self.tail.prev)
        self.insert(Node(key, value))


    def insert(self, node):
        self.map[node.key] = node
        node.next = self.head.next
        node.next.prev = node
        self.head.next = node
        node.prev = self.head
    
    def remove(self, node):
        del self.map[node.key]
        node.next.prev = node.prev
        node.prev.next = node.next

p = LRUCache(6)
p.put(3,4)
p.put(4,5)
print(p.get(4))