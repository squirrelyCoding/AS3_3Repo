public class giftSkills extends skills {
    
    public giftSkills(String name, int skillLevel){
        super(name, "gift", skillLevel);
    }

    public void whatSkill() {
        System.out.println("The " + skillType + " skill of " + getName() + " has a skill level of " + getSkillLevel());
    }
}