# Stopwatch tasks by Poorin Pichayamongkol (5910545809)

I ran the tasks on a HP Pavilion m4-1004tx , and got these results:

Task                                  | Time
--------------------------------------|--------------:
Append  50,000 chars to String        |  0.785727 sec
Append 100,000 chars to String        |  3.006320 sec
Append 100,000 chars to StringBuilder |  0.004431 sec
Add 1 billion double using array      |  2.382963 sec
Add 1 billion Double using array      |  5.777169 sec
Add 1 billion BigDecimal using array  |  9.796665 sec 

## Explanation of Results

* Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
	* Answer : Because when we append 100,000 chars to String it will collect the first chars and make it to String then collect new chars by replacing new chars with old chars and make it to String so it takes more memory than 500,000 chars.

* Why is appending to StringBuilder so much different than appending to String?  What is happening to the String? 
	* Answer : Because StringBuilder has an array of chars in side with capacity of 16 so if we append chars to String it won't make chars to String that takes some of memory.But if we added chars more than 16 StringBuilder will increase its capacity by 2 times plus 2 so it takes memory just increase its capacity not collect and change chars to String .It's not like String that collect chars and make chars to String and do it over and over again so String takes more memory and more time than StringBuilder.

* Explain difference in time to sum double, Double, and BigDecimal.  Which is faster and why?    
	* Answer : to sum double is faster.The explanation is below.
		* sum double (use 2.382963 sec) : double is primitive so it does not have attributes or methods it's just have values so if we sum them it take lesser momery of our PC.
		* sum Double (use 5.777169 sec) : Double is object it has attributes and methods .if we want to sum it we need to unbox it and sum values and box it again.So it takes more memory to do that way.
		* sum BigDecimal (use 9.796665 sec) : BigDecimal is object too it has attributes and methods.If we want to sum it we need to unbox it and sum values and box it again.So it takes more memory to do that way.
 
	