N=int(input())
if(N==1):
    print("1")
else:
    c=N+(N-1)
    s=c//2
    e=c//2
    for i in range(1,N+1):
        v=i
        for j in range(0,c):
            if(j>=s and j<=e):
                print(v,end=" ")
                if(j<c//2):
                    v=v+1
                else:
                    v=v-1
            else:
                print(" ",end=" ")
        s=s-1
        e=e+1
        print("")