N=int(input())
con=N*2
c=N
for i in range(N):
    for j in range(1,con):
        if(j>=c):
            if(i>=1 and i<(N-1) and j>=c+1 and j<con-1):
                print(" ",end="")
            else:
                print("*",end="")
        else:
            print(" ",end="")
    c=c-1
    con=con-1
    print("")