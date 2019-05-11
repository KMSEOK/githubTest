#링크드 리스트
class Node:
    
    def __init__(self, data):
        self.data = data
        self.next = None
        
    def get_data(self):
        return self.data
    
    def get_next(self):
        return self.next
    
    def set_next(self, next):
        self.next = next
        
class Simply_linked_list:
    
    def __init__(self):
        self.header = None
        self.size = 0
        
    def append(self, data):
        new_node = Node(data)
        self.size += 1
        if self.header is None:
            self.header = new_node
        else:
            node = self.header
            while node.get_next() is not None:
                node = node.get_next()
            node.set_next(new_node)
    
    def print_list(self):
        node = self.header
        if node is None:
            print("None")
        else:
            while node is not None:
                print(node.get_data())
                node=node.get_next()


    
sll=Simply_linked_list()
sll.append("apple")
sll.append("Kiwi")
sll.append("banana")
sll.print_list()



    
        