package day31CustomSlassConstructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester tester1=new Tester("Layan",11,123000,"SDET");
        Tester tester2=new Tester("Mia",12,125000,"QASDET");
        Tester tester3=new Tester("Jesus",13,103000,"DEVELOPER");
        Tester tester4=new Tester("Layn",14,123500,"SDET1");
        Tester[] testers={tester2, tester3,tester4};

        Developer developer1 = new Developer("Alia",20,130000,"Senior1");
        Developer developer2 = new Developer("Alis",21,135000,"Senior2");
        Developer developer3 = new Developer("Alid",22,140000,"Senior");
        Developer developer4  = new Developer("Alif",23,145000,"Senior1");
        Developer developer5 = new Developer("Alih",24,150000,"Senior2");
        Developer[] developers={developer4,developer2,developer3,developer5};

        ScrumTeam scrumTeam1=new ScrumTeam("Ayhan","Ayşe","Ferda", 15);
        scrumTeam1.addTester(tester1);
        scrumTeam1.addDevoper(developer1);

        scrumTeam1.addTesters(testers);
        scrumTeam1.addDevopers(developers);

        System.out.println(scrumTeam1);

        System.out.println("-----------------");

        for(Tester eachTester:scrumTeam1.testersList){
            System.out.println(eachTester.name+" : "+ eachTester.salary);

            System.out.println("------------------------");

            for(Developer eachDeveloper:scrumTeam1.devopsList){
                System.out.println(eachDeveloper.name+" : "+ eachDeveloper.salary);


                System.out.println("------------------");

                scrumTeam1.removeTester(13);
                scrumTeam1.removeDeveloper(23);
                System.out.println(scrumTeam1);
            }


        }


    }
}
