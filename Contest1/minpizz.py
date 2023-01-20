

def GCD(a,b):
    if b==0:
        return a
    return GCD(b, a%b)

t = int(input())
while(t>0):
    t -= 1
    n = int(input())
    k = int(input())
    x = n//GCD(n,k)
    print(x)
    

    