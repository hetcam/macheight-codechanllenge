# MachEight Challenge

This project was created with Java language.
I develop the code using the tool [Intellij IDE](https://www.jetbrains.com/idea/)

## How to run?
Open any Java IDE, compile the Java project, and run the Java main class


## Challenge description
The task is to write a function that finds pairs of integers from a list that
sum to a given value. The function will take as input the list of numbers as
well as the target sum.
​
The sample output is shown below.
```
> app 1,9,5,0,20,-4,12,16,7 12
​
+ 12,0
+ 5,7
+ 16,-4
​
```
​
In the example, there is an executable named `app`. It takes as command line
arguments a comma-separated list of integers, and the target integer. Your app
doesn't need to have identical input/output mechanisms. For example, you could
read from a file instead of the command line.
​
You can assume that all input values are integers. You can assume that there aren't
any repeat values in the list.
​
The algorithm to find the pairs must be faster than O(n^2). All edge cases
should be handled appropriately. This is _not_ a closed-book test. You are
encouraged to reach out with any questions that you come across.
​
## Evaluation
​
All candidates who submit an algorithm that is efficient and correct will pass
to the next step of the interview process. We define "efficient" as faster than
O(n^2) and "correct" as returning the correct results for all possible inputs.
Any assignment that doesn't return the correct answer for the sample input
above will fail.
​
If you feel the need to impress us by going above and beyond, we're impressed
by good unit tests as well as clean and readable code. We're less interested in
your knowledge of any particular framework (react, django, etc.). You're
welcome to create a full-featured web app with pretty graphics if you want, but
that will not improve your chances of passing. There have been passing
assignments written in under 20 lines of python.
​
