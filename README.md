# PasarPolis

**Coding Problem**
Write a function which takes an array of integers given as string as an argument and returns second max value from the input array. If there is no second max return -1. let's take some examples:

 1. For array ["3", "-2"] should return "-2"
 2. For array ["5", "5", "4", "2"] should return "4"
 3. For array ["4", "4", "4"] should return -1 (duplicates are not considered as the second max)
 4. For [] (empty array) should return -1.
 5. For ["-214748364801","-214748364802"] should return -214748364802.    

 
**Restrictions :**
1. CPU complexity should be O(n)
2. You are not allowed to change the array
3. Maximum length of the integer string can be 2^10=1024 digits

**Solution 1 :**
SecondMax.java
- Works fine for integers and releated ranges

**Solution 2**
SecondMaxBigInt.java
- Given this constraint ``` **Maximum length of the integer string can be 2^10=1024 digits** ```

I have used BigInteger class to solve the problem of 1024 possible digits. 
