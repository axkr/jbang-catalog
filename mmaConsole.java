///usr/bin/env jbang "$0" "$@" ; exit $? 
//DEPS org.matheclipse:matheclipse-io:2.0.0 

public class mmaConsole {
  public static void main(String[] args) {
    org.matheclipse.io.eval.MMAConsole.main(args);
  }
}
