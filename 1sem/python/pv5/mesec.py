meseci = ["januar", "februar", "mart", "april", "maj", "jun", "jul", "avgust", "septembar", "oktobar", "novembar", "decembar"]

dan, mesec, godina = list(map(int, input()[:-1].split(".")))


assert mesec > 0 and mesec <= 12, "Nevalidan mesec"

assert dan > 0, "Nevalidan dan"
if mesec in [1, 3, 5, 7, 8, 10, 12]:
    assert dan <= 31, "Nevalidan dan"
elif mesec in [4, 6, 9, 11]:
    assert dan <= 30, "Nevalidan dan"
else:
    if (godina % 4 == 0):
        assert dan <= 29, "Nevalidan dan"
    else:
        assert dan <= 28, "Nevalidan dan"


mesec = meseci[int(mesec) - 1]
print(f"{dan}. {mesec} {godina}.")