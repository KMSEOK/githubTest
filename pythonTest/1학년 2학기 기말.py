class Book:
    
    def __init__(self,title):
        self.title =title
        self.reader = []
    
    def get_title(self):
        return self.title
    
    
    def get_readers(self):
        return self.reader
    
    def add_reader(self, reader):
        self.reader.append(reader)
        
class Reader:
    
    def __init__(self, name,age):
        self.name = name
        self.age = age
        
    def get_name(self):
        return self.name
                
book1 = Book("어린왕자")
book2 = Book("마지막 잎새")
book3 = Book("토익")

reader_1 = Reader("Kim",10)
reader_2 = Reader("Lee",10)
reader_3 = Reader("Park",20)
reader_4 = Reader("Choi",30)
reader_5 = Reader("Hwang",40)

book1.add_reader(reader_1)
book1.add_reader(reader_2)



book2.add_reader(reader_2)
book2.add_reader(reader_3)
book2.add_reader(reader_4)



book3.add_reader(reader_4)
book3.add_reader(reader_5)



print("1.첫번째 문제  마지막잎세를 읽은 사람 출력")
list = book2.get_readers()
for i in list:

    print(i.get_name())

print("-------------------")

print("2.두번째 문제 'Lee'가 읽은 책 출력")
book1_reader = book1.get_readers()
book2_reader = book2.get_readers()
for book_1 in book1_reader:    
    if book_1.get_name() in reader_2.get_name():
        print(book1.get_title())
        
        
for book_2 in book2_reader:
    if book_2.get_name() in reader_2.get_name():
        print(book2.get_title())    

print("-------------------")
print("3.세번째 문제 가장많이 읽은 책 출력")
if len(book1.get_readers()) > len(book2.get_readers()) and len(book1.get_readers()) > len(book3.get_readers()): 
    print(book1.get_title())
    
elif len(book2.get_readers())> len(book1.get_readers()) and len(book2.get_readers()) > len(book3.get_readers()):
    print(book2.get_title())
    
else:
    print(book3.get_title())    
    
print("-------------------")