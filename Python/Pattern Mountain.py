N=int(input())
s=2
e=(N*2)-2
for i in range(N):
    v=1
    for j in range(1,N*2):
        if(i<N-1 and j>=s and j<=e):
            print(" ",end="")
        else:
            if(j<=(N*2)//2):
                print(v,end="")
                v+=1
            else:
                if(i==N-1 and j==((N*2)//2)+1):
                    v-=2
                    print(v,end="")
                else:
                    v-=1
                    print(v,end="")
    s+=1
    e-=1
    print("")