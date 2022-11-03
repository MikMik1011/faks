with open("korImena.txt", "a") as f:
    run = True
    while run:
        f.write(input("korisnicko ime: ") + "|" + input("lozinka: ") + "\n")
        run = input("Da li ima jos korisnika (Enter za kraj):")