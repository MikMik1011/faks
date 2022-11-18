repeat = True
br = []

while repeat:
    br.append(int(input("Unesite broj: ")))
    repeat = input()

pbr = []
nbr = []
for i in br:
    if (i % 2):
        nbr.append(i)
    else:
        pbr.append(i)

pbr = list(set(pbr))
nbr = list(set(nbr))

print("Najveci broj:", max(br))
print("Najmanji broj:", min(br))