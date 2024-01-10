def fact(num):
    i=1
    f=1
    while(i<=num):
        f=f*i
        i+=1
    return f

N=int(input())
j=0
while(j<N):
    k=0
    while(k<j+1):
        pas=fact(j)//(fact(k)*fact(j-k))
        print(pas,end=" ")
        k+=1
    j+=1
    print("")