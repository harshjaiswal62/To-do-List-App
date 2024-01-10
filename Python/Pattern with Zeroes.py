N=int(input())
s=2
e=2
for i in range(1,N+1):
    for j in range(1,i+1):
        if(i>2 and j>=2 and j<=e):
            print(0,end=" ")
        else:
            print(i,end=" ")
    if(i>2):
        e=e+1
    print("")
