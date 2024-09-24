public class softSkills extends skills {
    
    public softSkills(String name, int skillLevel){
        super(name, "soft", skillLevel);
    }

    public void whatSkill() {
        System.out.println("The " + skillType + " skill of " + getName() + " has a skill level of " + getSkillLevel());
    }
}