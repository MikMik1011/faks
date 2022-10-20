"""

# REKURZIJA

def fakt(n):
    if n > 2:
        return n * fakt(n - 1)
    else:
        return n 

f = fakt(int(input("Unesite broj: ")))
print(f'Faktorijel iznosi {f}')

"""

# FOR PETLJA

n = int(input("Unesite broj: "))
f = 1

for i in range (1, n + 1):
    f *= i

print(f'Faktorijel iznosi {f}')