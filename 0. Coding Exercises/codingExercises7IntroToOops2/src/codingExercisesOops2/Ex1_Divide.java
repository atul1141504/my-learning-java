package codingExercisesOops2;

//Complete the classes below by implementing the Operation interface and providing your own implementation of the perform method.
class Ex1_Divide implements Ex1_Operation {
 @Override
 public int perform(int x, int y) {
     if (y>0){
         return x/y;
     }
     
     return -1;
 }
}
