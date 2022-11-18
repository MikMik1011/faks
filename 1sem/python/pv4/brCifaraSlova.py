rec = input()
digCount = 0
letCount = 0
for c in rec:
    if (c.isdigit()):
        digCount += 1
    elif(c.isalpha()):
        letCount += 1

print(f'Broj cifara: {digCount}')
print(f'Broj slova: {letCount}')
               