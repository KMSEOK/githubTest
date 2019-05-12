#링크드 리스트# get_at 메소드, search 메소드, delete_at 메소드, remote 메소드, get_size 메소드 추가 2019/05/12
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
        self.tail = None # tail 추가
        self.size = 0
        
    def append(self, data):
        new_node = Node(data)
        self.size += 1
        if self.header is None:
            self.header = new_node
        else:
            self.tail.set_next(new_node)
        self.tail = new_node

            
    
    def print_list(self):
        print("-------------")
        node = self.header
        if node is None:
            print("None")
        else:
            while node is not None:
                print(node.get_data())
                node=node.get_next()
        print("-------------")

    def get_at(self,index):
        if index >= self.size:
            return None
        else:
            node = self.header
            for i in range(0,index):
                node = node.get_next()
            return node
                

    def search(self,data):
        node = self.header
        while node is not None:
            if node.get_data() == data:
                return node
            node = node.get_next()
        return node
    
    
    def delete_at(self, index):
        node = self.header  # node는 현재 인덱스 0번째인 apple
        self.size -= 1   # delete 실행시 size 감소
        for i in range(0,index):  # input된 index만큼 header에서 움직임
            prev = node
            node = node.get_next()
        
        if index == 0:
            self.header = self.header.get_next()  #header의 다음을 가져와 header에 저장
            
            
        else:
            #a=node.get_data() # 현재 인덱스 2의 데이터를 가져와라
            #print(a)
            prev.set_next(node.get_next()) # 인덱스2의 next를 prev의 다음 next로 지정
            

    def remove(self,data):
        curr = self.header
        prev = None
        found = False
        self.size -= 1
        while not found:
            if curr.get_data() == data:
                found = True
            else:
                prev =curr
                curr = curr.get_next()
        if prev == None:
            self.header = curr.get_next()
        else:
            prev.set_next(curr.get_next())
    
    def get_size(self):
        print("현재 데이터 숫자는 ", self.size, "입니다")
        return self.size
     
     
     
sll=Simply_linked_list()
sll.append("apple")   # append 리스트 추가
sll.append("Kiwi")
sll.append("banana")
sll.append("kim")
sll.append("yee")
sll.append("min")
sll.print_list()  # 리스트 목록 출력

node = sll.get_at(2) #인덱스 찾기
if node is None:
    print("index error")
else:
    print(node.get_data())


sll.delete_at(0)      # index 삭제 
node = sll.search("apple") # 서치 data 찾기
if node is None:
    print("i did't have it")
else:
    print(node.get_data())


sll.remove("banana") # data 입력으로 삭제
sll.print_list()