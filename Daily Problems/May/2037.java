class Solution {
    public int getMax(int[] arr){
        int max = 0 ;
        for(int ele : arr){
            max = Math.max(max , ele);
        }
        return max;
    }

    public int minMovesToSeat(int[] seats, int[] students) {

        //With a better complexity;
        int totalStudents = seats.length;
        int maxSeat = getMax(seats);
        int maxStudents = getMax(students);
        int[] seatsCount = new int[maxSeat+1];
        int[] studentsCount = new int[maxStudents+1];
        for(int k = 0 ; k< totalStudents ; k++){
            seatsCount[seats[k]]++;
            studentsCount[students[k]]++;
        }
        int set = 0  , stu = 0 , moves = 0 ;
        while(totalStudents > 0){
            // find seat
            while(seatsCount[set] == 0 ){
                set++;
            }
            //find student 

            while(studentsCount[stu] == 0 ){
                stu++;
            }
            //find diff 

            moves += Math.abs( set - stu);

            totalStudents--;
            seatsCount[set]--;
            studentsCount[stu]--;
        }
        return moves;

        //With worstcomplexity 
        // Arrays.sort(seats);
        // Arrays.sort(students);
        // int ans = 0 ; 
        // for(int i = 0 ; i < students.length ; i++){
        //    ans += Math.abs(seats[i] - students[i]); 
        // }
        // return ans ; 

    }
}