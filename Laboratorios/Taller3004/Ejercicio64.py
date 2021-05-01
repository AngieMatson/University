ContP = 0
Pisadas = int(input())
if Pisadas <= 5:
    print( 1)
elif Pisadas > 5:
    while Pisadas > 0:
        Pisadas = Pisadas - 5
        ContP = ContP + 1 
    print(ContP)