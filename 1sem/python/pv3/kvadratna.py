a = int(input("Unesite koeficijent a: "))
b = int(input("Unesite koeficijent b: "))
c = int(input("Unesite koeficijent c: "))

d2 = b**2 - 4 * a * c
if d2 < 0:
    print("Nema realnih resenja")
elif d2 == 0:
    x = -b / 2 * a
    print(f"Ima jedno realno resenje: {x}")
else:
    d = d2 ** 0.5
    x1 = (-b + d) / (2 * a)
    x2 = (-b - d) / (2 * a)

    print(f"Resenja jednacine su {x1} i {x2}")
