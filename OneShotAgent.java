package example.behaviours;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;



public class OneShotAgent extends Agent {

  protected void setup() {
    System.out.println("Agent "+getLocalName()+" started.");
    addBehaviour(new MyOneShotBehaviour());
  } 

  private class MyOneShotBehaviour extends OneShotBehaviour {

    public void action() {

        MultipleLinearRegression MLR = new MultipleLinearRegression();
        
    } 

    public boolean done() {
		  MLR.mostrar();
		}
    
    public int onEnd() {
      myAgent.doDelete();   
      return super.onEnd();
    } 
  }    // END of inner class ...Behaviour
}
