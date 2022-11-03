with open("studenti.txt") as f:
    rbr = 0
    for student in f.readlines():
        rbr += 1
        ime, prezime, indeks, rodjendan, ocene = student.split(" ")[:-1]
        ocene = list(map(float, ocene.split(",")))
        prosek = sum(ocene) / len(ocene)
        print(f"{rbr:5}|{ime:10}|{prezime:15}|{indeks:8}|{prosek:8.2f}")