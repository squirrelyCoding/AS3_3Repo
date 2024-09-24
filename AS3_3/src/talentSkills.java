public class talentSkills extends skills {
    
    public talentSkills(String name, int skillLevel){
        super(name, "talent", skillLevel);
    }

    public void whatSkill() {
        System.out.println("The " + skillType + " skill of " + getName() + " has a skill level of " + getSkillLevel());
    }
}