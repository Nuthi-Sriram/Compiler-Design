# l = [['E'],['T'],['F']]  # lhs of grammar
# R = [ ['A','a'],['B']] #rhs of grammar
#R = [ [ 'A','a'], ['A','b'],['A','c'], ['B'],['C'],['D'] ]
l = ['E']
l1=['T']
l2=[['F']]
R = [['E','+','T'],['T']]
R1 = [['T','*','F'],['F']]
R2=[['id']]
nl = []  # new left
nl1 = []  
nR = []  # new Right
nR1 = []  
nRightWithRecursion = []  # new Right side Grammar with Recursion, has Recursion
nRightWithRecursion1 = []
fR = [nR, nRightWithRecursion]  # to print, list for new Right
fR1 = [nR1, nRightWithRecursion1] 

lenR = len(R)  # length of right side
lenR1 = len(R1)
lenL = len(l)
lenL1 = len(l1)
lenInnerList = 0

for i in range(lenR):  # iright grammar
    lenInnerList = len(R[i])

    for j in range(lenL):  # at inner grammar, to compare left with right grammar
        # print [ 'R', R,'i',i,'j',j ] #debug print
        if(l[j] == R[i][j]):  # same symbol on left, right inner grammar
            R[i].pop(0)
            nRightWithRecursion.append(R[i])
        else:
            nR.append(R[i])  # take where there is no left recursion
            break  # not equal don't do anything, move to next or grammar

# add new variables where there is no left recursion
# -------------------------------------------------
nVar = 'E1'  # new variable for left and right

lenNewRight = len(nR)
nl.append([l[0]])  # adding a list, previous left

for i in range(lenNewRight):
    nR[i].append(nVar)

lenNewRightWithRec = len(nRightWithRecursion)
# add next symbol, new left symbol, new grammar, contains right recursion's lhs
nl.append([nVar])

for i in range(lenNewRightWithRec):
    nRightWithRecursion[i].append(nVar)

nRightWithRecursion.append(['epsilon'])  # empty string at converted right recursion

# -------------------------------------------------


#code for the second production rule
for i in range(lenR1):  # iright grammar
    lenInnerList = len(R1[i])

    for j in range(lenL1):  # at inner grammar, to compare left with right grammar
        # print [ 'R', R,'i',i,'j',j ] #debug print
        if(l1[j] == R1[i][j]):  # same symbol on left, right inner grammar
            R1[i].pop(0)
            nRightWithRecursion1.append(R1[i])
        else:
            nR1.append(R1[i])  # take where there is no left recursion
            break  # not equal don't do anything, move to next or grammar

# add new variables where there is no left recursion
# -------------------------------------------------
nVar1 = 'T1'  # new variable for left and right

lenNewRight1 = len(nR1)
nl1.append([l1[0]])  # adding a list, previous left

for i in range(lenNewRight1):
    nR1[i].append(nVar1)

lenNewRightWithRec1 = len(nRightWithRecursion1)
# add next symbol, new left symbol, new grammar, contains right recursion's lhs
nl1.append([nVar1])

for i in range(lenNewRightWithRec1):
    nRightWithRecursion1[i].append(nVar1)

nRightWithRecursion1.append(['epsilon'])  # empty string at converted right recursion


# print R
# print nR
# print nRightWithRecursion

print(nl[0], "===>", fR[0])
print(nl[1], "===>", fR[1])
print(nl1[0], "===>", fR1[0])
print(nl1[1], "===>", fR1[1])
print(l2[0], "===>", R2[0])