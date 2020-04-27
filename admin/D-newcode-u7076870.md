# New Code for Deliverable D2D

## < u7076870 > < Chan Xu >

For Deliverable D2D, I contributed the following new statements of original code:
(I am sorry that I am a bit confused about the description here, so I just list all the codes I contributed.)

1. Coordinates Class
Line 1 to Line 34 - I created a list of string that includes all the possible coordinates where can have a tile and 
                  a list of string that includes all the coordinates where already have tiles based on 
                  placementSequence. Then, I created a method to convert the list of string to a list of integers, 
                  so that I can do some calculations with the elements in that list.

2. Tiles Class
Line 1 to Line 13 - I created a list of string that contains all the tiles that have already been placed based on the 
                    placementSequence.
                    
3. Metro Class
Line 293 (Task 2) - I used regular-expression to check if one PiecePlacement matches the pattern "[a-d][a-d][a-d][a-d][0-7][0-7]".
           It means that the string contains 6 characters, and the first 4 characters are either a, b, c, or d, and the
           last 2 characters are numbers from 0 to 7 inclusive.
Line 330 to 365 (Task 3) - I counted how many times each tile appears in a placement sequence.
Line 421 to 455 (Task 5) - I created a joined list of string that contains all the 60 tiles of this game. Then, I remove
                           the tiles that have already been placed, and the tiles in players hands from the list. Last, 
                           I randomly choose one from the remaining tiles in the list.
Line 534 to 605 (Task 6) - This is by far the most complicated one, and it's the one I am most proud of. I would like to
                           discuss these codes with you during the lab. Basically, I used the lists I created in Tiles
                           and Coordinates classes to find the available coordinates for every tile in the placementSequence.
                           If one tile's actual coordinate is not one of the available coordinates, it returns false, unless
                           there is no available coordinates for that tile, which means it can be placed at a coordinate
                           where it should not have been placed (that tile could not have been placed elsewhere).

(List at least 10, and include line numbers.)
