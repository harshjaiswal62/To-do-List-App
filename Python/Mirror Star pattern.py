N=int(input())
s=N//2
e=N//2
for i in range(N):
    for j in range(N):
        if(j>=s and j<=e):
            print("*",end=" ")
        else:
            print(" ",end=" ")
    if(i<N//2):
        s=s-1
        e=e+1
    else:
        s=s+1
        e=e-1
    print("")