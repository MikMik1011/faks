import math

a = int(input("Unesite koeficijent a: "))
b = int(input("Unesite koeficijent b: "))
c = int(input("Unesite koeficijent c: "))

d = math.sqrt(b ** 2 - 4 * a * c)
x1 = (-b + d) / (2 * a)
x2 = (-b - d) / (2 * a)

print(f'Resenja jednacine su {x1} i {x2}')