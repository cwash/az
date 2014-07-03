Exercise 1
==========

Problem
-------

* Replicate integer division without using the '/' operator 
* Ignore remainders
* JDK is available for use

Optimize for:
* Correctness
* Runtime complexity
* Coding best practices

Assumptions
-----------

* Negative values must be supported
* Divide by zero should throw a ArithmeticException with message "/ by zero" to replicate behavior from '/' operator, 
  as opposed to throwing IllegalArgumentException which one could make a case for as well
* Since we are using an imperative language, an iterative style is the most appropriate to both read and reason about
* Valid range is Integer.MAX_VALUE <= x <= Integer.MAX_VALUE for both operands


Cases
-----
* Divide by zero
* Zero divisor
* Identity
* Negative quotient
* Fraction
* Remainders
