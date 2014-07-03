Exercise 1
==========

Problem
-------

Find most popular sequence
* Sequence by customer in time 
* Serialized to logfile, FIFO
* JDK is available for use

Optimize for:
* Correctness
* Runtime complexity
* Coding best practices

Assumptions
-----------

Implementation assumes:
* Only need to support single-threaded execution
* If there is a tie for most popular sequence, only need to return one
* Sequence size of 3


Cases
-----

The following test cases will be covered:
* Happy path outlined in problem description

Approach
--------

I used a composed method approach to create the algorithm for this exercise.  The main steps were outlined from the top 
down and then written into comments that blocked out various pieces of the algorithm.  These pieces are:
* Find the unique customers in the input file
* Partition the file into pageType events by individual customer
* Generate all permutations for a given sequence size (3 for the specific problem)
* Rank page sequences by count and find the most popular sequence

I felt somewhat limited in this approach in the expressiveness of the language.  With a language like Groovy, Javascript
or Scala that supports composed functions, (perhaps even Java8 and stream APIs, but even using Guava predicates) the 
overall solution could be delivered with less-terse code and in a more performant manner, by approaching the problem 
from a distributed stream processing perspective.  Instead of having to populate data structures and iterate over them 
in an imperative manner, a few functions could be composed that would eliminate the need for excessive looping.  Since 
the problem space involves partitioning and projecting the data which functions are very handy tool to have.

My other concerns with this approach are that it requires a lot of mutable data structures to be held in memory - I would
prefer immutability, but don't feel its use is warranted in this setting without some functional primitives.

Runtime Complexity
------------------

Big O for the algorithm defined is O(n^3), given that there 3 nested for-loops defined in the 
generatePermutationsForPageSequences().  

Approaches With Lower Runtime Complexity
----------------------------------------

The runtime complexity could be reduced to O(n^2) by changing the innermost for loop into a 
set of three individual calls to add permutation elements to the list that comprises a permutation.  However a for loop 
was used on Exercise2.java line 57 and a parameter for sequenceSize extracted to demonstrate how larger or smaller 
sequenceSize could be used. 