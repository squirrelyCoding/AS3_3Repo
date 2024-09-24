public class App {
    public static void main(String[] args) throws Exception {
        
        //creates new instance of skill for the hard skill "programming"
        skills programming = new hardSkills("Programming", 6);
        programming.whatSkill();

        //creates new instance of skill for the soft skill "communication"
        skills communication = new softSkills("Communication", 9);
        communication.whatSkill();

        //creates new instance of skill for the gift skill "mercy"
        skills mercy = new giftSkills("Mercy", 10);
        mercy.whatSkill();

        //creates new instance of skill for the talent skill "organization"
        skills organization = new talentSkills("Organization", 3);
        organization.whatSkill();
    }
}
