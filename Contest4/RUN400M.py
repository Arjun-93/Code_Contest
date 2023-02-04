# cook your dish here

t = int(input())
while(t>0):
    t = t-1
    X = int(input())
    Y = int(input())
    Z =  int(input())
    
    if  400//X >400//Y & 400//X > 400//Z :
        print("Alice")
    elif 400//Y > 400//X & 400//Y > 400//Z :
        print("Bob")
    else:
        print("Charlie")