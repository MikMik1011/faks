import math
r = float(input("Unesite poluprecnik kruga: "))
p = (r ** 2) * math.pi

print(f'Povrsina sa svim decimalama: {p}')
print(f'Povrsina zaokruzena na 3 decimale: {p:.3f}')