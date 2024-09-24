public class App {
    public static void main(String[] args) throws Exception {
        skills programming = new hardSkills("Programming", 6);
        programming.whatSkill();

        skills communication = new softSkills("Communication", 9);
        communication.whatSkill();

        skills mercy = new giftSkills("Mercy", 10);
        mercy.whatSkill();

        skills organization = new talentSkills("Organization", 3);
        organization.whatSkill();
    }
}
