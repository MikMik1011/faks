with open("korImena.txt", "r") as f:
    for user in f.readlines():
        ime, prezime = user.split('|')
        print(f'ime: {ime} \nprezime: {prezime}\n')
        f.close()