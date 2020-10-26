class Zahlenfilter {
  public static void main(String[] args) {
    count();
  }

public static void count(){
  int counter = 0;
  for(int i=0; i<201; i++){
    counter ++;
    checkForCriterion(counter);
  }
}

public static void checkForCriterion(int nbr){
if( nbr % 5 == 0){
  System.out.println(nbr + " ist durch 5 teilbar!");
}else if(nbr % 10 == 9){
  System.out.println(nbr + " endet auf 9!");
}else if(nbr % 3 == 2){
  int before = nbr - 1;
  int result = nbr + before;
  System.out.println(nbr + " und " + before + " addiert ergeben " + result + " und "  + result + " ist durch 3 teilbar");
}
}
}
