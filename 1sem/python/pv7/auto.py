class Auto:
    def __init__(self, _naziv, _boja, _vrsta, _cena) -> None:
        self.naziv = _naziv
        self.boja = _boja
        self.vrsta = _vrsta
        self.cena = _cena

    def __str__(self) -> str:
        return f"Naziv: {self.naziv} \nBoja: {self.boja} \nVrsta: {self.vrsta} \nCena: {self.cena}"

print(Auto("Bugatti", "bakarna", "Chiron Pur Sport", 5800000))