# New Code for Deliverable D2D

## < u6486892 > < Xikang Song >

For Deliverable D2D, I contributed the following new statements of original code:


1. Viewer class; Line 1-238
 
    I contributed the task 4 UI design, including build up all functions in this simple window.
    
    a. Lines 31-55; board layout design, i use my fx knowledge to set up basic parameter for each feature on this game window.
    eg. margin boundary must be symmetry which is 90 in a addition, height&width should consider the final window's ratio which tiles take place 3
    tiles spacing and2 on margin size.
    
    b. Lines 39-46; numerate and create function which i am gonna to use for the rest of work. eg. tiles&station images reader, board constructor.
    
    c. Lines 62-75; creat "makePlacement" method, i used a loop to check board string, if it's valid then add right tiles then smaller pic size
     to let tiles pic don't cover others. after that, jump to check next tile.
     
    d. Line 77-148; creat "makeStations" method, central station takes four same pic and combine them as a whole, but they are all point to different side.
    Therefore, i use a counter 'i' to record current central number, then doing the rotation for the rest central files by img.rotation
    
    e. Line 150-182; creat "makeBoard" method, i set a rectangle filed for game board and fill in base color and board has angled arc at four corners.
    
    f. Line 184-199; creat "drawLines" method, i draw up lattice style line for fill in tiles, i do calculate each tiles sizes on board, so make sure all tiles
    can fill in lattice and won't cover each other. namely, I need to smaller tiles size to make sure board lines and all tiles a visible.
    
    g. Line 204-222; creat "makeControls" method, i numerate a textfield to fill in board string, with hotkeys press to doing insertion and delete,
    press fresh to clear current board string.
    
    
2. Metro Class; Lines 615-720;
 
    I contributed to the task 7
    
    a. Lines 615-663; i crete single player's rule, checking the sequence length and apply by different length.
    
    b. Lines 664-689;  I also talked issue with more players, change sizes and put them back to array.
    

(List at least 10, and include line numbers.)