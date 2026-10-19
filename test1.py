list1=[1,2,3,4]
list1.append(5)
print(list1)
t1=(1,2,3,4,5,6,6)
print(t1[0])
print(t1[2:4])
print(t1[:4])
print(t1[2:])
print(len(t1))
print(t1.count(6))
print(6 in t1)
t2=(7,8,9,10)
print("value of tuple 2:",t2)
t3=t1+t2
print("concate tuple is:",t3)

class Student:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def display(self):
        print("name:",self.name)
        print("age:",self.age)

s1=Student("riya",25)
s1.display()
s2=Student("diya",24)
s2.display()

class bank:
    def __init__(self,__balance):
        self. __balance=__balance
    def deposite(self, amount):
        self.__balance+=amount

    def display(self):
        print("balance:",self.__balance)
b1=bank(5000)
b1.deposite(500)
b1.display()