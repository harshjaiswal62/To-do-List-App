N=int(input())
c=(N*2)+1
s=1
e=c-2
for i in range(c):
    p=5
    for j in range(c):
        if(j>=s and j<=e):
            print(" ",end=" ")
        else:
            if(j<(c//2)-1):
                print(p,end=" ")
                p-=1
            else:
                p+=1
                print(p,end=" ")
    if(i<c//2):
        s+=1
        e-=1
    else:
        s-=1
        e+=1  
    print("")
