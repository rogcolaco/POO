import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String keyWord, first, last;
        String[] subStrings;
        int k, position, positionFirst, positionLast;

        Scanner leitor = new Scanner(System.in);
        position=0;

        keyWord = leitor.nextLine();
        k= leitor.nextInt();

        if (k<=keyWord.length()){
            subStrings=new String[keyWord.length()-k+1];
            if (keyWord.length() < 4 || k<1) {
                System.out.println("");
            }
            else if(keyWord.length()==k){
                System.out.println(keyWord + " " + keyWord);
            }

            else {
                for (int i = 0; i < subStrings.length; i++) {
                    subStrings[i]=keyWord.substring(position,position+k);
                    position++;
                }

                if(subStrings[0].compareTo(subStrings[1])<0){
                    first =subStrings[0];
                    last=subStrings[1];
                    if(subStrings.length>2){
                        for (int i = 2; i < subStrings.length; i++) {
                            if(subStrings[i].compareTo(first)<0){
                                first=subStrings[i];
                            }
                            if(subStrings[i].compareTo(last)>0){
                                last=subStrings[i];
                            }

                        }
                        System.out.println(first+ " " + last);
                    }
                }
                if(subStrings[0].compareTo(subStrings[1])>0){
                    first=subStrings[1];
                    last=subStrings[0];
                    if(subStrings.length>2){
                        for (int i = 2; i < subStrings.length; i++) {
                            if(subStrings[i].compareTo(first)<0){
                                first=subStrings[i];
                            }
                            if(subStrings[i].compareTo(last)>0){
                                last=subStrings[i];
                            }

                        }
                        System.out.println(first+ " " + last);
                    }
                }
                if(subStrings[0].compareTo(subStrings[1])==0) {
                    first = subStrings[1];
                    last = subStrings[0];
                    if (subStrings.length > 2) {
                        for (int i = 2; i < subStrings.length; i++) {
                            if (subStrings[i].compareTo(first) < 0) {
                                first = subStrings[i];
                            }
                            if (subStrings[i].compareTo(last) > 0) {
                                last = subStrings[i];
                            }
                            System.out.println(first + " " + last);
                        }
                    }
                }

            }
        }
    }
}
