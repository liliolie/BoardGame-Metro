# New Code for Deliverable D2E

## < u6004244 > < Lili Chen >

For Deliverable D2E, I contributed the following new statements of original code:

-
1. Our group finished task1 - 9 last week, we're currently trying to optimise our code and structure,
I'm trying to write the codes for task 6 because it is an important part for the later tasks.
But i haven't include these codes in the class, because i haven't finish the whole task yet  
so the 20 lines new codes I included in this week's deliverable are the flowing. 

a. This part of the code is generate the 2D location for the valid place at the beginning (next to the edge)

        List<Point> points = new ArrayList<Point>();
        for (int i = 0; i <= 7; i++) {
            points.add(new Point(i, 7));
            points.add(new Point(7,i));
            points.add(new Point(0,i));
            points.add(new Point(i, 0));
        }
        List<Point> allPoints = points.stream().distinct().collect(Collectors.toList());      
       
b. This part of code is when placed a tile on the borad, the location near the tile will become 
the valid location for the next placement

     if(locationx>1 && locationx<7 && locationy>1 &&locationy<7){
        if (points.add(new Point(locationx, locationy))){
            points.add(new Point(locationx+1,locationy));
            points.add(new Point(locationx, locationy-1));
            points.add(new Point(locationx, locationy+1));
        }
     }
     if(locationx==0){
         if (points.add(new Point(locationx, locationy))){
            points.add(new Point(locationx+1,locationy));
         }
     }
     if(locationx==7){
         if (points.add(new Point(locationx, locationy))){
            points.add(new Point(locationx-1,locationy));
         }
     if(locationy==0){
         if (points.add(new Point(locationx, locationy))){
            points.add(new Point(locationx,locationy+1));
         }
     }
     if(locationy==7){
         if (points.add(new Point(locationx, locationy))){
             points.add(new Point(locationx,locationy-1));
         }
     }
     
2. I created the ExtraTestTask6
   In this class, I generate some rare cases the previous task might not enough to check the 
   valid or invalid placement. Using this test to checked our code again. 
-

(List at least 20, including at least one new unit test, and include line numbers.)
