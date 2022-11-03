with open("biblioteka.txt", "a") as f:
    run = "da"
    while(run == "da"):
        f.write(input("Unesite autora: ") + "|" + input("Unesite ime knjige: ") + "|" + input("Unesite godinu:") + " \n")
        run = input("Da li ima jos knjiga?: ")

with open("biblioteka.txt") as f:
    for k in f.readlines():
        naslov, autor, godina = k.split("|")
        print(f"{naslov:20} | {autor:20} | {godina:4}")