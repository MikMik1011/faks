prva = (int(input("x1: ")), int(input("y1: ")))
druga = (int(input("x2: ")), int(input("y2: ")))

p = abs(prva[0] - druga[0]) * abs(prva[1] - druga[1])

print(f'Povrsina pravougaonika iznosi: {p}')
