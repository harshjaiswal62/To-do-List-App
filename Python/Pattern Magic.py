N=int(input())
su=(N*2)-1
s=su//2
e=su//2
for i in range(su):
	for j in range(su):
		if(i>=1 and i<su-1 and j>=s and j<=e):
			print(" ",end="")
		else:
			print("*",end="")
	if(i>=1 and i<su//2):
		s=s-1
		e=e+1
	else:
		if(i>=su//2 and i<su-1):
			s=s+1
			e=e-1
	print("")