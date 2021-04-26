import string #Import the python library.
def listAlphabet(): # Function calls the string.ascii_lowercase which is equal alphabet.
    return list(string.ascii_lowercase)
lisst = listAlphabet() # Define the list.
for i in range(len(lisst),1,-1): #Loop for that use range to count the alphabet one per one.
    if i % 3 == 0: #Condition if the position of letter is multiple of 3 disappears.
        lisst.pop(i-1) # Delete this letter because of the last condition.
print("The list is = ", ", ".join(lisst))