Exercise 1
==========

Problem
-------

Reverse engineer Integer division:
* Can't use the '/' operator 
* Ignore remainders
* JDK is available for use

Optimize for:
* Correctness
* Runtime complexity
* Coding best practices

Assumptions
-----------

Implementation assumes:
* Negative values must be supported
* Divide by zero should throw a ArithmeticException with message "/ by zero", as the '/' operator does 
* Valid range is Integer.MAX_VALUE <= x <= Integer.MAX_VALUE for both operands


Cases
-----

The following test cases will be covered:
* Divide by zero
* Zero divisor
* Identity
* Negative quotient
* Fraction
* Remainders

Approach
--------

My approach is to solve the problem by test driving an iterative algorithm from the use cases listed above.  Since we 
are using an imperative language, an iterative style is the most appropriate to both read and reason about in terms of 
implementation and runtime complexity.  A recursive approach may be worth consideration, especially in a more 
functional language that can optimize for recursion.  In my experience recursion within Java is not likely to provide 
any performance benefit, can make the algorithm more difficult to reason about, and can run the risk of blowing the 
call stack if too many paths branch off and do not return.

Runtime Complexity
------------------

Big O for the algorithm defined is O(n), given that there is a single while-loop defined inside. This would mean that if 
we were to choose the operands such that we would need to run through the single loop a maximum number of times to find 
the correct quotient, it would scale linearly with the amount of times we need to run through the loop.  

Approaches With Lower Runtime Complexity
----------------------------------------

It is possible to conceive of a recursive approach that could perform at O(log n), by doing some flavor of divide-and-
conquer, checking and zeroing in on the correct answer.  But this approach would add significantly to the essential 
complexity of the source code.  For the majority of cases for numbers in the Integer range would be at best negligible 
performance gains with modern hardware.  Also, JIT optimizations are possible with the iterative approach because it 
can optimize 'simple' imperative statements like those in this approach.  Java is not well known for its recursive call 
optimization; a O(log n) solution may be appropriate with larger ranges or more a different operating environment.
