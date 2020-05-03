# New Code for Deliverable D2D

## < uid > < name >

For Deliverable D2D, I contributed the following new statements of original code:

-
 1. Metro Class; Line 295 - 312
 
    I contributed the method 2 - 3, and my group member updated the method 1
    
    a. Lines 295 - 298; i used the Pattern to check if the pieceSequence string is following the fixed valid pattern 
    
    b. Lines 299  - 320; i also used the loop to separately check for the characters and numbers in the valid range
    
 2. Metro Class; Lines 368 - 406
 
    I contributed to the method 2 
    
    a. Lines 368 - 405; i created the array list for different type of tiles 
    i used matcher to match the tiles with the placement string;
    and counted how many times the substring appears in the larger string
    
    b. Lines 406; i compared the maximum number for each type of tile appeared in the placement string with 4
    
 3. Metro Class; lines 456 - 512
 
    I contributed to the method 2 
    
    a. Lines 457 - 484; i created a list for thr total tiles 
    
    b. Lines 485 - 507; i use matcher to match the tiles been placed and tiles in hand 
    and removed those from the whole tiles list
    
    c. Lines 509 - 511; i random a tile from the leftover list 
     
 4. I also developed the following code that do not included in the Metro Class because my group member's code is better
 
    For Task 6, I used the following code to check if the tiles' position are overlapped 
    
            String placementPosition = placementSequence.replaceAll("([a-z])", "");
            List<String> position = Arrays.asList(placementPosition.split("(?<=\\G..)"));
            List<String> uniquePosition = position.stream().distinct().collect(Collectors.toList());
    
            if (position.size() != uniquePosition.size()) {
                System.out.println(false + "1");
            }
            
    I used the flowing code to check the four corner to avoid the looping back to station situation
  
    a. can not place xxxb and cxxx types of the tile on the left top corner 
    
    b. can not place xcxx and bxxx types of the tile on the right top corner 
    
    c. can not place xxxc and xxbx types of the tile on the left bottom corner 
    
    d. can not place xbxx and xcxx types of the tile on the right bottom corner 
    
        String leftTop1 = placementSequence.substring(placementSequence.indexOf("00") - 4, placementSequence.indexOf("00") - 3);
        String leftTop2 = placementSequence.substring(placementSequence.indexOf("00") - 1, placementSequence.indexOf("00"));
    
        String rightTop1 = placementSequence.substring(placementSequence.indexOf("07") - 4, placementSequence.indexOf("07") - 3);
        String rightTop2 = placementSequence.substring(placementSequence.indexOf("07") - 3, placementSequence.indexOf("07") - 2);
    
        String leftBottom1 = placementSequence.substring(placementSequence.indexOf("70") - 2, placementSequence.indexOf("70") - 1);
        String leftBottom2 = placementSequence.substring(placementSequence.indexOf("70") - 1, placementSequence.indexOf("70"));
    
        String rightBottom = placementSequence.substring(placementSequence.indexOf("77") - 3, placementSequence.indexOf("77") - 2);
    
           if(placementSequence.contains("00")){
               if (leftTop1.equals("c") || leftTop2.equals("b")) {
                   return false;
               }
           }
           if(placementSequence.contains("07")){
               if (rightTop1.contains("b") || rightTop2.contains("c")) {
                   return false;
               }
           }
           if(placementSequence.contains("70")){
               if (leftBottom1.equals("b") || leftBottom2.equals("c")) {
                   return false;
               }
           }
           if(placementSequence.contains("77"))
       
           {
               if (rightBottom.equals("b") || rightBottom.equals("c")) {
                   return false;
               }
           }                    
-

(List at least 10, and include line numbers.)
