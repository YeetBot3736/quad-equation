def quadratic(a,b,c):
    from math import sqrt
    s = []
    if b*b < 4 * a * c:
        return s
    elif b * b == 4 * a * c:
        r = 2 * a
        t = 0 - b
        n = r / t
        s.append(n)
        return s
    else:
        r = 2 * a
        t = 0 - b
        n = b * b
        h = 4 * a * c
        n -= h
        n = sqrt(n)
        fi = (t + n)/r
        se = (t - n)/r
        s.append(fi)
        s.append(se)
        return s
v = input().split()
if len(v) != 3:
    print("Invalid input")
    exit()
try:
    for i in range(3):
        v[i] = eval(v[i])
except:
    print("Invalid input")
    exit()
if v[0] == 0:
    print("a cannot be equal to 0!")
    exit()
n = quadratic(v[0],v[1],v[2])
if not n:
    print("IMAGINARY SOLUTIONS ARE NOT SUPPORTED!")
    exit()
for i in range(len(n)):
    print(n[i], end = "" )
    if i != len(n) - 1:
        print(" or ", end = "")
