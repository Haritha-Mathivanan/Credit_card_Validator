# Credit_card_Validator
Implementing Luhn Algorithm

Luhn Algorithm, also known as ‘modulus 10’ or ‘mod 10’ algorithm, is a mathematical formula for validating identification numbers for credit cards, IMEI, social security numbers, corporate identification numbers, etc. This checksum formula is widely utilized today, especially to facilitate online payments by detecting accidental input errors of identification numbers.The Luhn algorithm formula was created by German Computer Scientist Hans Peter Luhn in the 1960s.

Formula
Card no = 4012888888881881

step 1 : Starting from the last index, multiply each value at an even index by 2.

Step 2 : If the result is greater than 9, sum up the individual digits of that number .

Step 3 : Sum up the resultants with the remaining digits.

Step 4 : Check if the sum is a multiple of 10; if true, the card is considered valid.

