# BlaBlaCarParks
A project simuling a car park managed by robots.

Should handle the creation of a 2D surface to be used to store vehicles.
The created car park should be able to give the maximum number of vehicle it can store before its robots don't have enought room to move the vehicules around.

-------------------------------------------------
# Example : 
for a car park of 5x5 : <br/>
&nbsp;.....<br/>
&nbsp;.....<br/>
&nbsp;.....<br/>
&nbsp;.....<br/>
E.....<br/>

The coordinate 0 0 is the left bottom corner, 4 4 is the right upper corner. in -1 0 it is the Entry/Exist sas for the Vehicule, here a robot come take a vehicule:<br/>
&nbsp;.....<br/>
&nbsp;.....<br/>
&nbsp;.....<br/>
&nbsp;.....<br/>
VR....<br/>
Moving East (Vehicule in 0 0):<br/>
&nbsp;.....<br/>
&nbsp;.....<br/>
&nbsp;.....<br/>
&nbsp;.....<br/>
&nbsp;VR...<br/>
Moving East x3 (Vehicule in 3 0) (Robot in 4 0):<br/>
&nbsp;.....<br/>
&nbsp;.....<br/>
 .....<br/>
 .....<br/>
 ...VR<br/>
Robot turning North and moving forward by one :<br/>
 .....<br/>
 .....<br/>
 .....<br/>
 ....R<br/>
 ....V<br/>
Robot going north:<br/>
 ....R<br/>
 ....V<br/>
 .....<br/>
 .....<br/>
 .....<br/>
Robot turning aroung the vehicule to but it back to the north "wall":<br/>
 .....<br/>
 ...RV<br/>
 .....<br/>
 .....<br/>
 .....<br/>
In two steps:<br/>
 .....<br/>
 ....V<br/>
 ....R<br/>
 .....<br/>
 .....<br/>
Then pushing the vehicule:<br/>
 ....V<br/>
 ....R<br/>
 .....<br/>
 .....<br/>
E.....<br/>
Another Vehicule arrives in the Sas:<br/>
 ....V<br/>
 ....R<br/>
 .....<br/>
 .....<br/>
V.....<br/>
Then:<br/>
 ....V<br/>
 .....<br/>
 .....<br/>
 ....R<br/>
 ....V<br/>
Then:<br/>
 ....V<br/>
 ....V<br/>
 ....R<br/>
 .....<br/>
 .....<br/>
Etc.<br/>
<br/>
