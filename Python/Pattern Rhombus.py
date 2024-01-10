N=int(input())
c=N*2
s=(c//2)-1
e=(c//2)-1
va=1
for i in range(1,c):
    su=va
    for j in range(c-1):
        if(j>=s and j<=e):
            print(su,end=" ")
            if(j<(c//2)-1):
                su=su+1
            else:
                su=su-1
        else:
            print(" ",end=" ")
    if(i<(c//2)):
        s=s-1
        e=e+1
        va=va+1
    else:
        s=s+1
        e=e-1
        va=va-1
    print("")