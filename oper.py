t1=(10,20,30,40,50)
print(type(t1))
print(t1)
print(t1[1:3])
print(t1[:4])
print(len(t1))
print(t1.count(40))
print(t1.index(20))
print(20 in t1)
print(42 in t1)

t2=(80,70,60)
t3=t1+t2
print("Concatinated",t3)
print(sorted(t3))
print(t3*2)

print("Maximum",max(t3))
print("Minimum",min(t3))

l1=[10,20,30]
print(tuple(l1))

class Student:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def display(self):
        print("name:",self.name)
        print("age:",self.age)

s1=Student("riya",25)
s1.display()


class ATM:
    def __init__(self,__balance):
        self. __balance=__balance
    def deposite(self, amount):
        self.__balance+=amount

    def display(self):
        print("balance:",self.__balance)
b1=ATM(5000)
b1.deposite(500)
b1.display()

class Parent:
    def parent(self):
        print("from parent class")
class Child(Parent):
    def child(self):
        print("from child class")

c=Child()
c.child()
c.parent()

class petanimal:
    def petanimal(self):
        print("dog,cat")
class wildanimal(petanmal):
    def

        