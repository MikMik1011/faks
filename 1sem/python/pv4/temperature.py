temp = [[1,2,3,4,5,6,7], [8,9,10,11,12,13,14], [15,16,17,18,19,20,21]]

for i in range(len(temp)):
    print(f"Prosecna temperatura {i+1}. nedelje je {sum(temp[i]) / len(temp[i])}")
