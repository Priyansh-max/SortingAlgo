
class SelectionSort{

    private static void SortDescending(int[] demoarr){
        // Step1 - traversing the complete loop
        for(int i = 0 ; i < demoarr.length ; i++){

            //Step2 - finding the maximum element in rest of the array
            int idx_min = i;
            for(int j = i+1; j < demoarr.length ; j++){
                if(demoarr[j] > demoarr[idx_min]){
                    idx_min = j;
                }
            }

            //Step3 - swapping the minimum element found with the curr position of i
            int temp = demoarr[idx_min];
            demoarr[idx_min] = demoarr[i];
            demoarr[i] = temp; 
        }

        System.out.println("descending");
        for(int i = 0 ; i < demoarr.length ; i++){
            System.out.print(demoarr[i] + " ");
        }


    }

    private static void SortAscending(int[] demoarr){
        // Step1 - traversing the complete loop
        for(int i = 0 ; i < demoarr.length ; i++){

            //Step2 - finding the minimum element in rest of the array
            int idx_min = i;
            for(int j = i+1; j < demoarr.length ; j++){
                if(demoarr[j] < demoarr[idx_min]){
                    idx_min = j;
                }
            }

            //Step3 - swapping the minimum element found with the curr position of i
            int temp = demoarr[idx_min];
            demoarr[idx_min] = demoarr[i];
            demoarr[i] = temp; 
        }
        System.out.println("Ascending");
        for(int i = 0 ; i < demoarr.length ; i++){
            System.out.print(demoarr[i] + " ");
        }


    }
    public static void main(String[] args) {
        int demoarr[] = {6,5,2,8,1,9,3,7,9};
        //correct ans = {1,2,3,5,6,7,8,9,9} ascending 
        //correct ans = {9,9,8,7,6,5,3,2,1} desceding

        SortAscending(demoarr);
        System.out.println("");
        SortDescending(demoarr);

    }
}