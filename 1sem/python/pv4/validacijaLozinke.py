import re

valid = False

while (not valid):
    lozinka = input("Unesite lozinku: ")
    duzina = len(lozinka)

    if (duzina < 6 or duzina > 12):
        print("Duzina mora biti izmedju 6 i 12 karaktera!")
    elif(not re.search("[a-z]", lozinka)):
        print("Lozinka mora sadrzati bar jedno malo slovo!")
    elif(not re.search("[A-Z]", lozinka)):
        print("Lozinka mora sadrzati bar jedno veliko slovo!")
    elif(not re.search("[0-9]", lozinka)):
        print("Lozinka mora sadrzati bar jednu cifru!")  
    elif(not re.search("[@#$]", lozinka)):
        print("Lozinka mora sadrzati bar jedan karakter: @, # ili $")  
    else:
        valid = True
        print("Lozinka je validna!")



