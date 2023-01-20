# t = int(input())
# for i in range(t):
#     n = input()
#     flag = 0
#     for j in range(len(n)):
#         if(n[j]=="7"):
#             flag = 1
#             break
#         else :
#             continue
#     if(flag==1):
#         print("YES")
#     else:
#         print("NO")



# t = int(input("Enter the number of test cases: "))

# for i in range(t):
#     n = int(input("Enter the number of elements in Array: "))
#     y = int(input("OR value of array: "))
#     arr = []
#     for j in range(n):
#         a = int(input())
#         arr.append(a)
#     oor = 0
#     for j in range(n):
#         oor = oor | arr[j]
        
#     if(y-oor>0):
#         print(y-oor)
#     elif(y-oor==0):
#         print(0)
#     else:
#         print(-1)

# def min_x(A, Y):
#     or_result = A[0]
#     for i in range(1,len(A)):
#         or_result |= A[i]
#     min_x = Y
#     for i in range(32):
#         if (min_x & (1 << i)) == 0 and (or_result & (1 << i)) == 0:
#             min_x |= (1 << i)
#     if min_x > or_result and min_x >= 0:
#         return min_x
#     else:
#         return -1
    
def min_x(A, Y):
    or_result = A[0]
    for i in range(1,len(A)):
        or_result |= A[i]
    min_x = 0
    if Y < or_result:
        return -1
    elif(Y == or_result):
        return 0
    else: 
        for i in range(32):
            if ((or_result >> i) & 1) == 0 and ((Y >> i) & 1) == 1:
                return min_x

t=int(input())
while(t>0):
    t=t-1
    n,y=map(int,input().split())
    A=list(map(int,input().split()))
    print(min_x(A,y))




        














