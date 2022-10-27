n = int(input("Unesite broj: "))
print('\n')
for i in range(1, n + 1):
    #print(f'{i:3}{i ** 2 : 4}{i ** 3 : 5}')
    print(i, i ** 2, i ** 3, sep='\t')