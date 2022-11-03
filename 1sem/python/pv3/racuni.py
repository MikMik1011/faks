imenaF = open("korImena.txt")
racuniF = open("racuni.txt")
statsF = open("statistika.txt", "a")

for ime in imenaF.readlines():
    racuni = list(map(int, racuniF.readline().split("|")))
    suma = sum(racuni)
    statsF.write(ime.split("|")[0] + "|" + str(suma) + "|" + str(suma / len(racuni)) + "\n")

imenaF.close()
racuniF.close()
statsF.close()