N=int(input())
s=N//2
e=N//2
for i in range(N):
	for j in range(N):
		if(i>=1 and i<N-1 and j>=s and j<=e):
			print(" ",end="")
		else:
			print("*",end="")
	if(i>=1 and i<N//2):
		s=s-1
		e=e+1
	else:
		if(i>=N//2 and i<N-1):
			s=s+1
			e=e-1
	print("")