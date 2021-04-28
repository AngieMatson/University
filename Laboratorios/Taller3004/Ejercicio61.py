n = int(input())
for i in range(0,n):
    x=str(input())
    y=len(x)
    if y > 10:
        print(x[0], end='')
        print(y-2, end='')
        print(x[y-1])
    else:
        print(x)