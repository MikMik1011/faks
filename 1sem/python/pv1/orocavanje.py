glavnica = float(input("Unesite glavnicu: "))
kamata = float(input("Unesite kamatu: ")) / 100

#print(glavnica * ((1 + kamata) ** 10)) # LOOPLESS I JEFTINIJI NACIN

for i in range(0, 10):
    glavnica *= (1 + kamata)

print(f'Iznos posle 10 godina je: {glavnica}')