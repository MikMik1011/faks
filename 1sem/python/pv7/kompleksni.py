class Kompleksni:
    def __init__(self, _r, _im) -> None:
        self.r = _r
        self.im = _im

    def saberi(self, komp2):
        return Kompleksni(self.r + komp2.r, self.im + komp2.im)

    def __str__(self) -> str:
        return f"{self.r} + {self.im}i"

a = Kompleksni(2, 3)
b = Kompleksni(4,5)
c = a.saberi(b)
print(c)