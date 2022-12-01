def unesiNiz():
    niz = []
    while True:
        x = input()
        if (x == "."):
            break
        niz.append(int(x))
    return niz

def karakteristikeNiza(niz):
    print(f"Najveci element niza je: {max(niz)}")
    print(f"Najmanji element niza je: {min(niz)}")
    suma = sum(niz)
    print(f"Suma niza je: {suma}")
    print(f"Prosek niza je: {suma / len(niz)}")

def main():
    niz = unesiNiz()
    print(niz)
    karakteristikeNiza(niz)

if(__name__ == "__main__"):
    main()   