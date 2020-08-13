public class sampleTest {

    public static void main(String[] args) {

        String test = "CDDCBCBDDBBABBDCABUPDCCCADAABDACCBADACBBADBCDBAAABDCISCUCAACBNCABCBADBODAGCLDBQDADBBBGPACAABBCIDTBGCTADTDPOAAFCDDB";
        int[] dataArray = new int[4];

        for(int i = 0; i < test.length(); i++) {

            char toCheck = test.toLowerCase().charAt(i);

            //
            if(toCheck == 'a') {

                dataArray[0]++;

            } else if(toCheck == 'b') {

                dataArray[1]++;

            } else if(toCheck == 'c') {

                dataArray[2]++;

            } else if(toCheck == 'd') {

                dataArray[3]++;

            }

        }

        for(int i = 0; i < 4; i++) {
            System.out.println(dataArray[i]);
        }

    }

}

//while (file.hasNext()) {
//
//        // Loop properties
//        String line = file.nextLine();
//        Scanner lineScan = new Scanner(line);
//
//        if(line.contains(" ")) {
//
//        if(loopCount == 0) {
//
//        nameOne = lineScan.nextLine();
//
//        for(int i = 0; i < 2; i ++) {
//
//        line = file.nextLine();
//        dataSetOne = evaluateData(line, dataSetOne);
//
//        }
//
//        // Increase loop count
//        loopCount ++;
//
//        } else if (loopCount == 1) {
//
//        nameTwo = lineScan.nextLine();
//
//        for(int i = 0; i < 2; i ++) {
//
//        line = file.nextLine();
//        dataSetTwo = evaluateData(line, dataSetTwo);
//
//        }
//
//        // Increase loop count
//        loopCount ++;
//
//        }
//        }
//
//
//        if(loopCount > 1) {
//        // Test data for testing all the data made it.
//        System.out.println(nameOne);
//        for(int i = 0; i < 4; i++) {
//        System.out.println(dataSetOne[i]);
//        }
//
//        System.out.println(nameTwo);
//        for(int i = 0; i < 4; i++) {
//        System.out.println(dataSetTwo[i]);
//        }
//
//        // reset data
//        // Reset the loop count
//        loopCount = 0;
//        nameOne = nameTwo = "";
//
//        for(int i = 0; i < 4; i++) {
//        dataSetOne[i] = dataSetTwo[i] = 0;
//        }
//        }
//
//        }
