##D2B
2.4 / 3.0

comments:

All test of part one are passed. Great!
Your code is nice and well-formatted. Some solutions are concise and elegant.
I suggest that you re-consider the structure of your code design, 
which can make your software more maintainable and extendable, and also help you optimize your solution.  

- Viewer

At first I found that the Refresh button is somehow disabled (I cannot click on it). 
It seems to be caused by the canvas node in makeBoard(), which overlaps with the button.
After I comment out line 181 to remove the canvas node or call *canvas.toBack()* after adding the canvas node, 
the Viwer works properly. 

I notice that you're using JDK14 rather that JDK13, I suggest that you use JDK13 because this is the 
JDK version used on both the lab machine and my device. Using JDK14 causes the compiling failure when building the project on my device. 

##