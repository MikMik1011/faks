msg = input("Unesite poruku za dekodiranje: ")
for i in msg.split(' '):
    print(chr(int(i)), end='')