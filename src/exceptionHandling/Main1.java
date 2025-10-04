package exceptionHandling;

import java.io.FileNotFoundException;
//Try-catch
public class Main1 {
    public static void main(String[] args) {
        try{
            method1("dummy");
        }catch(InterruptedException exception){

        }catch (ClassNotFoundException exception){

        }
//        catch(FileNotFoundException exception){
//            catch block only handle exception which can be thrown by
 //           try block.This is not thrown by method1.
//        };
      catch(Exception exception){
           // it can catch any kind of exception(because parent of every exception),only above this we can
          // catch specific exception not after catching it.
      }
        //we can also catch multi-pal exception in one catch block.
        //catch(ClassNotFoundException | InterruptedException exp)
    }
    public static void method1(String name)throws ClassNotFoundException,InterruptedException{
        if(name.equals("dummy")){
            throw new ClassNotFoundException();
        } else if (name.equals("interrupted")) {
            throw new InterruptedException();


        }

    }

}
