# New Code for Deliverable D2E

## < u6486892 > < Xikang Song >

For Deliverable D2E, I contributed the following new statements of original code:

1. GetNextExitTest; Line 1-90; position: comp1110-ass2-wed10j\tests\comp1110\ass2\GetNextExitTest.java

    I creat a function to find out next exit after one tile be placed, which contain three different tests;
    they are testing for wrong entrance, which may not allowed to enter for the tile.
    testing for wrong puzzle tile, I numerate few types of wrong combination which not allowed these tiles stay together.
    testing the right situation of board situation separately which I create 5 common board.
    
2. Game class; Line 1-545; position: comp1110-ass2-wed10j\src\comp1110\ass2\gui\Game.java

    for task 8, it's more like a advanced task 4 which I need to build up a better playable GUI.
    I found a nice space theme image on Internet and I insert this img as my GUI background. when open up Game, It will be 
    windowed as default setting with 1344*868 resolution. the background of the board set in light blue and four corners 
    are angled which may look more beautiful. In addition, I added some help instruction under the window to help player 
    how to play this game for the logic in task8, I use a tile placement check function in task6, which gives a coordinate of tile's 
    centre and check with board lattice region. eg, if the center is cross the margin of lattice, the tile returns to origin place,
    otherwise, it will be fixed on board and origin place will refresh another tile. there is a current score calculator by call 
    getScore function and refresh every round. Finally, I build a hotkey to clear the board tile and shut the window.
    
3. Metro Class; Line 742-858
    
    for task 7, I use a loop to get the way to next tile by entry number and tile type at the beginning. then, sum the scores for each player 
    by 'numberOfPlayers' which have at most 6 players cases to talk about. I also create getNextExit method to deal with integer entry which 
    the entry number for trip, should in range 0-8 and String tile which the type for the tile, help to get the way to next tile.
    it returns ints which exit gate number, range from 0 to 8(clock-wise present gates from north left which is 0 to west up which is 8)
     

(List at least 20, including at least one new unit test, and include line numbers.)
