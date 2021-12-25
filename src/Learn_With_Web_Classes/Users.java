
package Learn_With_Web_Classes;
public class Users {
   private String id,sname,fname,category,mob,address,fees,doa,course,status;
    public Users(String id,String sname,String fname,String category,String course,String fees,String doa,String mob,String address,String status)
    {
    this.id=id;
    this.sname=sname;
    this.fname=fname;
    this.category=category;
    this.course=course;
    this.mob=mob;
    this.address=address;
    this.fees=fees;
    this.doa=doa; 
    this.status=status;
    }
    public Users(String id,String sname,String fname,String mob,String category)
    {
    this.id=id;
    this.sname=sname;
    this.fname=fname;
    this.mob=mob;
    this.category=category;
    }
    public String id()
    {return id;}
    public String sname()
    {return sname;}
    public String fname()
    {return fname;}
    public String category()
    {return category;}
    public String mob()
    {return mob;}
    public String address()
    {return address;}
    public String fees()
    {return fees;}
    public String doa()
    {return doa;}
    public String course()
    {return course;}
    public String status()
    {return status;}
    
}
