import java.util.*;

class Member {
    int age;
    String name;
    
    public Member(int age, String name){
        this.age = age;
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Member> members = new ArrayList<>();
        
        for(int i=0; i<N; i++){
            int age = scanner.nextInt();
            String name= scanner.next();
            members.add(new Member(age, name));
        }
        
        Collections.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                if(m1.age == m2.age){
                    return 0;
                }else if(m1.age < m2.age){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
        
       for(Member member:members){
           System.out.println(member.age + " " + member.name);
       }
    }
}
