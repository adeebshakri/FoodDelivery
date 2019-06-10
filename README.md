# FoodDelivery
Food Delivery Algorithm
The algorithm checks for 10 delivery persons
It takes input of pickup area(xp,yp) and delivery destination (xd,yd).
A delivery agent assigned to deliver food to a particular destination(xd,yd) and its state is set to 1 while he is delivering it.
After he has delivered the item, his state is again set to 0(ie he is available again) and his position is set to (xd,yd).
Now the algorithm takes input of pickup and delivery destination and checks again for all the delivery person who is closest to the pickup area and whose state is 0(ie he is available).
