package PairProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employees {
    private List<Employee> employees;
    private List<HockeyPlayer> hockeyPlayers;
    private List<Professor> professors;
    private List<Parent> parents;
    private List<GasStationAttendant> gasStationAttendants;
    private List<List> all;

    public Employees() {
        employees=new ArrayList<>();
        employees.add(new HockeyPlayer("Wayne Gretzky",894));
        employees.add(new HockeyPlayer("Who Ever",0));
        employees.add(new HockeyPlayer("Brent Gretzky",1));
        employees.add(new HockeyPlayer("Pavel Bure",437));
        employees.add(new HockeyPlayer("Jason Bourne",0));

        employees.add(new Professor("Albert Einstein","Physics"));
        employees.add(new Professor("Alan Turing","Computer Systems"));
        employees.add(new Professor("Richard Feynman","Physics"));
        employees.add(new Professor("Tim Berners-Lee","Computer Systems"));
        employees.add(new Professor("Kurt Godel","Logic"));

        employees.add(new Parent("Tiger Woods",1));
        employees.add(new Parent("Super Mom",168));
        employees.add(new Parent("Lazy Larry",20));
        employees.add(new Parent("Ex Hausted",168));
        employees.add(new Parent("Super Dad",167));

        employees.add(new GasStationAttendant("Joe Smith",10));
        employees.add(new GasStationAttendant("Tony Baloney",100));
        employees.add(new GasStationAttendant("Benjamin Franklin",100));
        employees.add(new GasStationAttendant("Mary Fairy",101));
        employees.add(new GasStationAttendant("Bee See",1));

        hockeyPlayers=new ArrayList<>();
        hockeyPlayers.add(new HockeyPlayer("Wayne Gretzky",894));
        hockeyPlayers.add(new HockeyPlayer("Who Ever",0));
        hockeyPlayers.add(new HockeyPlayer("Brent Gretzky",1));
        hockeyPlayers.add(new HockeyPlayer("Pavel Bure",437));
        hockeyPlayers.add(new HockeyPlayer("Jason Bourne",0));

        professors=new ArrayList<>();
        professors.add(new Professor("Albert Einstein","Physics"));
        professors.add(new Professor("Alan Turing","Computer Systems"));
        professors.add(new Professor("Richard Feynman","Physics"));
        professors.add(new Professor("Tim Berners-Lee","Computer Systems"));
        professors.add(new Professor("Kurt Godel","Logic"));

        parents=new ArrayList<>();
        parents.add(new Parent("Tiger Woods",1));
        parents.add(new Parent("Super Mom",168));
        parents.add(new Parent("Lazy Larry",20));
        parents.add(new Parent("Ex Hausted",168));
        parents.add(new Parent("Super Dad",167));

        gasStationAttendants=new ArrayList<>();
        gasStationAttendants.add(new GasStationAttendant("Joe Smith",10));
        gasStationAttendants.add(new GasStationAttendant("Tony Baloney",100));
        gasStationAttendants.add(new GasStationAttendant("Benjamin Franklin",100));
        gasStationAttendants.add(new GasStationAttendant("Mary Fairy",101));
        gasStationAttendants.add(new GasStationAttendant("Bee See",1));

        all=new ArrayList<>();
        all.add(hockeyPlayers);
        all.add(professors);
        all.add(parents);
        all.add(gasStationAttendants);
    }


    @Override
    public String toString() {
        String fin="";
        for (int i=0;  i<employees.size(); i++){
            fin+=employees.get(i)+"\n";
            if(i<employees.size()-1 && employees.get(i).getClass()!=employees.get(i+1).getClass()){
                fin+="\n";
            }
        }
        return fin;
    }

    public List<HockeyPlayer> getHockeyPlayers() {
        return hockeyPlayers;
    }


    /**
     * the belows print*** is return the details of the regarding array list,
     * @return string with details of the regarding array list that contain of employee class
     */
    public String printHockeyPlayers() {
        String fin="";
        for (int i=0;  i<hockeyPlayers.size(); i++){
            fin+=hockeyPlayers.get(i)+"\n";
        }
        return fin;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public String printProfessors() {
        String fin="";
        for (int i=0;  i<professors.size(); i++){
            fin+=professors.get(i)+"\n";
        }
        return fin;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public String printParents() {
        String fin="";
        for (int i=0;  i<parents.size(); i++){
            fin+=parents.get(i)+"\n";
        }
        return fin;
    }

    public List<GasStationAttendant> getGasStationAttendants() {
        return gasStationAttendants;
    }

    public String printGasStationAttendant() {
        String fin = "";
        for (int i = 0; i < gasStationAttendants.size(); i++){
            fin+=gasStationAttendants.get(i)+"\n";
        }
        return fin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employees employees1 = (Employees) o;

        return employees.equals(employees1.employees);
    }

    @Override
    public int hashCode() {
        return employees.hashCode();
    }


    /**
     * printing out the different employees, which divived by "-----"
     * they consider the same with below critiriea;
     * true if they are the same class;
     * true	for	HockeyPlayers	if	and	only	if	they	score	the	same
     * true	for	Professors	if	and	only	if	they	teach	the
     * true	for	Parents	if	and	only	if	they	parent	the	same
     * true	for	GasStationAttendants	if	and	only	if	they	steal	th
     * @return employees that behaves the same;
     */
    public String printTheSameType(){
        String fin="";
        String classname="";
        Collections.sort(hockeyPlayers);
        Collections.sort(professors);
        Collections.sort(parents);
        Collections.sort(gasStationAttendants);

        for (int i=0; i<all.size(); i++){
            classname=all.get(i).get(i).getClass().getSimpleName();
            fin+="\n";
            fin+=classname +":";
            fin+="\n\n";

            for (int q=0; q<all.get(i).size(); q++){

            fin +=all.get(i).get(q)+"\n";

            if ( q<all.get(i).size()-1 && !all.get(i).get(q).equals(all.get(i).get(q+1)))
                fin+="--------------------------------------------------------------------------------\n";

            }
            fin+="--------------------------------------------------------------------------------\n";


        }

        return fin;
    }


}
