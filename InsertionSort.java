public class InsertionSort {

    private static void SortDescending(int[] demoarr){
        int n = demoarr.length;

        for(int i = 0 ; i < n ; i++){
            int key = demoarr[i];
            int j = i - 1;

            while(j >= 0 && demoarr[j] < key){ //come outside loop only when condition fails 
                demoarr[j+1] = demoarr[j];
                j = j - 1;
            }
            demoarr[j+1] = key;
        }

        System.out.println("descending");
        for(int i = 0 ; i < n ; i++){
            System.out.print(demoarr[i] + " ");
        }

    }

    private static void SortAscending(int[] demoarr){

        int n = demoarr.length;

        for(int i = 0 ; i < n ; i++){
            int key = demoarr[i];
            int j = i - 1;

            while(j >= 0 && demoarr[j] > key){ //come outside loop only when condition fails 
                demoarr[j+1] = demoarr[j];
                j = j - 1;
            }
            demoarr[j+1] = key;
        }

        System.out.println("Ascending");
        for(int i = 0 ; i < n ; i++){
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
