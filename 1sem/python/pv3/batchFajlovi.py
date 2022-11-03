ulazni = open("imeprezime.txt", "r")
izlazni = open("lozinke.txt", "a")
for linija in ulazni.readlines():
    ime, prezime = linija.split(" ")
    korisnickoIme = ime[:1] + prezime[:7]
    izlazni.write(korisnickoIme)

ulazni.close()
izlazni.close()