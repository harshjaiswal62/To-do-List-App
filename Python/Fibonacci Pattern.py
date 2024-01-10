N=int(input())
a=0
b=1
for i in range(N):
    for j in range(i+1):
        if(i<2 and j==0):
            print(i,end=" ")
        else:
            f=a+b
            a=b
            b=f
            print(f,end=" ")
    print("")
        