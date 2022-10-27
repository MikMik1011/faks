with open("korImena.txt", "a") as f:
    f.write(input("korisnicko ime: ") + "|" + input("lozinka: ") + "\n")
    f.close()