
package Learn_With_Web_Classes;
public class DialogBox {
    public static final int yes_option=2;         
    public static void okDialogError(String txt)
            {
            Ok_DialogError ok1=new Ok_DialogError();
            ok1.setVisible(true);
            ok1.dialogText(txt);
            }
    public static int yesNoCancelDialog(String txt)
            {
            YesNoCancelDialog ync=new YesNoCancelDialog();
            ync.setVisible(true);           
            return(ync.buttonAction());             
            }
    public static void okDialog(String txt)
            {
            Ok_Dialog ok1=new Ok_Dialog();
            ok1.setVisible(true);
            ok1.dialogText(txt);                       
            }
    }
