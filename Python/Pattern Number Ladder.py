N=int(input())
s=1
for i in range(1,N+1):
    for j in range(0,i):
        print(s,end=" ")
        s=s+1
    print("")