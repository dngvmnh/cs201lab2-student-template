public class Lab2Test {
  SinglyLinkedList <Integer> case1Answer = new SinglyLinkedList<Integer>();
  SinglyLinkedList <Integer> case2Answer = new SinglyLinkedList<Integer>();
  SinglyLinkedList <Integer> case3Answer = new SinglyLinkedList<Integer>();
  SinglyLinkedList <Double> case4Answer = new SinglyLinkedList<Double>();
  SinglyLinkedList <Integer> case5Answer = new SinglyLinkedList<Integer>();
  SinglyLinkedList <Integer> case6Answer = new SinglyLinkedList<Integer>();
  SinglyLinkedList <Integer> case7Answer = new SinglyLinkedList<Integer>();
  SinglyLinkedList <Integer> case8Answer = new SinglyLinkedList<Integer>();

  public int score = 0;
  public void loadAnswers(){
    case1Answer.addFirst(3);
    case1Answer.addFirst(2);
    case1Answer.addFirst(1);

    case2Answer.addFirst(2);
    case2Answer.addFirst(3);
    case2Answer.addFirst(5);
    case2Answer.addFirst(1);

    case3Answer.addFirst(4);
    case3Answer.addFirst(5);
    case3Answer.addFirst(2);
    case3Answer.addFirst(3);
    case3Answer.addFirst(1);

    case4Answer.addFirst(4.0);
    case4Answer.addFirst(5.0);
    case4Answer.addFirst(2.0);
    case4Answer.addFirst(3.0);
    case4Answer.addFirst(1.0);

    for (int i = 50000 ; i >= 1 ; i--){
      case5Answer.addFirst(i);
    }

    for (int i = 1 ; i <= 50000 ; i++){
      case6Answer.addFirst(i);
    }
    for (int i = 1 ; i <= 25000 ; i++){
      case7Answer.addFirst(50000 - i + 1);
      case7Answer.addFirst(25000 - i + 1);
    }

    for (int i = 1 ; i <= 25000 ; i++){
      case8Answer.addFirst(i);
      case8Answer.addFirst(25000 + i);
    }
  }

  public static void main(String[] args) {
    Lab2Test tester = new Lab2Test();
    tester.loadAnswers();
    SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
    sll.addFirst(1);
    sll.addFirst(2);
    sll.addFirst(3);
    System.out.println("Before Swap :");
    display(sll);
    sll.swap();
    System.out.println("After Swap :");
    display(sll);
    if (sll.toString().equals(tester.case1Answer.toString())){
      System.out.println("Case 1 passed");
      tester.score++;
    } else {
      System.out.println("Case 1 failed");
      System.out.println(sll.toString());
      System.out.println(tester.case1Answer.toString());
    }
    System.out.println("------------------------");

    sll = new SinglyLinkedList<Integer>();
    sll.addFirst(3);
    sll.addFirst(2);
    sll.addFirst(1);
    sll.addFirst(5);
    System.out.println("Before Swap :");
    display(sll);
    sll.swap();
    System.out.println("After Swap :");
    display(sll);
    if (sll.toString().equals(tester.case2Answer.toString())){
      System.out.println("case 2 passed");
      tester.score++;
    } else {
      System.out.println("case 2 failed");
      System.out.println(sll.toString());
      System.out.println(tester.case2Answer.toString());
    }
    System.out.println("------------------------");

    sll = new SinglyLinkedList<Integer>();
    sll.addFirst(2);
    sll.addFirst(1);
    sll.addFirst(4);
    sll.addFirst(3);
    sll.addFirst(5);
    System.out.println("Before Swap :");
    display(sll);
    sll.swap();
    System.out.println("After Swap :");
    display(sll);
    if (sll.toString().equals(tester.case3Answer.toString())){
      System.out.println("case 3 passed");
      tester.score++;
    } else {
      System.out.println("case 3 failed");
      System.out.println(sll.toString());
      System.out.println(tester.case3Answer.toString());
    }
    System.out.println("*********************************");
    try {
      SinglyLinkedList<Double> sll2 = new SinglyLinkedList<>();
      sll2.addFirst(2.0);
      sll2.addFirst(1.0);
      sll2.addFirst(4.0);
      sll2.addFirst(3.0);
      sll2.addFirst(5.0);
      System.out.println("Before Swap :");
      display(sll2);
      sll2.swap();
      System.out.println("After Swap :");
      display(sll2);
      
      if (sll2.toString().equals(tester.case4Answer.toString())){
        System.out.println("case 4 passed");
        tester.score++;
      } else {
        System.out.println("case 4 failed");
        System.out.println(sll2.toString());
        System.out.println(tester.case4Answer.toString());
      }
    } catch (ClassCastException e) {
      System.out.println("test failed, sll <double> could not be used");
    }

    System.out.println("*********************************");
    long startTime, stopTime;
    long elapsedTime1, elapsedTime2, elapsedTime3, elapsedTime4;

    System.out.println("Testing case 5...");
    sll = new SinglyLinkedList<Integer>();
    for (int i = 1; i <= 50000; i++) {
      sll.addFirst(i);
    }

    startTime = System.currentTimeMillis();
    sll.swap();
    stopTime = System.currentTimeMillis();
    elapsedTime1 = stopTime - startTime;
    if (sll.toString().equals(tester.case5Answer.toString())){
      System.out.println("Case 5 passed");
      tester.score++;
    } else {
      System.out.println("Case 5 failed");
    }

    System.out.println("Testing case 6...");
    sll = new SinglyLinkedList<Integer>();
    for (int i = 50000; i >= 1; i--) {
      sll.addFirst(i);
    }

    startTime = System.currentTimeMillis();
    sll.swap();
    stopTime = System.currentTimeMillis();
    elapsedTime2 = stopTime - startTime;

    if (sll.toString().equals(tester.case6Answer.toString())){
      System.out.println("Case 6 passed");
      tester.score++;
    } else {
      System.out.println("Case 6 failed");
    }

    System.out.println("Testing case 7...");
    sll = new SinglyLinkedList<Integer>();
    for (int i = 1; i <= 25000; i++) {
      sll.addFirst(i);
      sll.addFirst(i + 25000);
    }

    startTime = System.currentTimeMillis();
    sll.swap();
    stopTime = System.currentTimeMillis();
    elapsedTime3 = stopTime - startTime;

    if (sll.toString().equals(tester.case7Answer.toString())){
      System.out.println("Case 7 passed");
      tester.score++;
    } else {
      System.out.println("Case 7 failed");
    }

    System.out.println("Testing case 8...");
    sll = new SinglyLinkedList<Integer>();
    for (int i = 50000; i >= 25001; i--) {
      sll.addFirst(i);
      sll.addFirst(i - 25000);
    }

    startTime = System.currentTimeMillis();
    sll.swap();
    stopTime = System.currentTimeMillis();
    elapsedTime4 = stopTime - startTime;

    if (sll.toString().equals(tester.case8Answer.toString())){
      System.out.println("Case 8 passed");
      tester.score++;
    } else {
      System.out.println("Case 8 failed");
    }


    long averageTime = (elapsedTime1 + elapsedTime2 + elapsedTime3 + elapsedTime4) / 4;
    System.out
        .println(elapsedTime1 + " " + elapsedTime2 + " " + elapsedTime3 + " " + elapsedTime4 + " -> " + averageTime);
    System.out.println(averageTime);
    System.out.println("*********************************");
    System.out.printf("Total Score: %d\n" , tester.score);
  }

  public static <E extends Comparable<E>> void display(SinglyLinkedList<E> sll) {
    System.out.println("Linked List : " + sll);
    System.out.println("First Element : " + sll.first());
    System.out.println("Last Element : " + sll.last());
    System.out.println();
  }
}
