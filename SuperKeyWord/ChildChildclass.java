package SuperKeyWord;

public class ChildChildclass extends Child {
    ChildChildclass(){
        System.out.println("this is from the child child class" );
    }
    void ChildChildMethod(){
        String ParentMessage = super.ParentMethod();
        int childnum = super.num;
        // System.out.println("this is from the child child method" + "this is message from the parent : " + ParentMessage);
        System.out.println("this is the num got from the child child class " + childnum);
    }
}
