N=int(input())
c=(N*2)+1
s=0
s1=0
e=c-1
e1=c-1
for i in range(c):
    if(i<=(c//2)):
        p=5-i
    else:
        p=i-5
    for j in range(c):
        if(i>=1 and i<c and ((j>=s and j<=s1) or (j>=e1 and j<=e))):
            print(" ",end=" ")
        else:
            if(j<(c//2)):
                print(p,end=" ")
                p-=1
            else:
                print(p,end=" ")
                p+=1
    if(i>=1 and i<c//2):
        s1+=1
        e1-=1
    else:
        if(i>=c//2 and i<c-1):
            s1-=1
            e1+=1
    print("")
