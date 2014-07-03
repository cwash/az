Exercise 1
==========

Problem
-------

Reverse engineer Integer division
* Can't use the '/' operator 
* Ignore remainders
* JDK is available for use

Optimize for
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

Since we are using an imperative language, an iterative style is the most appropriate to both read and reason about in
terms of implementation and runtime complexity.  A recursive approach may be worth consideration, especially in a
more functional language that can optimize for recursion, may make it worthwhile.  In my experience recursion within
Java is not likely to provide any performance benefit, can make the algorithm more difficult to reason about, and can
run the risk of blowing the stack if too many paths branch off and do not return.

Will solve the problem by test driving the algorithm from the use cases listed above.

Runtime Complexity
------------------

Big O for the algorithm defined is O(n) - given that there is a single while-loop defined inside.  It is possible to
conceive of a recursive approach that could perform at O(log n), by doing some flavor of divide-and-conquer and zeroing
in on the correct answer, but this approach adds significantly to the essential complexity of the approach for what we
can reason in the majority of cases for numbers in the Integer range would be at best modest gains with modern hardware
and JIT optimizations that favor 'simple' imperative statements like those in this approach.
