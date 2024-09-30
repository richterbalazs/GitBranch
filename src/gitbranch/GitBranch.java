
package gitbranch;


public class GitBranch {

 
    public static void main(String[] args) {
        GitBranch obj = new GitBranch();
        int i = obj.fv();
    }

    private int fv() {
        System.out.println("Nem statikus fv");
        return 0;
    }
    
}
