def lcs(X, Y,m,n):
    if m == 0 or n == 0:
       return 0;
    elif X[m-1] == Y[n-1]:
       return 1 + lcs(X, Y, m-1, n-1);
    else:
       return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));

def left_factoring(grm):
	small_prod = ""
	for key in grm.copy(): 
		item = grm[key]
		mi = len(item[0])
		for prod in item:
			if mi >len(prod):
				mi= len(prod)
				small_prod = prod
		for prod in item:
			x = lcs(prod , small_prod,len(prod),len(small_prod))		
			if mi>=x:
				mi = x
		if(x>0):
			c=0
			for p in item:
				fac=p[0:mi]
				grm[key][c]=p[mi:]
				c=c+1	
			grm.update({key+"'":[fac]})
	print (grm)
grammar = {}
lis = list()
le =int(input("length"))

for i in range(0,le):
	key = input("key")
	l = int(input("number of production"))
	lis = list()
	for i in range(0,l):
		lis.append(input())
	grammar.update({key:lis})

print ("the given grammar\n",grammar)
print ("After left factoring")
left_factoring(grammar)