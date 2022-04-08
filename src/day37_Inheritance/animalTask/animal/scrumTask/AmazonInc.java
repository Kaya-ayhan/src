package day37_Inheritance.animalTask.animal.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {
        String company="Amazon Inc";
        ProductOwner po = new ProductOwner("Shuaib",29,'M',1,120000,company);

        BussinessAnalyst ba= new BussinessAnalyst("Cihad",30,'M',2,150000,company);

        scrumMaster sm= new scrumMaster("Anel",26,'F',3,140000,company);

        Tester tester1 = new Tester("Rabia",31,'F',"QA",4,140000,company);
        Tester tester2 = new Tester("Elif",31,'F',"SDET",4,140000,company);
        Tester tester3 = new Tester("Rabia",31,'F',"QA",4,140000,company);
        Tester tester4 = new Tester("Ayhan",31,'M',"SDET",4,140000,company);
        Tester[] testers={tester1,tester2,tester3,tester4};

        Developer developer1= new Developer("Daniel",32,'M',"Java Developer",7,160000,company);

        ScrumTeam scrumteam= new ScrumTeam(po,ba,sm);
        scrumteam.addDeveloper(developer1);
        scrumteam.addTesters(testers);


        System.out.println(scrumteam);

        System.out.println("----------------");

        for (Tester tester : scrumteam.testers) {
            System.out.println(tester.name+" : " + tester.salary);
            
        }
        System.out.println("----------------");
        for(Developer developer: scrumteam.developers){
            System.out.println(developer.name+" : " + developer.salary);
        }
    }
}
