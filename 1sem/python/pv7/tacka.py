import math

class Tacka:
    def __init__(self, _x, _y) -> None:
        self.x = _x
        self.y = _y 
    
    def rastojanje(self, t2):
        return math.sqrt(((self.x - t2.x) ** 2) + ((self.y - t2.y) ** 2))

class Krug:
    def __init__(self, _centar, _r) -> None:
        self.centar = _centar
        self.r = _r

    def pripada(self, t):
        return (t.rastojanje(self.centar) <= self.r)

t = Tacka(1, 2)
k = Krug(t, 3)
print(k.pripada(Tacka(1, 4)))
print(k.pripada(Tacka(1, 69)))
