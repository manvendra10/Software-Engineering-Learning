def totalExp( expenditure):
    total = 0
    for item in expenditure:
        total = total + item
    return total

tom_expenditure = [ 100, 200, 300 ]
joe_expenditure = [ 300, 400, 500 ]

tom_total = totalExp( tom_expenditure )
joe_total = totalExp( joe_expenditure )

print( "tom's total expenses", tom_total )
print( "joe total expenses", joe_total )