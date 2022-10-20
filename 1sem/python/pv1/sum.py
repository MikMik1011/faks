def readN(msg):
    n = 0
    while (n < 1):
        n = int(input(msg))

    return n

n = readN("Unesite prirodan broj: ")

s = 0 

for i in range(1, n + 1):
    s += 1 / i

print(f'Suma iznosi {s}')